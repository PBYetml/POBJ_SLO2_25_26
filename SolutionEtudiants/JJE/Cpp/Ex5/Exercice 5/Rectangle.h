#ifndef Rectangle_h
#define Rectangle_h

#include "Figure.h"


class Rectangle : public Figure
{
public:
    Rectangle();
    ~Rectangle();
    void EffectuerSaisie(int NoPoint) override;
    void Dessiner() override;
};

#endif // Rectangle_h
