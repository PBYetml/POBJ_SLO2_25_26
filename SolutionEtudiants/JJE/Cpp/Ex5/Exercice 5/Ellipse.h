#ifndef Ellipse_h
#define Ellipse_h

#include "Figure.h"


class Ellipse : public Figure
{
public:
    Ellipse();
    ~Ellipse();
    void EffectuerSaisie(int NoPoint) override;
    void Dessiner() override;
};

#endif // Ellipse_h
