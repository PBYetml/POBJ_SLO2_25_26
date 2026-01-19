// Fichier Ex5.cpp
// Programme principal pour utiliser Dessinateur et Figure

#include <iostream>
using namespace std; 

#include "Dessinateur.h"

int main(void)
{
	char Rep;
	
	cout << "Cours SL228_POBJ CPP exercice 5" << endl;
	
	// Déclaration et création des dessinateurs
	Dessinateur DessinateurA;
	Dessinateur DessinateurB;
	Dessinateur DessinateurC;

	//-- Pour le DessinateurA --//
	DessinateurA.ConstruireFigure('L'); // Pour utiliser une Ligne

	DessinateurA.SaisirPositionXY(1);
	DessinateurA.SaisirPositionXY(2);

	DessinateurA.DessinerFigure();

	DessinateurA.SupprimerFigure();

	//-- Pour le DessinateurB --//
	DessinateurB.ConstruireFigure('R'); // Pour utiliser un rectangle

	DessinateurB.SaisirPositionXY(1);
	DessinateurB.SaisirPositionXY(2);

	DessinateurB.DessinerFigure();

	DessinateurB.SupprimerFigure();

	//-- Pour le DessinateurC --//
	DessinateurC.ConstruireFigure('E'); // Pour utiliser une ellipse

	DessinateurC.SaisirPositionXY(1);
	DessinateurC.SaisirPositionXY(2);

	DessinateurC.DessinerFigure();

	DessinateurC.SupprimerFigure();

	cout << "Entrez Q pour quitter !" << endl;
	cin >> Rep;
	return 0;
}

