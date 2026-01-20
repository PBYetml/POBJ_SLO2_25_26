#include "Ellipse.h"

Ellipse::Ellipse() : Figure() {
    cout << "Constructeur de Ellipse" << endl; [cite:76]
}

Ellipse::~Ellipse() {
    cout << "Destructeur de Ellipse" << endl;
}

void Ellipse::EffectuerSaisie(int NoPoint) {
    double x, y;
    if (NoPoint == 1) {
        cout << "Entrez position X et Y du coin haut gauche du rectangle enveloppant l'Ellipse:" << endl; [cite:118]
            cin >> x >> y;
        PairePoints[0].SetXY(x, y);
    }
    else if (NoPoint == 2) {
        cout << "Entrez position X et Y du coin bas droite du rectangle enveloppant l'Ellipse:" << endl; [cite:119]
            cin >> x >> y;
        PairePoints[1].SetXY(x, y);
    }
}

void Ellipse::Dessiner() {
    cout << "Dessin d'une Ellipse" << endl; [cite:120]
        cout << "Position du coin haut gauche du rectangle enveloppant l'Ellipse "; PairePoints[0].AfficherPoint(); cout << endl;
    cout << "position du coin bas droite du rectangle enveloppant l'Ellipse "; PairePoints[1].AfficherPoint(); cout << endl;
}