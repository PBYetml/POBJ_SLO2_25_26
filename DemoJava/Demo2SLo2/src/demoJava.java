import java.lang.*;
import java.util.Locale;
import java.util.Scanner;
import java.math.*;

public class demoJava {
	
	//-- attributs --// 
	//-- visibilité 
	public int varPublic;  	//-> publique 
	private int varPrivate; 	//-> privé 
	protected int varProtected; 	//-> protéger
	
	//-- enumération --// 
	//-> visbilité 
	public enum e_branche {GENELEC, GENLOG}; 
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// type primitif 
		// entier
		boolean valB; 	// -> 1 octet -> 
						// uniquement de true ou false 
		byte valb; 		// -> 1 octet
		char valC; 		// -> 2 octets 
						// -> table étendue ASCII -> unicode -> \u0000 (hexaddécimal) 
		short valS; 	// -> 2 octets 
		int valI; 		// -> 4 octect 
		long valL; 		// -> 8 octets 
		
		// réel 
		float valF;		// -> 4 octets 
		double valD; 	// -> 8 octets 
	 
		//-- autre --// 
		//-> énumération 
		e_branche varEnum; 
		varEnum = e_branche.GENELEC; 
		
		// chaine de caractère 
		String maChaine = "Hello Slo2 "; 
		String Recuperation; 
		
		// objet pour la récuperation clavier 
		Scanner monClavier = new Scanner(System.in); 
		
		// exemple insctrution / déclaration  
		valB = true; 
		valC = 'A'; 
		valC = '\u0061'; 
		
		//essai sur le cast -> entier 
		valb = (byte)0xFF; 	//-> cst numérique -> byte  
		valC = (char)valb; 	//-> byte -> char 
		
		valS = (short)0b11110000; 	//-> cst numérique -> 
		valI = valS; 				//-> short -> entier 
		
		valF = (float)3.14; 
		valD = Math.PI; 
		
		System.out.print(maChaine + "\n");
		System.out.println("-- Exemple DEMO --");
		
		System.out.print("\n valeur boolean : "+ valB);
		System.out.print("\n valeur entière : " + valb);
		System.out.print("\n valeur réel : " + valF);
		
		//-- format d'affichage --// 
		System.out.printf("\n affichage en octal : 0%o ", valb); 
		System.out.printf("\n affichage en hexa : 0x%x ", valb); 
		
		//-- chaine de caractères -> 
		Recuperation = Integer.toBinaryString(valb); 
		System.out.printf("\n affichage en binaire : 0b%s", Recuperation); 
		
		//-- lecture clavier --// 
		//-> chaine de caractère
		System.out.print("\n insérer une chaine de caractère : "); 
		Recuperation = monClavier.nextLine(); 
		//-> entier
		System.out.print("insérer une valeur entière : "); 
		valI = monClavier.nextInt(); 
		
		//-> float 
		System.out.print("insérer une valeur réelle : "); 
		
		try 
		{
			valD = monClavier.nextDouble(); 
		}
		catch (Exception data)
		{
			System.out.println(data.getLocalizedMessage()); 
			System.out.println(data.getMessage()); 
		}
		finally 
		{
			monClavier.useLocale(Locale.ENGLISH); 
			valD = monClavier.nextDouble();
		}
		
		if (valD == 3.14)
		{
			System.out.println("Exception levee !!!"); 
		}
			
		
		
	}

}
