#include "Rectangle.h"

Rectangle::Rectangle() : Figure() {
    cout << "Constructeur de Rectangle" << endl; [cite:76]
}

Rectangle::~Rectangle() {
    cout << "Destructeur de Rectangle" << endl;
}

void Rectangle::EffectuerSaisie(int NoPoint) {
    double x, y;
    if (NoPoint == 1) {
        cout << "Entrez position X et Y du coin haut gauche du rectangle:" << endl; [cite:112]
            cin >> x >> y;
        PairePoints[0].SetXY(x, y);
    }
    else if (NoPoint == 2) {
        cout << "Entrez position X et Y du coin bas droite du rectangle:" << endl; [cite:113]
            cin >> x >> y;
        PairePoints[1].SetXY(x, y);
    }
}

void Rectangle::Dessiner() {
    cout << "Dessin d'un Rectangle" << endl; [cite:114]
        cout << "Position du coin haut gauche du rectangle "; PairePoints[0].AfficherPoint(); cout << endl;
    cout << "position du coin bas droite du rectangle: "; PairePoints[1].AfficherPoint(); cout << endl;
}