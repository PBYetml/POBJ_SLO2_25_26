#ifndef AfficheurLCD_h
#define AfficheurLCD_h


class AfficheurLCD {

 public:

    void AfficherCaractere(char c);

    void AfficherText(String Text);

    void Positionner(int Ligne, int Colonne);

    void Initialiser();

    int GetNbDeLignes();

    int GetNbCarParLigne();

    AfficheurLCD();

    AfficheurLCD(int NbLignes, int NbColonnes);

    ~AfficheurLCD();

    void ShowDisplay();

 public:
    char **Display;
    int CurLigne;
    int CurCol;

 private:
    int NbDeLignes;
    int NbCarParLigne;
};

#endif // AfficheurLCD_h
