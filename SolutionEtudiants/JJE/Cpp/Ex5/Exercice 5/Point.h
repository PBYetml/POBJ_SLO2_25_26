#ifndef Point_h
#define Point_h


class Point {

 public:

    void AfficherPoint();

    void SetXY(double ValX, double ValY);

    double GetX();

    double GetY();


 private:
    double X;
    double Y;

};

#endif // Point_h
