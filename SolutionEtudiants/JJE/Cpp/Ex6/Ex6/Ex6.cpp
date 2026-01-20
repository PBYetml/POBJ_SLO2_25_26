#include <iostream>
#include <string>
#include "HexUtil.h"
#include "Formes3D.h" // Inclut aussi ParamFormes3D
#include "Utilisateur.h"

using namespace std;

int main()
{
    char choix = ' ';

    cout << "Exercice 6 : [Votre Nom Ici]" << endl; // [cite: 50]

    while (choix != 'Q' && choix != 'q')
    {
        cout << "Test A ou B , Q pour Quitter" << endl; // [cite: 51]
        cin >> choix;

        if (choix == 'A' || choix == 'a')
        {
            // --- ACTIONS DU TESTA [cite: 14, 20] ---
            cout << "TestA: HexUtil" << endl;

            // 1. Créer l'objet [cite: 21]
            HexUtil MyHexUtil;

            // 2. Int [cite: 22]
            int valInt = MyHexUtil.SaisirInt();
            MyHexUtil.ShowHex(valInt);

            // 3. Short [cite: 23]
            short valShort = MyHexUtil.SaisirShort();
            MyHexUtil.ShowHex(valShort);

            // 4. Float [cite: 24]
            float valFloat = MyHexUtil.SaisirFloat();
            MyHexUtil.ShowHex(valFloat);

            // 5. Double [cite: 25]
            double valDouble = MyHexUtil.SaisirDouble();
            MyHexUtil.ShowHex(valDouble);
        }
        else if (choix == 'B' || choix == 'b')
        {
            // --- ACTIONS DU TESTB  ---
            cout << "TestB: Figures3D" << endl;

            // Instanciation des utilisateurs [cite: 106]
            Utilisateur Albert;
            Utilisateur Bernard;
            Utilisateur Christian;

            // Instanciation des formes [cite: 107]
            Cube monCube;
            Sphere maSphere;
            Cone monCone;

            // Association : ChoisirForme (Passage par référence) [cite: 108]
            Albert.ChoisirForme(monCube);
            Bernard.ChoisirForme(maSphere);
            Christian.ChoisirForme(monCone);

            // Traitement polymorphique [cite: 110]
            // Note: L'ordre dépend de l'input utilisateur, ici séquentiel pour l'exercice
            Albert.TraiterForme();
            Bernard.TraiterForme();
            Christian.TraiterForme();
        }
    }

    return 0;
}