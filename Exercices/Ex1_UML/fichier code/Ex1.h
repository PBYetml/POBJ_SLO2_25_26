#ifndef Ex1_h
#define Ex1_h

class FormesGeometriques;

class Ex1 {

 public:

    int main();

    void SaisirParametres(int CodeForme);

    void AfficherResultats(int CodeForme);

    void ExecuterLesCalculs(int CodeForme);

    int ChoisirForme();

 public:
    int CodeFormeChoisie;

 public:

    /**
     * @element-type FormesGeometriques
     */
    FormesGeometriques *myFormesGeometriques;
};

#endif // Ex1_h
