package demo25_26;


import java.lang.*;
import java.math.*;
import java.util.Scanner;
import java.util.Locale;




public class demo 
{
	//-- attributs --// 
	//-- visibilité 
	public int varA1;	//-> publique 
	private int varA2;  	//-> privé 
	protected int varA3; 	//-> protégé
	
	//-- enumération --//
	public enum e_BASIC
	{
		champ1, chamnp2
	}
	
	//-- énumération complexe --// 
	public enum e_MODULE 
	{
		GENELOG(100), GENELEC(10); 
		
		private final int var; 
		
		e_MODULE(int test)
		{			
			this.var = test; 
		}
		
		public int getEnum()
		{
			return var; 
		}
	}

	public static void main(String[] args) 
	{
		//-- types primitif--// 
		//-- entier --
		byte varByte; 	//-> 1 octet 
		short varShort; 	//-> 2 octets -> valeur numérique 
		char varC; 			//-> caractètre -> uni-code 
		
		int varInt; 	//-> 4 octets 
		long varLong; 	//-> 8 octets 
		
		//-- réel --
		float varF; 	//-> 4 octets 
		double varD; 	//-> 8 octets
		
		//-- autre --// 
		boolean varB;	//-> 1 octet 
			//-> énumération -> déclaration 
		e_MODULE varEnum = e_MODULE.GENELEC; 

		varInt = varEnum.getEnum(); 
		
		//-- Objet --// 
		//-> chaine de caractère 
		String maChaine = "Hello SLO"; 	
		
		//-> Objet lié au clavier 
		Scanner monClavier = new Scanner(System.in);  	
		
		//-> Objet lié à une class personnelle, sans instanciation 
		personnage SLO2; 
		
		SLO2 = new personnage((byte)50); 
		
		//-- exemple assignation sur variable primaire --//   
		varB = true;	//-> asssignation sur un booleen -> false ou true  
		
		//-> assignation d'un caractère
		varC = 'A'; 		//-> caractère 
		varC = '\u0041'; 	//-> unidcode 
		
		//-> cast -> entier à entier -> petit à grand 
		varByte = (byte)0xFF; 		//-> cst numérique -> byte  
		varC = (char)varByte; 			//-> byte -> char 
		varShort = (short)0xFFFF; 				//-> cst numérique -> short
		varInt = varShort; 				//-> short -> entier 
		
		//-> cast cst numérique -> float 
		varF = 3.14F;
		varF = (float)6.28; 
		varD = 3.14; 
		varD = Math.PI; 
		varD = 0.1 + 0.2; 
		
		//- affichage en mode console 
		//-> exemple chaine de caractère manuelle avec retour à la ligne automatique 
		System.out.print("\n" + maChaine);
		System.out.print("\n");
		System.out.println("-> demo <-");
		
		System.out.println("valeur boolean : " + varB); 
		System.out.println("valeur entier : " + varByte); 
		System.out.println("valeur reel : " + varD); 
		
		System.out.printf("valeur PI sur 3 digit : %.3f", Math.PI ); 
		
		System.out.printf("\n format hexa 0x%x", varInt ); 
		System.out.printf("\n format octal 0%o", varInt );
		
		maChaine = Integer.toBinaryString(varInt); 
		System.out.printf("\n format binaire ob%s", maChaine);
		
		//-- chaine de caractère -- 
		//-> chaine de caractère
		System.out.print("\n insérer une chaine de caractère : "); 
		maChaine = monClavier.nextLine(); 
				
		//-> entier
		System.out.print("insérer une valeur entière : "); 
		varInt = monClavier.nextInt(); 
				
		//-> float 
		System.out.print("insérer une valeur réelle : "); 
				
		try 
		{
			varD = monClavier.nextDouble(); 
		}
		catch (Exception data)
		{
			System.out.println(data.getLocalizedMessage()); 
			System.out.println(data.getMessage()); 
		}
		finally 
		{
			monClavier.useLocale(Locale.ENGLISH); 
			varD = monClavier.nextDouble();
		}
			
		if (varD == 3.14)
		{
			System.out.println("Exception levee !!!"); 
		}
		
		// TODO Auto-generated method stub
		
	}

}
