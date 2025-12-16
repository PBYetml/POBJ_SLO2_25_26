//-----------------------------------------------------------------------------------//
// Nom du projet 		: POBJ DEMO C++
// Nom du fichier 		: user.cpp
// Date de création 	: 12.03.2024
// Date de modification : xx.xx.20xx
//
// Auteur 				: Philou (Ph. Bovey)
//
// Description          : 
//
// Remarques :          : /!\ membres static doivent être initialisé comme une 
//						  "variable globale" dans un fichier sinon cela ne marche pas 
//----------------------------------------------------------------------------------//

//-- lib standardisé 
#include <iostream>

//-- lib perso 
#include "user.h"


short user::LIM_MAX = 0; 
short user::LIM_MIN = 0; 


//----------------------------------------------------------------------------------//
// Nom de la méthode	: user
// Entrée				: limitmax	-> entier -> 16bits -> signé 
//						  limitmin	-> entier -> 16bits -> signé 
//						  limitmin	-> entier -> 16bits -> signé 
// Sortie				: -
// in-out				: - 
// Description			: constructeur -> met à jour des constantes lié à la class 
// Date modfification	: le 12.03.2024 
// Remarque				: 
//----------------------------------------------------------------------------------//
user::user(short limitmax, short limitmin) : LIMIT_MAX_USER(limitmax), LIMIT_MIN_USER(limitmin)
{
	
}

//----------------------------------------------------------------------------------//
// Nom de la méthode	: GetNumberValue
// Entrée				: 
// Sortie				: -> reel -> 4bytes 
// in-out				: - 
// Description			:  
// Date modfification	: le 12.03.2024 
// Remarque				: 
//----------------------------------------------------------------------------------//
float user::GetNumberValue()
{
	//-- déclaration  de variable --// 
	float valR = 0.0 ;

	std::cout << "entrer valeur : "; 

	std::cin >> valR; 

	return valR; 
}


//----------------------------------------------------------------------------------//
// Nom de la méthode	: ValiderValUser
// Entrée				: 
// Sortie				: -> reel -> 4bytes 
// in-out				: - 
// Description			:  
// Date modfification	: le 12.03.2024 
// Remarque				: 
//----------------------------------------------------------------------------------//
bool user::ValiderValUser(float valATester) 
{
	//-- déclaration variable --// 
	bool verif; 
	int valCast;

	std::string tbMessage[10] = { "champs1", "champs2" }; 
 
	e_MessageUser message = msg2; 


	if ((valATester >= LIMIT_MIN_USER) && (valATester <= LIMIT_MAX_USER))
	{
		valCast = (int)valATester;

		if (((float)valCast - valATester) == 0.0)
		{
			valUser_m = valATester;
			/*user::valUser_m = valATester;
			this->valUser_m = valATester; */
			verif = true;
			return true; 
		}
		else
		{
			user::AfficherMsgUser(message); 
		}
		//	verif = false;
	}
	else 
	{
		user::AfficherMsgUser(message);
		std::cout << tbMessage[message]; 
	}
	//	verif = false; 
	

	return false; 
}



//----------------------------------------------------------------------------------//
// Nom de la méthode	: ValiderValUser
// Entrée				: 
// Sortie				: -> reel -> 4bytes 
// in-out				: - 
// Description			:  
// Date modfification	: le 12.03.2024 
// Remarque				: 
//----------------------------------------------------------------------------------//
void user::AfficherMsgUser(e_MessageUser codeMsg)
{
	switch (codeMsg)
	{
		case msg1 : 
			std::cout << "inserer valeur : "; 
			break; 
		case msg2 :
			std::cout << "Erreur valeur non valide" << std::endl; 
			break; 
		case msg3 : 
			std::cout << "valeur valider" << std::endl; 
			break; 

		default:
		break;
	}

}




/*void AfficherMsgUser(int codeMsg);
float GetNumberValue();
void SetNumberValue(float valUser);
bool ValiderValUser(float valATester); */ 


//----------------------------------------------------------------------------------//
// Nom de la méthode	: FctDemoStatique
// Entrée				: 
// Sortie				:  
// in-out				: 
// Description			:  
// Remarque				: 
//----------------------------------------------------------------------------------//
void user::FctDemoStatique(char min, char max)
{
	//-- instanciation de valeur à des cst --// 
	user::LIM_MIN;
	user::LIM_MAX; 
	
	//-- 
	for (char increment = user::LIM_MIN; increment < user::LIM_MAX; increment)
	{
		increment++; 
	}
	
}


/*void FctDemoStatique(char min, char max)
{
	//-- instanciation de valeur à des cst --// 
	/*user::LIM_MIN = min;
	user::LIM_MAX = max; 

	//-- 
	for (char increment = user::LIM_MIN; increment < user::LIM_MAX; increment)
	{
		increment++;
	}
}*/

