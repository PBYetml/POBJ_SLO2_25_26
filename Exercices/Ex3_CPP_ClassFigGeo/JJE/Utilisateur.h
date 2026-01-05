#ifndef Utilisateur_h
#define Utilisateur_h

class FormesGeometriques;

class Utilisateur {

 public:

    void AfficherResultats();

    int ChoisirForme(int CodeForme);

    void SaisirLesParametres();

    void ExecuterLesCalculs();


 private:
    int m_CodeFormeChoisie;

 public:

    /**
     * @element-type FormesGeometriques
     */
    FormesGeometriques *myFormesGeometriques;
};

#endif // Utilisateur_h
