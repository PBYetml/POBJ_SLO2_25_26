#define _CRT_SECURE_NO_WARNINGS // Pour éviter les erreurs sur strcpy dans VS
#include <iostream>
#include <string>
#include <typeinfo> // Pour typeid
#include <stdexcept> // Pour out_of_range
#include <cstring> // Pour strlen, strcpy
#include "GetUtil.h"

using namespace std;

// Fonction demandée pour le TestB [cite: 87, 88]
// Doit lancer une exception out_of_range si le buffer est trop petit
void GetBufferEx(char* Buff, int NbCharMax)
{
    char tempBuffer[255]; // Grand tampon temporaire pour la saisie sécurisée 

    cout << "Entrez un mot" << endl;
    cin.getline(tempBuffer, 255);

    // Vérification de la taille [cite: 71]
    // NbCharMax inclut le caractère nul de fin de chaîne '\0'
    if (strlen(tempBuffer) >= NbCharMax)
    {
        throw out_of_range("Depassement taille du tampon"); // [cite: 99]
    }

    // Si la taille est correcte, on copie dans le petit buffer
    strcpy(Buff, tempBuffer);
}

int main()
{
    char choix = ' ';

    cout << "Exercice 8 traitement Exceptions" << endl; // [cite: 41]

    while (choix != 'Q' && choix != 'q')
    {
        cout << "Test A ou B, Q pour Quitter" << endl; // [cite: 42]
        cin >> choix;
        cin.ignore(); // Important: consomme le retour à la ligne après la saisie du char

        if (choix == 'A' || choix == 'a')
        {
            // --- TEST A --- [cite: 21]
            try
            {
                // Utilisation de GetIntEx [cite: 28]
                int resInt = GetUtil::GetIntEx();
                cout << "ResAint = " << resInt << endl;

                // Utilisation de GetShortEx [cite: 27]
                short resShort = GetUtil::GetShortEx();
                cout << "ResShort = " << resShort << endl;
            }
            catch (ios_base::failure& e) // Attraper l'exception spécifique [cite: 51]
            {
                cout << "Caught " << e.what() << endl; // [cite: 50, 58]
                cout << "Type " << typeid(e).name() << endl; // Affiche le type de l'exception [cite: 51]
            }
        }
        else if (choix == 'B' || choix == 'b')
        {
            // --- TEST B --- [cite: 68]
            cout << "TestB: ??? exception" << endl;
            char Buff5[5]; // Tampon très petit (5 caractères) [cite: 71]

            try
            {
                // Appel de la fonction sécurisée [cite: 87]
                GetBufferEx(Buff5, 5);
                cout << "Mot saisi = " << Buff5 << endl;
            }
            catch (out_of_range& e) // Attraper l'exception de dépassement [cite: 100]
            {
                cout << "Caught " << e.what() << endl; // [cite: 99]
                cout << "Type " << typeid(e).name() << endl; // [cite: 100]
            }
        }
    }

    return 0;
}