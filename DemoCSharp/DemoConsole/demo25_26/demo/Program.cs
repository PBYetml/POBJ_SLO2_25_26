using System.Collections;

namespace demo
{
    internal class Program
    {
        //-- attributs --// 


        //-- méthode --// 
        static void Main(string[] args)
        {
            //-- variable 
            //-- type primaire - Entier
            //-- booléen - taille : 1 octet
            bool varT = true, varT2 = false;                    // uniquement keyword "true" ou "false"

            //-- entier
            //-- taille : 1 octet
            //-- non signé -> 0 à- 255
            byte varB = 10;                                     // cast implicte avec la cst numérique 

            //-- signé (s) -> -128 à 127
            sbyte varBis = -10;                                   // cast implicte avec la cst numérique  

            //-- taille : 2 octet 
            //-- non signé (u)
            ushort varUs = 255;                                    // cast implicte avec la cst numérique 

            //-- signé 
            short VarS;                                   // cast implicte avec la cst numérique 

            //-- taille : 4 octes
            //-- non signé 
            uint varuE;

            //-- signé 
            int varE;

            //-- taille : 8 octets
            //-- non signé  (u) -> L 
            ulong varuL = (ulong)100;
            varuL = 100L;                       // soit utilisation du formt L -> xxxxL

            //-- signé 
            long varL;                                      // soit caster la valeur 

            //-- gestion des caractères => 1 seul 
            char lettre = 'a';                // -> caractère standart 
            char lettrebis = '\u0065';        // -> caractère unicode 
            char lettreHex = (char)0x65;      // -> cast -> caractère ASCII - table standart 


            // type primaire - Reel  
            //-- taille : 4 octets 
            float varF = (float)3.14;        //-- obligation du cast 
            varF = 3.14F;                   //-- format de valeur -> F 

            //-- 8 octets 
            double varD = 14.14;
            varD = 3.14D;                   //-- format de valeur -> D

            //-- 16 octets 
            decimal varDD = 3.14M;          //-- format de valeur -> M 
            varDD = (decimal)3.14;          //-- cast 

            //-- tableau de type primaire --// 
            //-- tableau entier 10 case
            uint[] tbEntier = new uint[10];

            //-- tableau multidimension --// 
            //-- tableau entier 2 dimension [ligne, colonne]
            int[,] tbEntier_2Dim = new int[2, 3];

            //-- tableau entier 3 dimension[x, y, z]
            int[,,] tbEntier_3Dim = new int[,,] {
                                                    // -> Z 
                                                    {   
                                                        // -> Y 
                                                        { 0, 1, 2},      // -> X  
                                                        {0, 1, 2 }
                                                    },
                                                    { 
                                                        { 0, 1, 2}, 
                                                        {0, 1, 2 } 
                                                    },
                                                    { 
                                                        { 0, 1, 2}, 
                                                        {0, 1, 2 } },
                                                }; 

            tbEntier_2Dim[1, 2] = 0;

            //-- variable type enum -> lié à la class arme 
            e_typeArme arme = e_typeArme.aFeu;
            e_typeArme arme2;

            //-- objets utiles --//
            //-- chaine de caractère -> String --// 
            String chaine = "Hello SLO";
            
            String[] weekDays = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

            //-- objet standart -> non défini !!! 
            object SLOx;    // /!\ n'a pas d'appartenance à une class prédéfinie 
                            // pas besoin de l'instancier

            //-- lié à la class personnage
            personnage SLO2 = new personnage();
            personnage SLO1 = new personnage(50);

            SLO2.ChoisirArme(ref arme);             // /!\ attention parmaètre doit être initialiser avant 
            SLO2.choisirArme2(out arme2);           // parmaètre n'a pas besoin d'être initialiser 

            //-- collection -> tableau d'objet --// 
            //-- list 
            List<personnage> tbPersonnage = new List<personnage>();

            //-- ajout d'éléments --// 
            tbPersonnage.Add(SLO1); 
            tbPersonnage.Add(SLO2);
            
            //-- modification de l'objet proprement parler
            tbPersonnage[1].choisirArme2(out arme2);
            tbPersonnage[0].Attaquer(tbPersonnage[1]); 

            //-- recupérer un objet de liste d'objet personnage --// 
            SLO1 = tbPersonnage[1];

            //-- array --// 
            ArrayList tbCollection = new ArrayList();

            tbCollection.Add(varT);         // boolean
            tbCollection.Add(varF);         // floattant
            tbCollection.Add(SLO1);         // objet type personnage 

            //-- récupération d'un élément -> ici connait le type rechercher
            varT2 = (bool)tbCollection[0]; 

            //-- écriture directement dans la liste -> on connait le type et la casse recherchée 
            tbCollection[1] = (float)3.14;

            //-- permet de pointer sur l'index de l'objet rechercher 
            varE = tbCollection.IndexOf(SLO1);

            //-- si doit travailler sur un objet, doit passer par un objet intermédaire --// 
            SLOx = tbCollection[2];  

            //tbCollection.Remove(varT);
            tbCollection.Insert(0, tbEntier_3Dim);


            //varT2 =  bool.Parse(0, tbCollection); 




            //-- touches clavier
            //--> ConsoleKey -> énumération 
            //--> ConsoleKeyInfo --//
            //

            //-- date -> DateTime --// 


            //-- console -> message user --// 
            //--> console -> writeline 
            Console.WriteLine(chaine + 2 + " année" + 26);

            //--> console -> write
            Console.Write(varUs);
            Console.Write("\n");
            Console.Write(varUs.ToString("x"));
            Console.Write("\n");
            Console.Write(varD);
            Console.Write("\n");
            Console.Write(varD.ToString("f"));
            Console.Write("\n");

            //-- récupération d'une chaine de caractère --//
            // --> console -> readline -> retour sur un string 
            // --> console -> read -> retour format désiré 
            chaine = Console.ReadLine();

            Console.WriteLine(chaine);

            //=> sachant l'utilisateur insère une chaine de caractère sous forme de nombre entier 
            varE = int.Parse(Console.ReadLine());

            //=> sachant l'utilisateur insère une chaine de caractère sous forme de nombre floattant
            varF = float.Parse(Console.ReadLine()); 

            Console.Write(varE);


            //-- conversion chaîne de caractère en nombre entier --// 

            //-> les fonctions en commentaire ne fonctionnent pas <- PAS trouvé la raison !!! 
            //-> Attention la méthode Parse doit être associé à une class -> type.Parse 
            //valUserInt = int.Parse("4.01", NumberStyles.AllowDecimalPoint);  //=> ne fonctionne pas -> exception 
            //valUser = Convert.ToInt32(infoUser_o);                            => ne fonctionne pas -> exception

            //valUserInt = Convert.ToInt32(Convert.ToDouble(infoUser_o));
            //valUserFloat = float.Parse(infoUser_o);
            //demoDouble = Convert.ToDouble(Message); 

            ConsoleKeyInfo touchePressee; 

            touchePressee = Console.ReadKey();

            //-- test --// 
            //-> if 
            if (touchePressee.Key == ConsoleKey.F1)
            {
            }
            else if (touchePressee.Key == ConsoleKey.Escape)
            { }
            else
            {
            }

            //-> switch
            switch(touchePressee.Key)
            {
                case ConsoleKey.F1:

                break;


                default:
                break; 
            }


            //-- itération --// 
            //-> tant que
            while (touchePressee.Key != ConsoleKey.Escape)
            { 
            
            }

            //-> faire tant que 
            do
            {

            } while (touchePressee.Key != ConsoleKey.Escape);
            
            
            //--> comptage
            for (int i = 0; i < 10; i++)
            {


            }

            //--> comptage simplifier 
            // /!\ attention paramètre d'entrée qui doit défini à l'intérieur 
            foreach (int element in tbEntier)
            { 
                varE = element;
            }
        }
    }
}
