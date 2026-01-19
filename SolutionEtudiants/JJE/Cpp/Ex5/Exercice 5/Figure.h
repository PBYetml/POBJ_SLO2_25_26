#ifndef Figure_h
#define Figure_h

#include "Point.h"


class Figure {

 public:

    virtual void EffectuerSaisie(int NoPoint);

    virtual void Dessiner();

    Figure();

    virtual ~Figure();

 public:

    /**
     * @element-type Point
     */
    Point PairePoints[ 2];

};

#endif // Figure_h
