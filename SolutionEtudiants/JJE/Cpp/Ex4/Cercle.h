#ifndef Cercle_h
#define Cercle_h

#include "FormesGeometriques.h"


class Cercle : public FormesGeometriques {

 public:

    double CalculerSurface(double diametre);

    double CalculerPerimetre(double diametre);
};

#endif // Cercle_h
