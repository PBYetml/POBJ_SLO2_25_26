#include "Formes3D.h"
#include <iostream>
#include <cmath> // Pour M_PI (pi)

#ifndef M_PI
#define M_PI 3.14159265358979323846
#endif

using namespace std;

// --- Classe de base Formes3D ---

Formes3D::Formes3D() {
    // Mise à 0 des champs [cite: 119]
    m_Infos.Hauteur = 0;
    m_Infos.Longueur = 0;
    m_Infos.Rayon = 0;
    m_Volume = 0;
    cout << "Constructeur de Formes 3D" << endl;
}

Formes3D::~Formes3D() {
    cout << "Destructeur de Formes3D" << endl; // [cite: 120]
}

// Méthodes virtuelles "vides" par défaut [cite: 118]
void Formes3D::SaisirInfos() {}
void Formes3D::CalculerVolume() {}
void Formes3D::AfficherVolume() {}


// --- Classe Cube ---

Cube::Cube() : Formes3D() { // Appel constructeur base [cite: 126]
    cout << "Constructeur de Cube" << endl; // [cite: 128]
}

Cube::~Cube() {} // Le destructeur de base sera appelé automatiquement ensuite

void Cube::SaisirInfos() {
    cout << "Entrez la longeur de l'arrete du cube" << endl; // [cite: 165]
    cin >> m_Infos.Longueur; // [cite: 134]
}

void Cube::CalculerVolume() {
    // Volume = a^3
    m_Volume = pow(m_Infos.Longueur, 3); // [cite: 140]
}

void Cube::AfficherVolume() {
    cout << "Le volume du cube dont l'arrete est " << m_Infos.Longueur
        << " vaut " << m_Volume << endl; // [cite: 145]
}


// --- Classe Sphere ---

Sphere::Sphere() : Formes3D() {
    cout << "Constructeur de Sphere" << endl;
}

Sphere::~Sphere() {}

void Sphere::SaisirInfos() {
    cout << "Entrez le rayon de la sphere" << endl; // [cite: 168]
    cin >> m_Infos.Rayon; // [cite: 135]
}

void Sphere::CalculerVolume() {
    // Volume = (4/3) * pi * r^3
    m_Volume = (4.0 / 3.0) * M_PI * pow(m_Infos.Rayon, 3); // [cite: 141]
}

void Sphere::AfficherVolume() {
    cout << "Le volume de la sphere dont le rayon est " << m_Infos.Rayon
        << " vaut " << m_Volume << endl; // [cite: 146]
}


// --- Classe Cone ---

Cone::Cone() : Formes3D() {
    cout << "Constructeur de Cone" << endl;
}

Cone::~Cone() {}

void Cone::SaisirInfos() {
    cout << "Entrez le rayon de la base du cone" << endl; // [cite: 170]
    cin >> m_Infos.Rayon;
    cout << "Entrez la hauteur du cone" << endl; // [cite: 172]
    cin >> m_Infos.Hauteur; // [cite: 136]
}

void Cone::CalculerVolume() {
    // Volume = (pi * r^2 * h) / 3
    m_Volume = (M_PI * pow(m_Infos.Rayon, 2) * m_Infos.Hauteur) / 3.0; // [cite: 142]
}

void Cone::AfficherVolume() {
    cout << "Le volume du cone dont le rayon est " << m_Infos.Rayon
        << " et la hauteur est " << m_Infos.Hauteur
        << " vaut " << m_Volume << endl; // [cite: 147]
}