package Ex_5;

import java.util.Scanner;

class Point
{
	private double x;
	private double y;
	
	public void afficherPoint()
	{
		System.out.print("X = " + x + " Y = " + y);
	}
	
	public void setXY(double valX, double valY)
	{
		this.x = valX;
		this.y = valY;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
}

abstract class Figure
{
	protected Point[] pairePoints;
	protected static Scanner scanner = new Scanner(System.in);
	
	public Figure()
	{
		pairePoints = new Point[2];
		pairePoints[0] = new Point();
		pairePoints[1] = new Point();
		
		pairePoints[0].setXY(0, 0);
		pairePoints[1].setXY(0, 0);
		
		System.out.println("Constructeur de Figure");
	}
	
	public abstract void effectuerSaisie(int noPoint);
	public abstract void dessiner();
	
	// Simulation du destructeur C++
	public void supprimer()
	{
		System.out.println("Destructeur de Figure");
	}
}

class Ligne extends Figure
{
	public Ligne()
	{
		super();
		System.out.println("constructeur de Ligne");
	}
	
	@Override
	public void effectuerSaisie(int noPoint)
	{
		if(noPoint == 1)
		{
			System.out.println("Entrez position X et Y du debut de la ligne :");
		}
		else if(noPoint == 2)
		{
			System.out.println("Entrez position X et Y de la fin de la ligne :");
		}
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		pairePoints[noPoint - 1].setXY(x, y);
	}
	
	@Override
	public void dessiner()
	{
		System.out.println("Dessin d'une Ligne");
		System.out.print("Debut de la ligne");
		pairePoints[0].afficherPoint();
		System.out.println();
		
		System.out.print("Fin de la ligne");
		pairePoints[1].afficherPoint();
		System.out.println();
	}
	
	@Override
	public void supprimer()
	{
		System.out.println("Destructeur de Ligne");
		super.supprimer();
	}
}

class Rectangle extends Figure
{
	public Rectangle()
	{
		super();
		System.out.println("Constructeur de Rectangle");
	}
	
	@Override
	public void effectuerSaisie(int noPoint)
	{
		if(noPoint == 1)
		{
			System.out.println("Entrez position X et Y du coin haut gauche du rectangle :");
		}
		else if(noPoint == 2)
		{
			System.out.println("Entrez position X et Y du coin bas droite du rectangle :");
		}
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		pairePoints[noPoint - 1].setXY(x, y);
	}
	
	@Override
	public void dessiner()
	{
		System.out.println("Dessin d'un Rectangle");
		System.out.print("Position du coin haut gauche du rectangle ");
		pairePoints[0].afficherPoint();
		
		System.out.print("Position du coin bas droite du rectangle ");
		System.out.println();
	}
	
	@Override
	public void supprimer()
	{
		System.out.println("Destructeur de Rectangle");
		super.supprimer();
	}
}

class Ellipse extends Figure
{
	public Ellipse()
	{
		super();
		System.out.println("Constructeur de Ellipse");
	}
	
	@Override
	public void effectuerSaisie(int noPoint)
	{
		if(noPoint == 1)
		{
			System.out.println("Entrez position X et Y du coin haut gauche du rectangle enveloppant l'Ellipse :");
		}
		else if(noPoint == 2)
		{
			System.out.println("Entrez position X et Y du coin bas droite du rectangle enveloppant l'Ellipse :");
		}
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		pairePoints[noPoint - 1].setXY(x, y);
	}
	
	@Override
	public void dessiner()
	{
		System.out.println("Dessin d'une Ellipse");
		System.out.print("Position du coin haut gauche du rectangle enveloppant l'Ellipse");
		pairePoints[0].afficherPoint();
		System.out.println();
		
		System.out.print("Position du coin bas droite du rectangle enveloppant l'Ellipse");
		pairePoints[1].afficherPoint();
		System.out.println();
	}
	
	@Override
	public void supprimer()
	{
		System.out.println("Destructeur de Ellipse");
		super.supprimer();
	}
}

class Dessinateur
{
	private char m_FigureChoisie;
	private Figure maFigure;
	
	public void construireFigure(char choix)
	{
		this.m_FigureChoisie = choix;
		
		if(choix == 'L')
		{
			maFigure = new Ligne();
		}
		else if(choix == 'R')
		{
			maFigure = new Rectangle();
		}
		else if(choix == 'E')
		{
			maFigure = new Ellipse();
		}
	}
	
	public void saisirPositionXY(int noPoint)
	{
		if(maFigure != null)
		{
			maFigure.effectuerSaisie(noPoint);
		}
	}
	
	public void dessinerFigure()
	{
		if(maFigure != null)
		{
			maFigure.dessiner();
		}
	}
	
	public void supprimerFigure()
	{
		if(maFigure != null)
		{
			maFigure.supprimer();
			maFigure = null;
		}
	}
}

public class Main 
{
	public static void main(String[] args)
	{
		System.out.println("Cours SL228 POBJ CPP exercice 5 (Version Java)");
		
		Dessinateur dessinateurA = new Dessinateur();
		Dessinateur dessinateurB = new Dessinateur();
		Dessinateur dessinateurC = new Dessinateur();
		
		dessinateurA.construireFigure('L');
		dessinateurA.saisirPositionXY(1);
        dessinateurA.saisirPositionXY(2);
        dessinateurA.dessinerFigure();
        dessinateurA.supprimerFigure();

        dessinateurB.construireFigure('R');
        dessinateurB.saisirPositionXY(1);
        dessinateurB.saisirPositionXY(2);
        dessinateurB.dessinerFigure();
        dessinateurB.supprimerFigure();

        dessinateurC.construireFigure('E');
        dessinateurC.saisirPositionXY(1);
        dessinateurC.saisirPositionXY(2);
        dessinateurC.dessinerFigure();
        dessinateurC.supprimerFigure();
        
        System.out.println("Entrez pour quitter !");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        sc.close();
	}
}
