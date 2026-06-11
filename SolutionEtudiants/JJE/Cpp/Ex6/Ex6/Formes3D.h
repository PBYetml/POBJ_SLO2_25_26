#pragma once
#ifndef FORMES3D_H
#define FORMES3D_H

#include "ParamFormes3D.h"
#include <iostream>

using namespace std;

// Classe de base
class Formes3D
{
public:
    double m_Volume;
    ParamFormes3D m_Infos;

    Formes3D();
    virtual ~Formes3D(); // Destructeur virtuel essentiel pour le polymorphisme

    virtual void SaisirInfos();    // Virtuelle
    virtual void CalculerVolume(); // Virtuelle
    virtual void AfficherVolume(); // Virtuelle
};

// Classe Cube
class Cube : public Formes3D
{
public:
    Cube();
    ~Cube();
    void SaisirInfos() override;
    void CalculerVolume() override;
    void AfficherVolume() override;
};

// Classe Sphere
class Sphere : public Formes3D
{
public:
    Sphere();
    ~Sphere();
    void SaisirInfos() override;
    void CalculerVolume() override;
    void AfficherVolume() override;
};

// Classe Cone
class Cone : public Formes3D
{
public:
    Cone();
    ~Cone();
    void SaisirInfos() override;
    void CalculerVolume() override;
    void AfficherVolume() override;
};

#endif