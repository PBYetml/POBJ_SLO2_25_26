#ifndef Dessinateur_h
#define Dessinateur_h

class Figure;

class Dessinateur {

 public:

    void ConstruireFigure(signed char Choix);

    void SaisirPositionXY(int NoPoint);

    void DessinerFigure();

    void SupprimerFigure();


 private:
    signed char m_FigureChoisie;
    Figure* m_MaFigure;

 public:

    /**
     * @element-type Figure
     */
    Figure *MaFigure;
};

#endif // Dessinateur_h
