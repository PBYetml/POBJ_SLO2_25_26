// Caneva Ex1 SL228_POBJ language C++ 
// Visual Studio 2015
// 11.11.2016 C. Huber

#include <iostream>
#include <string>			// for the objects linked to the string 
#include <cstdint>			// to use a C library 

int main (void)
{
	char UserAnswer;
	int ValA, ValB;
	// Variables pour test A et B
	short i;
	short ValB1;
	double  ValB2;
	// variable pour une des chaine de charactère
	std::string chaine;

	chaine = "Solution en C a trandformer en C++";

	std::cout << "Exercice 1 : Savary Diego Alec" << std::endl;
	std::cout << chaine << "" << std::endl;

	do {
		std::cout << "Test A ou B, Q pour Quitter" << std::endl;
		std::cin >> UserAnswer;
		
		switch (UserAnswer) {
			case 'A':
			case 'a':
				std::cout << "TestA: entrez un nombre entre 1 et 9 " << std::endl;
				std::cin >> ValA;
				

				if (ValA > 9)
				{
					ValA = 9;
					std::cout << "TestA: ValA limitee a 9 " << std::endl;
				}
				if (ValA == 0)
				{
					ValA = 1;
					std::cout << "TestA: ValA forcee a 1" << std::endl;
				}
				if (ValA > 0 )  
				{
					std::cout << ValA << std::endl;
					for (i=0; i < ValA ; i++)
					{
						std::cout << "*";
					}
					std::cout <<  std::endl;
				}
				else 
				{
					std::cout << "TestA: ValA est negatif ! " << std::endl;
				}
			break;

			case 'B':
			case 'b':
				std::cout << "TestB: entrez une valeur entre 0 et 9 " << std::endl;
				std::cin >> ValB;
				
				if (ValB >= 0 && ValB <=9 )
				{
					for (i=0; i < ValB; i++) { 
						ValB1 = 100 + (10 * i);
						ValB2 = ValB1 / 10000.0;
						std::cout << "TestB: i=  ValB1 = ValB2 = %lf " << std::endl;

					}
				}
				else
				{
					std::cout << "TestB: ValB n'est pas entre 0 et 9 ! " << std::endl;
				}
		break;

		} // end switch
	
	} while (!(UserAnswer == 'Q' || UserAnswer == 'q'));

	return (0);
}