#include "Ligne.h"

Ligne::Ligne() : Figure() {
    cout << "Constructeur de Ligne" << endl; [cite:76]
}

Ligne::~Ligne() {
    cout << "Destructeur de Ligne" << endl;
}

void Ligne::EffectuerSaisie(int NoPoint) {
    double x, y;
    if (NoPoint == 1) {
        cout << "Entrez position X et Y du debut de la ligne:" << endl; [cite:103]
            cin >> x >> y;
        PairePoints[0].SetXY(x, y);
    }
    else if (NoPoint == 2) {
        cout << "Entrez position X et Y de la fin de la ligne:" << endl; [cite:105]
            cin >> x >> y;
        PairePoints[1].SetXY(x, y);
    }
}

void Ligne::Dessiner() {
    cout << "Dessin d'une Ligne" << endl; [cite:107]
        cout << "Debut de la ligne "; PairePoints[0].AfficherPoint(); cout << endl;
    cout << "Fin de la ligne "; PairePoints[1].AfficherPoint(); cout << endl;
}