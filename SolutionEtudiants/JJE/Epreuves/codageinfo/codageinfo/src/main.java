//-----------------------------------------------------------------------------------//
// Nom du projet 		: code BCD
// Nom du fichier 		: main.java
// Date de création 	: 20.04.2026
// Date de modification : 23.04.2026
//
// Auteur 				: Philou (Ph. Bovey)
//
// Description          : 
//
// Remarques 			:            
//----------------------------------------------------------------------------------//

//-- librairie standard --// 
import java.lang.*;

public class main 
{
	//-- constante non lié à la class main --// 
	//-> type primitif 
	//--> byte
	static final byte NUM_PROJ = (byte)01; 
	static final byte VERSION = (byte)01;
	
	//-> objet 
	//--> string 
	static final String INFO_DEV = "votre nom"; 
	
	//-- méthode static -> indépendante d'un class -> ici main // 
	public static void main(String[] args) 
	{
		//-- déclaration type primitif 
		boolean validationValUser; 
		
		float valUser; 
				
		//-- déclaration objet avec assignation 
		String msgProjet = new String(); 
		String msgVersion = new String(); 
		
		user actionUser_o = new user((short)0, (short)100); 
		
		//-- format affichage --> Numéro projet 
		msgProjet = String.format("Projet JAVA %02d - ", (int)NUM_PROJ); 
		
		//-- format affichage --> version projet  
		msgVersion = String.format("Version %02d - ", (int)VERSION); 
		
		//-- Affichage sur la console --// 
		System.out.println(msgProjet + msgVersion + "auteur : " + INFO_DEV);
		
		//-- boucle de validation : valeur utilisateur pour conversion --// 
		do
		{
			//-- affichage du premier message --// 
			actionUser_o.AfficherMsgUser(user.e_MsgInfo.message1);

			//-- recupération d'une valeur réel par l'utilistateur 
			//-- et la tester si rentre dans les critères
			validationValUser = actionUser_o.ValiderValUser(actionUser_o.SetNumberValue());
			
		}while (!validationValUser);

		//-- choix de la conversion avec l'envoi de la valeur de l'utilisateur --// 
		actionUser_o.objetConversionNum = new conversionBCD(conversionNumerique.e_codageBinaire.BCD, actionUser_o.GetNumberValue());

		//-- affichage de la valeur à convertir --//
		actionUser_o.AfficherValConvertie(actionUser_o.objetConversionNum); 
	}

}
