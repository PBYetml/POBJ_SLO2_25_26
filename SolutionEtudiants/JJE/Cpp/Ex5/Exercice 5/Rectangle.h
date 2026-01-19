#ifndef Rectangle_h
#define Rectangle_h

#include "Figure.h"


class Rectangle : public Figure {

 public:

    void EffectuerSaisie(int NoPoint);

    void Dessiner();

    Rectangle();

    ~Rectangle();
};

#endif // Rectangle_h
