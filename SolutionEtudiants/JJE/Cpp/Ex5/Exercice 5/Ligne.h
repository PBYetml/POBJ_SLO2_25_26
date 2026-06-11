#ifndef Ligne_h
#define Ligne_h

#include "Figure.h"


class Ligne : public Figure
{
public:
    Ligne();
    ~Ligne();
    void EffectuerSaisie(int NoPoint) override;
    void Dessiner() override;
};

#endif // Ligne_h
