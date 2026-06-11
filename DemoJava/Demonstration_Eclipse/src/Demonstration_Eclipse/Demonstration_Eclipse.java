package Demonstration_Eclipse;

import java.lang.*;
import java.math.*;
import java.util.*;

public class Demonstration_Eclipse
{
	//-- attributs --//
	//-- visibilité
	public int varA1;		//-> public
	private int varA2;		//-> privé
	protected int varA3;	//-> protégé
	
	//-- énumération --//
	//-- complexe
	public enum e_MYBALLS 
	{
	    // 1. Déclarer les constantes avec leurs valeurs entre parenthèses
	    ABDULALILSHISHA(1), RHALIDKASHMIRI(2); // Séparés par des virgules, avec un point-virgule à la fin !

	    // 2. Créer une variable pour stocker la valeur
	    private final int ballSack;

	    // 3. Créer le constructeur (toujours privé ou package-private dans un enum)
	    e_MYBALLS(int ballSack) 
	    {
	        this.ballSack = ballSack;
	    }

	    // 4. Créer un "getter" pour pouvoir récupérer cette valeur plus tard
	    public int getValeur() 
	    {
	        return ballSack;
	    }
	}
	
	//-- basique
	public enum e_YARIS
	{
		bigBlock, bigCock;
	}
	
		//-> visibilité -> public

	public static void main(String[] args)
	{
		//-- types primitifs --//
		//-- entier
		byte varByte; 	//-> 1 octet
		short varShort; //-> 2 octets -> valeur numérique
		char varChar; 	//-> caractère -> unicode
		
		int varInt; 	//-> 4 octets
		long varLong;	//-> 8 octets
		
		//-- réel
		float varF; 	//-> 4 octets
		double varD; 	//-> 8 octets
		
		//-- autre --//
		boolean varB; 	//-> 1 octet
			//-> énumération -> déclaration
		e_MYBALLS varEnum = e_MYBALLS.ABDULALILSHISHA;
		
		varInt = varEnum.getValeur();
		
		//-- Objet --//
		String maChaine = "Hello World";	//-> Chaîne de caractère
		Scanner monClavier = new Scanner(System.in);	//-> Objet lié au clavier
		
		//-- Exemple assignation sur variable primaire --//
		varB = true;	//-> Assignation sur un booléen
		
		//-- Assignation d'un caractère --//
		varChar = 'A';		//-> Caractère
		varChar = '\u0043';	//-> Unicode
		
		//-- Cast -> entier à entier -> petit à grand --//
		varByte = (byte)0xFF;		//-> Cst numérique -> byte
		varChar = (char)varByte;	//-> byte -> char
		varShort = (short)0xFFFF;	//-> Cst numérique -> short
		varInt = varShort;			//-> short -> entier
		
		//-- Cast cst numérique -> float --//
		varF = 3.14F;
		varF = (float)3.14;
		varD = 3.14;
		varD = Math.PI;
		
		//-- Affichage en mode console --//
			//-> Exemple chaîne de caractère manuelle avec retour à la ligne automatique
		System.out.print("\n" + maChaine);
		System.out.print("\n");
		System.out.println("-> demo <-");
		
		System.out.println("Valeur Boolean : " + varB);
		System.out.println("Valeur Entier : " + varByte);
		System.out.println("Valeur Reel : " + varD);
		
		System.out.printf("Valeur PI avec 3 décimales : %.3f", Math.PI);
		
		System.out.printf("\n Format hexa %x",  varInt); //-> Hexadéciaml
		System.out.printf("\n Format octal %o",  varInt); //-> Octal
		
		maChaine = Integer.toBinaryString(varInt);
		System.out.printf("\n Format binaire ob%s", varInt); //-> Binaire
		
		//-- Récupération information du clavier --//
		//-> Chaîne de caractères
		System.out.print("\n Insérer une valeur entière : ");
		maChaine = monClavier.next(); //-> Chaîne de caractère
		
		//-> entier
		System.out.print("Insérer une valeur entière : ");
		varInt = monClavier.nextInt();
		
		//-> float
		System.out.print("Insérer une valeur réelle : ");
		
		try
		{
			varD = monClavier.nextDouble();
		}
		catch(Exception data)
		{
			System.out.println(data.getLocalizedMessage());
			System.out.println(data.getMessage());
		}
		finally
		{
			monClavier.useLocale(Locale.ENGLISH);
			varD = monClavier.nextDouble();
		}
		
		if(varD == 3.14)
		{
			System.out.println("Exception levee !!!");
		}
		
		// TODO Auto-generated method stub
		
	}

}
