//-----------------------------------------------------------------------------------//
// Nom du projet 		: code BCD
// Nom du fichier 		: conversionBCD.java
// Date de création 	: 22.04.2026
// Date de modification : xx.xx.202x
//
// Auteur 				: Philou (Ph. Bovey)
//
// Description          : -> voir la donnee du CDC 
//
// Remarques 			:            
//----------------------------------------------------------------------------------//
//-- libariairie associée à cette class

//-- déclaration de la class conversionBCD
class ConversionBCD extends conversionNumerique
{
	//-- déclaration des attributs propres à la class conversionBCD 
	
	//----------------------------------------------------------------------------------//
	//-- déclaration des méthodes propres à la class conversionBCD
	//----------------------------------------------------------------------------------//
	// Nom de la méthode	: conversionBCD 
	// Entrée				: 
	// Sortie				: 
	// Visibilité 			: public 
	// Description			: constructeur -> voir la donnee du CDC 
	// Date modfification	: le 22.04.2026 
	// Remarque				: si constructeur surchargé - il faut définir le constructeur 
	//						  par défaut 
	//----------------------------------------------------------------------------------//
	public ConversionBCD()
	{
		//!! ne fait rien !!
	}
	
	
	//----------------------------------------------------------------------------------//
	// Nom de la méthode	: conversionBCD 
	// Entrée				: choixCodage	-> entier	-> enumération : e_codageBinaire
	//						  valUser		-> reel		-> 4 octets  
	// Sortie				: 
	// Visibilité 			: public 
	// Description			: constructeur surchargé -> voir la donnee du CDC 
	// Date modfification	: le 22.04.2026 
	// lien(s) utile(s) 	: -> méthode super 
	// https://codegym.cc/fr/groups/posts/fr.655.super-mot-cle-en-java                  
	//----------------------------------------------------------------------------------//

	public ConversionBCD (e_codageBinaire choixCodage)
	{
		//-- test le codage BCD a été choisi --//
		if(choixCodage == e_codageBinaire.BCD)
		{
			//-- appel de la fct : CalculerNbrDigitEntier 
			CalculerNbrDigitEntier(valUser);
			
			//-- instanciation du tableau m_tbDigitEntier avec l'information du nombre 
			//   digit déterminer au-dessus 
			// int tableau[] m_tbDigitEntier, m_nbrDigitMaxValEntier;
			
			//-- appel de la fct : RecupererDigitEntier 
			RecupererDigitEntier(valUser);
			
			//-- appel de la fct : ConversionBinaire
			super.ConversionBinaire();
		}
		else
		{
			// Ne rien faire
		}
	}
	
	//----------------------------------------------------------------------------------//
	// Nom de la méthode	: supprimer
	// Entrée				: 
	// Sortie				: 
	// Visibilité 			: public 
	// Description			: destructeur -> voir le CDC
	// Date modfification	: le 22.04.2026 
	// Remarque				: 
	//----------------------------------------------------------------------------------//

	public void supprimer()
	{
		//!! ne fait rien !!
	}
	
	//----------------------------------------------------------------------------------//
	// Nom de la méthode	: CalculerNbrDigitEntier 
	// Entrée				: valUser	-> reel		-> 4 octets  
	// Sortie				: nbrDigit	-> entier	-> 8bits	
	// Visibilité 			: protected (polymorphisme de la méthode parent)  
	// Description			: -> voir le CDC 
	// Date modfification	: le 22.04.2026 
	// Remarque				: possibilité d'utiliser la méthode pow de la class Math 
	// lien(s) utile(s)     : pow 
	// https://codegym.cc/fr/groups/posts/utilisation-de-la-mthode-mathpow-en-java
	//----------------------------------------------------------------------------------//
	protected byte CalculerNbrDigitEntier (float valUser)
	{
		//-- déclaration de variables --//
		int valeur = (int)valUser;
		int i;
		int resultInter;
		int finalResult;
		
		// Interation pour connaitre le nbr de digits sur une valeur entiere
		// fin de boucle -> egal a 0
		for(i = 0; i = valeur; i++)
		{
			// Algorithme pour determiner le nbr de digits
			//-- division de la valeur entière par des puissance de 10 : 10^0 => (1), 10^1 => (10), 10^2 => (100) ..
			resultInter = valeur / 10^i;
			//-- et MAJ de la valeur entière
			valeur = resultInter;
			if(valeur >= 0)
			{
				//-- MAJ du Digit => incrément de 1 --//
				finalResult++;
			}
		}
		
		//-- MAJ de l'attribut parent -> m_nbrDigitMaxValEntier
		m_nbrDigitMaxValEntier = (byte)finalResult;
		
		return m_nbrDigitMaxValEntier;
	}
		 
	//----------------------------------------------------------------------------------//
	// Nom de la méthode	: RecupererDigitEntier 
	// Entrée				: valUser		-> reel		-> 4 octets  
	// Sortie				: 
	// Visibilité 			: protected (polymorphisme de la méthode parent)   
	// Description			: -> voir le CDC
	// Date modfification	: le 22.04.2026 
	// Remarque				: possibilité d'utiliser la méthode pow de la class Math 
	// lien(s) utile(s)     : pow 
	// https://codegym.cc/fr/groups/posts/utilisation-de-la-mthode-mathpow-en-java
	//----------------------------------------------------------------------------------//
	protected void RecupererDigitEntier(float valUser)
	{
		//-- déclaration variable --// 
		int valeur = (int)valUser;
		int i;
		int resultInter = 0;
		int finalResult;
		
		// Iteration pour remplir le tableau de digits
		for(i = 0; i = valeur; i++)
		{
			// Algorithme pour recuperer chaque digits
			//-- MAJ facteur de puissance de 10 --// 
			resultInter = valeur / 10^i;
			
			// MAJ tableau -> digit
			resultInter = m_tbDigitEntier[i];
			
		}
		
		//-- MAJ valeur utilisateur
		finalResult  = resultInter;
		
		valUser = finalResult;
	}		
}