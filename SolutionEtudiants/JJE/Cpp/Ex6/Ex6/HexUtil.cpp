#include "HexUtil.h"
#include <iostream>
#include <iomanip> // Pour hex et setfill

using namespace std;

// --- Méthodes de Saisie [cite: 26-28] ---

int HexUtil::SaisirInt() {
    int val;
    cout << "Entrez un int : ";
    cin >> val;
    return val;
}

short HexUtil::SaisirShort() {
    short val;
    cout << "Entrez un short : ";
    cin >> val;
    return val;
}

float HexUtil::SaisirFloat() {
    float val;
    cout << "Entrez un float : ";
    cin >> val;
    return val;
}

double HexUtil::SaisirDouble() {
    double val;
    cout << "Entrez un double : ";
    cin >> val;
    return val;
}

// --- Méthodes ShowHex (Template ou surcharge manuelle) [cite: 35] ---
// La logique est identique pour tous, seule la taille change.

void HexUtil::ShowHex(int val) {
    unsigned char* pData = (unsigned char*)&val;
    cout << "Affichage des " << sizeof(int) << " octets d'un int :" << endl;

    // Affichage commençant par l'octet de poids fort (MSB) [cite: 36]
    for (int i = sizeof(int) - 1; i >= 0; i--) {
        // Cast en unsigned short pour affichage numérique et non char [cite: 38]
        unsigned short usTest = pData[i];
        cout << setfill('0') << setw(2) << hex << usTest << " ";
    }
    cout << endl;
}

void HexUtil::ShowHex(short val) {
    unsigned char* pData = (unsigned char*)&val;
    cout << "Affichage des " << sizeof(short) << " octets d'un short :" << endl;
    for (int i = sizeof(short) - 1; i >= 0; i--) {
        unsigned short usTest = pData[i];
        cout << setfill('0') << setw(2) << hex << usTest << " ";
    }
    cout << endl;
}

void HexUtil::ShowHex(float val) {
    unsigned char* pData = (unsigned char*)&val;
    cout << "Affichage des " << sizeof(float) << " octets d'un float :" << endl;
    for (int i = sizeof(float) - 1; i >= 0; i--) {
        unsigned short usTest = pData[i];
        cout << setfill('0') << setw(2) << hex << usTest << " ";
    }
    cout << endl;
}

void HexUtil::ShowHex(double val) {
    unsigned char* pData = (unsigned char*)&val;
    cout << "Affichage des " << sizeof(double) << " octets d'un double :" << endl;
    for (int i = sizeof(double) - 1; i >= 0; i--) {
        unsigned short usTest = pData[i];
        cout << setfill('0') << setw(2) << hex << usTest << " ";
    }
    cout << endl;
}