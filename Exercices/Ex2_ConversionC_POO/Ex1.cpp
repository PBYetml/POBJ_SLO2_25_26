// Caneva Ex1 SL228_POBJ language C++
// Visual Studio 2015
// 11.11.2016 C. Huber
// Adapté au C++ : 18.11.2024

#include <iostream>
using namespace std;

int main()
{
    char UserAnswer;
    int ValA, ValB;
    // Variables pour test A et B
    short i;
    short ValB1;
    double ValB2;

    cout << "Exercice 1 : Huber Christian \n";
    cout << "Solution adaptée au C++ \n";

    do {
        cout << "Test A ou B, Q pour Quitter \n";
        cin >> UserAnswer;
        cin.ignore(); // Pour ignorer le caractère de nouvelle ligne résiduel

        switch (UserAnswer) {
        case 'A':
        case 'a':
            cout << "TestA: entrez un nombre entre 1 et 9 \n";
            cin >> ValA;
            cin.ignore();

            if (ValA > 9) {
                ValA = 9;
                cout << "TestA: ValA limitee a 9 \n";
            }
            if (ValA == 0) {
                ValA = 1;
                cout << "TestA: ValA forcee a 1 \n";
            }
            if (ValA > 0) {
                cout << ValA << " ";
                for (i = 0; i < ValA; i++) {
                    cout << "*";
                }
                cout << endl; // saut de ligne
            }
            else {
                cout << "TestA: ValA est negatif ! \n";
            }
            break;

        case 'B':
        case 'b':
            cout << "TestB: entrez une valeur entre 0 et 9 \n";
            cin >> ValB;
            cin.ignore();

            if (ValB >= 0 && ValB <= 9) {
                for (i = 0; i < ValB; i++) {
                    ValB1 = 100 + (10 * i);
                    ValB2 = ValB1 / 10000.0;
                    cout << "TestB: i= " << i << " ValB1 = " << ValB1 << " ValB2 = " << ValB2 << "\n";
                }
            }
            else {
                cout << "TestB: ValB n'est pas entre 0 et 9 ! \n";
            }
            break;

        } // end switch

    } while (!(UserAnswer == 'Q' || UserAnswer == 'q'));

    return 0;
}
