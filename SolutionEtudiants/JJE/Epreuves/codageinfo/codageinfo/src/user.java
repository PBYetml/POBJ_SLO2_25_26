//-----------------------------------------------------------------------------------//
// Nom du projet 		: code BCD
// Nom du fichier 		: user.java
// Date de création 	: 20.04.2026
// Date de modification : 23.04.2026
//
// Auteur 				: Philou (Ph. Bovey)
//
// Description          : 
//
// Remarques 			:            
//----------------------------------------------------------------------------------//
//-- libariairie associée à cette class 
import java.lang.*;
import java.util.Scanner; 
import java.util.*;


public class user 
{
	//-- attribut --// 
	//-> type primitif 
	//--> visibilité -> private  
	private final short CST_VAL_LIMIT_MAX; 
	private final short CST_VAL_LIMIT_MIN; 
	
	//--> visibilité -> protected  
	protected float valUser_m; 
	
	//-> énumération basique --//
	//--> visibilité -> public
	public enum e_MsgInfo {message1, message2, message3, message4};		
	
	//-- objet --// 
	//-> conversion numérique 
	public conversionNumerique objetConversionNum;  
	

	
	//-- méthode --
	//----------------------------------------------------------------------------------//
	//Nom de la méthode		: user - ATTENTION -> constructeur
	//Entrée				: limiteMax	-> entier	-> 16bits 
	//					      limiteMin	-> entier	-> 16bits 
	//Sortie				: -
	//Description			: permet d'afficher différents msg selon le choix de 
	//						  l'utilsateur 
	//Date modfification	: le 20.04.2026  
	//Remarque				: 
	//----------------------------------------------------------------------------------//	
	public user(short limiteMin, short limiteMax) 
	{
		CST_VAL_LIMIT_MAX = limiteMax; 
		CST_VAL_LIMIT_MIN = limiteMin; 
	}
	
	//----------------------------------------------------------------------------------//
	//Nom de la méthode		: AfficherMsgUser
	//Entrée				: msg	-> enumération	-> e_MsgInfo (class User) 
	//Sortie				: -
	//Description			: permet d'afficher différents msg selon le choix de 
	//						  l'utilsateur 
	//Date modfification	: le 20.04.2026 
	//Remarque				: 
	//----------------------------------------------------------------------------------//
	public void AfficherMsgUser(e_MsgInfo msg)
	{
		//-- condition d'affichage --// 
		//-> switch case 
		switch (msg)
		{
			//-- msg 1 : 
			case message1 : 
				System.out.println("Inserez un nombre (ex: 3.00)  : ");
				break; 
			//-- msg 2 : 
			case message2 : 
				System.out.println("!! Erreur !! -> valeur hors limite"); 
				break; 
			//-- msg 3 : 
			case message3 : 
				System.out.println("!! Erreur !! -> valeur entière "); 
				break; 
			default : 
				break; 
		}
	}
	
	//----------------------------------------------------------------------------------//
	//Nom de la méthode		: GetNumberValue
	//Entrée				: -
	//Sortie				: valUser_m -> reel -> attribut privé 
	//Description			: permet d'obtenir un attribut specifique de la class USER
	//Date modfification	: le 20.04.2026  
	//Remarque				: 
	//----------------------------------------------------------------------------------//
	public float GetNumberValue()
	{
		return valUser_m; 
	}
	
	//----------------------------------------------------------------------------------//
	//Nom de la méthode		: SetNumberValue
	//Entrée				: -
	//Sortie				: -
	//Description			: récupère une valeur numérique (entier ou réel) 
	//Date modfification	: le 20.04.2026 
	//Remarque				: 
	//----------------------------------------------------------------------------------//
	public float SetNumberValue()
	{
		//-- déclaration variables --// 
		float valConvReel = (float)0.0; 

		//-- déclaration d'objet --//
		String valUser; 
		Scanner  infoClavier; 
		
		//-> instanciation de l'objet 
		infoClavier = new Scanner(System.in);
		
		//-- récupération info clavier --//
		//- configuration du mode d'écriture -> différence pour l'écriture d'un nombre réel : 3,14 (java standart) -> 3.14 
		infoClavier.useLocale(Locale.ENGLISH); 
	
		//-> récupération d'une chaine de caractère 
		valUser = infoClavier.nextLine(); 
		
		//-> convertion d'une chaine caractère en float ou entier --// 
		try 
		{
			//-- conversion string en float --// 
			valConvReel = Float.parseFloat(valUser);  
		}
		catch (Exception data)
		{
			System.out.println("!! Exception levée !!"); 
			System.out.println(data.getLocalizedMessage()); 
			System.out.println(data.getMessage()); 
			
		}
		finally 
		{
			//-- libération de la source Scanner 
			infoClavier.close();
		}
		
		//-- retour de la valeur de l'utilisateur --// 
		return valConvReel; 
	}
	
	//----------------------------------------------------------------------------------//
	//Nom de la méthode	: ValiderValUser
	//Entrée				: valATester	-> reel		-> 4bytes
	//Sortie				: checkValeur	-> entier	-> vrai / faux 
	//Description			: 
	//Date modfification	: le 20.04.2026 
	//Remarque				: 
	//----------------------------------------------------------------------------------//
	public boolean ValiderValUser(float valATester)
	{
		//-- déclaration de variable --//
		boolean checkValeur = false; 

		float difference; 

		//-- test si valATester dans les limites --// 
		if ((valATester < (float)CST_VAL_LIMIT_MAX) && (valATester >= (float)CST_VAL_LIMIT_MIN))
		{
			//-- calcul pour savoir si il y a une différence entre valeur réelle et entière 
			difference = valATester - (int)valATester; 

			//-- test si valeur est entière 
			if (difference == (float)0.0)
			{
				checkValeur = true;
				valUser_m = valATester; 
			}
			else
			{
				//-- message user : non réel 
				this.AfficherMsgUser(e_MsgInfo.message3);
				checkValeur = false;
			}
		}
		else
		{
			//-- message user : hors lîmit 
			this.AfficherMsgUser(e_MsgInfo.message2);
			checkValeur = false;
		}

		return checkValeur;
	}
	
	//----------------------------------------------------------------------------------//
	//Nom de la méthode	: AfficherValConvertie
	//Entrée				: objAConvertir ->	ConversionNumerique	-> objet 
	//Sortie				: 
	//Description			: 
	//Date modfification	: le 22.03.2024 
	//Remarque				: 
	//----------------------------------------------------------------------------------//
	public void AfficherValConvertie(conversionNumerique objAConvertir)
	{
		//-- délcaration variable --// 
		byte iterationDigitNum ;
		byte iterationDigitBin; 
		byte digit; 
		byte[][] valeurAfficher; 
		
		//-- déclaration d'objet --// 
		String affichage_o = new String(); 
		
		//-- récupération chaine de caractère à afficher --// 
		valeurAfficher = objAConvertir.GetTableauBinaire();

		//-- msg user --// 
		System.out.print("valeur BCD : "); 

		//-- affichage de la valeur binaire dans le bon sens --//
		//-- iteration 
		for (iterationDigitNum = 0; iterationDigitNum < objAConvertir.GetNbrDigitEntier(); iterationDigitNum += 1)
		{
			for(iterationDigitBin = 4; iterationDigitBin > 0 ; iterationDigitBin -= 1)
			{
				affichage_o = String.format("%d", (int)valeurAfficher[iterationDigitNum][iterationDigitBin-1]); 
				System.out.print(affichage_o); 
			}
			System.out.print(' ');
		}
		System.out.println();
	}
}
