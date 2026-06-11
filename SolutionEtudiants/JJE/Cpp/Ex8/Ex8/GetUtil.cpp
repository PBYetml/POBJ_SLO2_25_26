#include "GetUtil.h"
#include <string>

using namespace std;

int GetUtil::GetIntEx()
{
    int val;
    cout << "Entrez un int : " << endl; // [cite: 31, 45]
    cin >> val;

    // Test de l'échec de cin 
    if (cin.fail())
    {
        cin.clear(); // Effacer l'erreur
        cin.ignore(numeric_limits<streamsize>::max(), '\n'); // Purger le tampon 
        // Lancer l'exception avec message spécifique
        throw ios_base::failure("Invalid integer value"); // [cite: 58]
    }
    // Nettoyage du buffer pour les saisies suivantes (optionnel mais recommandé)
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    return val;
}

short GetUtil::GetShortEx()
{
    short val;
    cout << "Entrez un short : " << endl; // [cite: 31, 48]
    cin >> val;

    // Test de l'échec de cin 
    if (cin.fail())
    {
        cin.clear();
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
        throw ios_base::failure("Invalid short value"); // [cite: 50]
    }
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    return val;
}