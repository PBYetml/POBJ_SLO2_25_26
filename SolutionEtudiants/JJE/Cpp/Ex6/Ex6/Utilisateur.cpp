#include "Utilisateur.h"
#include <iostream>

using namespace std;

// Associe l'objet reçu en paramètre via pointeur [cite: 112]
void Utilisateur::ChoisirForme(Formes3D& Forme) {
    MaForme = &Forme;
}

// Effectue la séquence de traitement polymorphique [cite: 113]
void Utilisateur::TraiterForme() {
    if (MaForme != nullptr) {
        MaForme->SaisirInfos();     // [cite: 114]
        MaForme->CalculerVolume();  // [cite: 115]
        MaForme->AfficherVolume();  // [cite: 116]
    }
}