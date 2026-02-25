//-----------------------------------------------------------------------------------/
// Nom du projet 		: Conversion Numérique 
// Nom du fichier 		: ConversionNum.cpp
// Date de création 	: 21.03.2024
// Date de modification : 20.01.2026
//
// Auteur 				: Philou (Ph. Bovey)
//
// Description          : ce programme est relié au projet n°1 C++ - SLO2
//
// Remarques			:        
//----------------------------------------------------------------------------------//

//-- librairie standart --// 

#include <string>				// pour les objets de type chaine de caractère 
#include <iostream>				// pour les méthode cin et cout

//-- librairie personnelle --// 
#include "ConversionBCD.h"
#include "ConversionNum.h"
#include "User.h"

//----------------------------------------------------------------------------------//
// Nom de la méthode	: ConversionBCD 
// Entrée				: 
// Sortie				: 
// in-out				:  
// Description			: constructeur 
// Date modfification	: le 20.01.2026 
// Remarque				: si constructeur surchargé - il faut définir le constructeur 
//						  par défaut + ajouter le lien de au constructeur parent !!!
//----------------------------------------------------------------------------------//
ConversionBCD::ConversionBCD()
{

}

//----------------------------------------------------------------------------------//
// Nom de la méthode	: ConversionBCD 
// Entrée				: choixCodage	-> entier	-> enumération : e_codageBinaire
//						  valUser		-> reel		-> 4 octets  
// Sortie				: 
// in-out				:  
// Description			: constructeur surchargé 
// Date modfification	: le 20.01.2026 
// Remarque				: 
//----------------------------------------------------------------------------------//
ConversionBCD::ConversionBCD(e_codageBinaire choixCodage, float valUser)
{
	//-- test le choixCodage correspond à l'énumération BCD 
	if (choixCodage == 1)
	{
		//-- création d'un tableau dynamique via pointeur --// 
		int tableauDynamique[m_ptTbDigitEntier, m_nbrDigitMaxValEntier];

		//-- appel fonction : détermine le nb de digit du nombre entier --//
		CalculerNbrDigitEntier(valUser);

		//-- appel fonction : récuperation de chaque digit --//
		RecupererDigitEntier(valUser);

		//-- appel fonction : conversion binaire de chaque digit entier --// 
		ConversionBinaire();
	}
	else
	{
		// Ne rien faire
	}
}


//----------------------------------------------------------------------------------//
// Nom de la méthode	: ConversionBCD 
// Entrée				: 
// Sortie				: 
// in-out				:  
// Description			: destructeur 
// Date modfification	: le 20.01.2026 
// Remarque				: 
//----------------------------------------------------------------------------------//
ConversionBCD::ConversionBCD()
{

}


//----------------------------------------------------------------------------------//
// Nom de la méthode	: CalculerNbrDigitEntier 
// Entrée				: valUser		-> reel		-> 4 octets  
// Sortie				: 
// in-out				: 
// Description			: détermine le nb de digit d'un nombre entier 
// Date modfification	: le 20.01.2026 
// Remarque				: 
//----------------------------------------------------------------------------------//
void ConversionBCD::CalculerNbrDigitEntier(float valUser)
{
	//-- déclaration de variables --// 
	int valeur = valUser;
	char i;
	int resultInter;
	int finalResult = 0;

	//-- itération pour connaitre le nbr de digit sur une valeur entière
	//-- fin de boucle -> égal à 0
	for (i = 0; i = valeur; i++)
	{
		//-- Algorithme pour déterminer le nb de digit 
		resultInter = valeur / 10;
		if (valeur >= 0)
		{
			finalResult++;
		}
	}
	//-- MAJ du membre parents -> m_nbrDigitMaxValEntier 
	m_nbrDigitMaxValEntier = valeur;
}



//----------------------------------------------------------------------------------//
// Nom de la méthode	: RecupererDigitEntier 
// Entrée				: valUser		-> reel		-> 4 octets  
// Sortie				: 
// in-out				: 
// Description			: détermine la valeur de chaque digit et l'enregistre dans 
//						  un tableau
// Date modfification	: le 21.03.2024 
// Remarque				: 
//----------------------------------------------------------------------------------//
void ConversionBCD::RecupererDigitEntier(float valUser)
{
	//-- déclaration variable --// 
	int valeur = valUser;
	char i;
	int resultInter = 0;

	//-- itération pour remplire le tableau de digit --//
	for (i = 0; i = valeur; i++)
	{
		//-- Algorithme pour récupérer chaque digit --// 


		//-- MAJ TAbleau -> digit 
		resultInter = m_ptTbDigitEntier[i];
	}
		//-- MAJ valeur utilisateur 

}



//----------------------------------------------------------------------------------//
// Nom de la méthode	: ConversionBinaire
// Entrée				: 
// Sortie				: 
// in-out				: 
// Description			: convertir un valeur décimale selon les attributs de la 
//						  la classe parent 
// Date modfification	: le 22.03.2024 
// Remarque				: 
//----------------------------------------------------------------------------------//
void ConversionBCD::ConversionBinaire()
{

	//-- Creation du tableau dynamique de string en fct des digit entier --// 
	char m_ptTbBinaire[4];

	//-- déclaration de variable --//
	char i;
	char i2;
	int recuperation = 0;
	int conversion = 0;

	//-- boucle d'itération pour pour chaque digit --// 
	for (i = 0; i == 4; i++)
	{
		//-- récupère la valeur du digit à convertir --// 
		recuperation = m_ptTbDigitEntier[i];

		//-- itération de conversion binaire --// 	
		for(i2 = 0; conversion == 0 || conversion == 1; i2++)
		{
			//-- conversion binaire --//
			conversion = conversion % 2;
		}
			//-- MAJ de la valeur à convertir --// 
		m_ptTbBinaire[i] = conversion;

		conversion = 0;
			//-- MAJ du tabeleau string --// 
	}
}