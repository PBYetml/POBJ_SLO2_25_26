#ifndef Ellipse_h
#define Ellipse_h

#include "Figure.h"


class Ellipse : public Figure {

 public:

    void EffectuerSaisie(int NoPoint);

    void Dessiner();

    Ellipse();

    ~Ellipse();
};

#endif // Ellipse_h
