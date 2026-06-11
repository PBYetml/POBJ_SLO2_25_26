#pragma once
#ifndef UTILISATEUR_H
#define UTILISATEUR_H

#include "Formes3D.h"

class Utilisateur
{
private:
    Formes3D* MaForme; // Association via pointeur

public:
    void ChoisirForme(Formes3D& Forme); // Passage par référence
    void TraiterForme();
};

#endif