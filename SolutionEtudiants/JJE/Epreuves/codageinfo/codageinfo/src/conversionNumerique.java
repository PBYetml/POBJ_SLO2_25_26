//-----------------------------------------------------------------------------------//
// Nom du projet 		: code BCD
// Nom du fichier 		: conversionNumerique.java
// Date de création 	: 20.04.2026
// Date de modification : xx.xx.202x
//
// Auteur 				: Philou (Ph. Bovey)
//
// Description          : 
//
// Remarques 			:            
//----------------------------------------------------------------------------------//
//-- libariairie associée à cette class 


public class conversionNumerique 
{
	//-- attributs --// 
	//-> type primitif 
	//--> visibilité -> protégé 
	protected byte m_nbrDigitMaxValEntier; 
	protected byte[] m_tbDigitEntier; 
	
	//-> objet 
	//--> visibilité -> protégé 
	protected byte[][] m_tbBinaire;
	
	
	//-> enumération basique 
	//--> visibilité -> public 
	public enum e_codageBinaire
	{
		BINAIRE, BCD, AIKEN 
	}
	
	//-- méthodes --// 
	//----------------------------------------------------------------------------------//
	//Nom de la méthode		: conversionNumerique 
	//Entrée				: 
	//Sortie				: 
	//Description			: constructeur
	//Date modfification	: le 20.04.2026 
	//Remarque				: 
	//----------------------------------------------------------------------------------//
	public conversionNumerique()
	{
		//!! laisser vider -> redéfinie dans les class enfants !!  
	}
	
	//----------------------------------------------------------------------------------//
	//Nom de la méthode	: ConversionNumerique 
	//Entrée				: choixCodage	-> entier	-> enumération : e_codageBinaire
	//						  valUser		-> reel		-> 4 octets  
	//Sortie				:  
	//Description			: constructeur
	//Date modfification	: le 20.04.2026 
	//Remarque				: si constructeur surchargé - il faut définir le constructeur 
	//							  par défaut !!!
	//----------------------------------------------------------------------------------//
	public conversionNumerique(e_codageBinaire choixCodage, float valUser)
	{
		//!! laisser vider -> redéfinie dans les class enfants !! 
	}
	
	//----------------------------------------------------------------------------------//
	//Nom de la méthode		: finalize 
	//Entrée				: 
	//Sortie				: 
	//Description			: destructeur
	//Date modfification	: le 20.04.2026 
	//Remarque				: fonction utiliser pour faire du polymorphisme 
	//----------------------------------------------------------------------------------//
	public void finalize()
	{
		
	}
	
	//----------------------------------------------------------------------------------//
	//Nom de la méthode		: CalculerNbrDigit 
	//Entrée				: valUser	-> reel		-> 32bits 
	//Sortie				: nbrDigit	-> entier	-> 8bits	-> non signé  
	//Description			: déterminer le nb de digit d'un nombre 
	//Date modfification	: le 20.04.2026 
	//Remarque				: virtual -> polymorphisme
	//----------------------------------------------------------------------------------//
	protected byte CalculerNbrDigitEntier(float valUser)
	{
		//!! laisser vider -> redéfinie dans les class enfants !! 
		return (byte)0; 
	}
	
	//----------------------------------------------------------------------------------//
	//Nom de la méthode		: RecupererDigitEntier 
	//Entrée				: valUser	-> reel		-> 32bits 
	//Sortie				: -  
	//Description			: détermine la valeur de chaque digit et l'enregistre dans 
	//						  un tableau
	//Date modfification	: le 20.04.2026 
	//Remarque				: virtual -> polymorphisme
	//----------------------------------------------------------------------------------//
	protected void RecupererDigitEntier(float valUser)
	{
		//!! laisser vider -> redéfinie dans les class enfants !! 
	}
	
	//----------------------------------------------------------------------------------//
	//Nom de la méthode	: GetValeurConvertie 
	//Entrée				: -
	//Sortie				: tableau de type char 
	//Description			: 
	//Date modfification	: le 20.04.2026 
	//Remarque				: 
	//----------------------------------------------------------------------------------//
	public byte[][] GetTableauBinaire()
	{	
		return m_tbBinaire;
	}
	
	//----------------------------------------------------------------------------------//
	//Nom de la méthode		: GetNbrDigitEntier 
	//Entrée				: 
	//Sortie				:  
	//in-out				:  
	//Description			: 
	//Date modfification	: le 20.04.2026 
	//Remarque				: 
	//----------------------------------------------------------------------------------//
	public byte GetNbrDigitEntier()
	{
		return m_nbrDigitMaxValEntier; 
	}
	
	//----------------------------------------------------------------------------------//
	// Nom de la méthode	: ConversionBinaire
	// Entrée				: 
	// Sortie				: 
	// in-out				: 
	// Description			: convertir un valeur décimale selon les attributs de la 
	//						  la classe parent 
	// Date modfification	: le 22.04.2026
	// Remarque				: 
	//----------------------------------------------------------------------------------// 
	protected void ConversionBinaire()
	{
		//-- déclaration de variable --//
		byte valAConvertire; 
		byte iterationDigitNum;
		byte iterationDigitBin;  
		byte reste;
		
		//-- MAJ du tableau de string en fct des digit entier --// 
		m_tbBinaire = new byte[m_nbrDigitMaxValEntier][4]; 

		//-- boucle d'itération pour pour chaque digit --// 
		for (iterationDigitNum = 0; iterationDigitNum < m_nbrDigitMaxValEntier; iterationDigitNum++)
		{	
			//-- récupère la valeur du digit à convertir --// 
			valAConvertire = m_tbDigitEntier[iterationDigitNum];
			
			//-- itération de conversion  --// 	
			for(iterationDigitBin = 0 ; iterationDigitBin < 4; iterationDigitBin++)
			{
				//-- conversion binaire -> modulo 2 (récupère le reste) --//
				reste = (byte)((int)valAConvertire % 2);
				
				//-- enregistrement du reste --// 
				m_tbBinaire[iterationDigitNum][iterationDigitBin] = reste;
				
				//-- MAJ de la valeur à convertir --// 
				valAConvertire /= 2;
			}
		}
	}
}



















