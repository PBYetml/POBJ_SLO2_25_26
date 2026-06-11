#ifndef Figure_h
#define Figure_h

#include "Point.h"


class Figure {

protected:
    // Composition: Tableau de 2 points pour le début/fin ou coins [cite: 28]
    Point PairePoints[2];

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
