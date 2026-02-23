using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace demo
{
    class couteau : arme
    {
        //-- attribut --// 
        //-- private --// 
        private String mTypeArme;
        private String mModele;

        // constructeur 
        public couteau() { }
        public couteau(String Modele, int degats)
        { }

        public override int Frapper()
        {
            int degatsInflige = 0;

            return degatsInflige;
        }

        public int Frapper(ref byte degat) 
        {
            int degatsInflige = 0;

            return degatsInflige; 
        }

        public int Frapper(out float degat )
        {
            int degatsInflige = 0;

            degat = 0; 

            return degatsInflige;
        }



    }
}
