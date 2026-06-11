#include "Figure.h"

Figure::Figure() {
    // Mettre à 0 les champs des 2 points [cite: 72]
    PairePoints[0].SetXY(0, 0);
    PairePoints[1].SetXY(0, 0);
    cout << "Constructeur de Figure" << endl;
}

Figure::~Figure() {
    cout << "Destructeur de Figure" << endl; [cite:73]
}

// Les méthodes restent vides dans la classe de base [cite: 71]
void Figure::EffectuerSaisie(int NoPoint) {}
void Figure::Dessiner() {}