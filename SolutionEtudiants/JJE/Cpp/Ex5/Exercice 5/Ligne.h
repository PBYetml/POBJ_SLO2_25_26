#ifndef Ligne_h
#define Ligne_h

#include "Figure.h"


class Ligne : public Figure {

 public:

    void EffectuerSaisie(int NoPoint);

    void Dessiner();

    Ligne();

    ~Ligne();
};

#endif // Ligne_h
