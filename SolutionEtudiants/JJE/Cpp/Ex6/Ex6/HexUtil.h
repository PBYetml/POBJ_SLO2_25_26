#pragma once
#ifndef HEXUTIL_H
#define HEXUTIL_H

class HexUtil
{
public:
    // Méthodes de saisie
    int SaisirInt();
    short SaisirShort();
    float SaisirFloat();
    double SaisirDouble();

    // Méthodes d'affichage hexadécimal (Surcharge)
    void ShowHex(int val);
    void ShowHex(short val);
    void ShowHex(float val);
    void ShowHex(double val);
};

#endif