using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace demo
{
    class personnage
    {
        //-- déclaration de constante --// 
        private const byte VIE_MAX = 100; 
        
        //-- déclaration attribut primitif 
        //--> private --// 
        private byte mVie;


        //--> protect --// 

        //--> public --//  


        //-- déclaration attribut Objet--// 
        private String mNomPersonnage;

        public arme choixArme = new arme();
        public arme choixArme2;


        //-- constructeur --// 
        public personnage()    
        {
            mVie = 100;
            mNomPersonnage = "default"; 
        }


        public personnage(byte vie = 10) 
        {
            //-- MAJ attribut lors de l'instanciation --// 
            mVie = vie;         //-- this.mVie = vie; => même chose  

            //-- message user --// 
            Console.WriteLine("Entrer un nom de personnage");
            mNomPersonnage = Console.ReadLine(); 
        }

        ~personnage() { }
        
        
        
        public void ChoisirArme(ref e_typeArme typeArme) // passage par reférence 
                                                         // ref -> valeur initialisée à l'appel de la fonction 
        {
            switch(typeArme)
            {
                case e_typeArme.aBlanche :
                    // instanciation d'objet 
                    // appel appel du constructeur arme 
                    // constructeur par défaut 
                    choixArme2 = new arme();
                    // constrcuteur surchargé 
                    choixArme = new arme("couteau suisse", 50);
                    

                    break;

                case e_typeArme.aContondante:

                    break;

                case e_typeArme.aFeu:

                    break;
                
                case e_typeArme.aJet:

                    break;
            }

            typeArme = e_typeArme.aFeu;


            choixArme2 = new couteau("couteauX", 20);

            byte mesDegat = 100;
            float DegatsX; 


            choixArme2.Frapper(ref mesDegat);
            choixArme2.Frapper(out DegatsX); 
        {
            int degatsInflige = 0;

            //degat = 0; 

            //return degatsInflige;
        }

        }

        public void choisirArme2(out e_typeArme typeArme) // passage par reférence 
                                                          // ref -> valeur initialisée à l'appel de la fonction 
                                                          // out -> 
        {
            typeArme = e_typeArme.aJet;
        }

        public void Attaquer(personnage adversaire) 
        {
            
        }

        public void BoirePotion(ref byte quantite)
        {
            if((mVie + quantite) > personnage.VIE_MAX)      // -> ou simplement VIE_MAX
            {
                mVie = VIE_MAX;
                //quantite = VIE_MAX 
            }
            else 
                mVie += quantite; 


        }
        public void InfoPersonnage() 
        {
            Console.WriteLine("nom : " + mNomPersonnage);
            Console.WriteLine("vie actuelle : " + mVie); 
        }
    }
}
