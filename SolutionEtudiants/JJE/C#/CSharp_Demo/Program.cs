namespace CSharp_demo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //-- variable
            //-- type primaire - Entier
            //-- booléen - taille : 1 octet
            bool varT = true;   // uniquement keyword "true" ou "false"

            //-- entier
            //-- taille : 1 octet
            //-- non signé
            byte varB = 10;     // cast implicite avec la constante numérique

            //-- signé (s) -> -128 à 127
            sbyte varBis = -10;    // cast implicite avec la constante numérique

            //-- taille : 2 octets
            //-- non signé (u)
            ushort varUS;        // cast implicite avec la constante numérique

            //-- signé
            short varS;         // cast implicite avec la constante numérique

            //-- taille : 4 cotets
            //-- non signé (u)
            uint varUE;

            //-- signé
            int varE;

            //-- taille : 8 octets
            //-- non signé (u) -> L
            ulong varUL = 100;
            varUL = 100L;      // soit itilisation du format L -> xxxxL

            //-- signé
            long varL;              // soit caster la valeur

            //-- gestion des caractères => 1 seul
            char lettre = 'a';              // -> caractère standard
            char lettrebis = '\u0065';      // -> caractère unicode
            char lettreHex = (char)0x65;    // -> cast -> caractère ASCII - table standard


            // type primaire - Reel
            //-- taille : 4 octets
            float varF = (float)3.14;       // obligation du cast
            varF = 3.14F;                   // format de valeur -> F

            //-- 8 octets
            double varD = 3.14;
            varD = 3.14D;                   // format de valeur -> D

            //-- 16 octets
            decimal varDD = 3.14M;          // format de valeur -> M
            varDD = (decimal)3.14;

            //-- tableau de type primaire
            //-- tableau entier 10 case
            uint[] tbEntier = new uint[10];

            //-- tableau multidimension --//
            //-- tableau entier 10 cases
            uint[] tbEntier = new uint[10];

            //-- tableau 3 dimension[x, y, z]
            int[,,] tbEntier_3Dim = new int[,,]
            {
                {0, 1, 2 },{0, 1, 2 }
            },
            {
                { 0, 1, 2 },{ 0, 1, 2 }
            },
            {
                { 0, 1, 2 },{ 0, 1, 2 }
            }

            //-- objets utiles
            //-- chaîne de caractère -> String 
            String chaine = "Hello SLO";

            String[] weekDays = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];

            //-- touches clavier
            //--> ConsoleKey -> énumération

            //-- console -> message user 
            //-- --> console --> writeline
            Console.WriteLine(chaine + 2 + "année" + 26);

            //--> console -> write
            Console.Write(varUS);
            Console.Write("\n");
            Console.Write(chaine);
            Console.Write("\n");
            Console.Write(varUS.ToString("x"));
            Console.Write("\n");
            Console.Write(varD);
            Console.Write("\n");
            Console.Write(varD.ToString("f1"));
            Console.Write("\n");

            //-- récupération d'une chaîne de caractères
            //--> console -> readline -> retour sur un string
            //--> console -> read -> retour format désiré
            chaine = Console.ReadLine();

            Console.WriteLine(chaine);

            varE = int.Parse(Console.ReadLine());
            Console.Write(varE.ToString("D"));

            //-- Conversion chaîne de caractère en nombre entier

            ConsoleKeyInfo touchePressee;

            touchePressee = Console.ReadKey();

            //-- test --//
            //-> if
            if(touchePressee.Key == ConsoleKey.F1)
            {

            }
            else if(touchePressee.Key == ConsoleKey.Escape)
            {

            } 

            else
            {

            }

            //-> switch
            switch(touchePressee.Key)
            {
                case ConsoleKey.F1:

                    break;

                case ConsoleKey.F2:

                    break;

                default:

                    break;
            }

            //-- iteration --//
            //-> tant que
            while(touchePressee.Key != ConsoleKey.Escape)
            {

            }

            //-> faire tant que
            do
            {

            } while (touchePressee.Key != ConsoleKey.Escape);

            //-> comptage
            for(int i = 0; i < 10; i++)
            {

            }

            //-> comptage simplifié
            // /!\ attention paramètre d'entrée qui doit être défini à l'intérieur
            foreach(int element in tbEntier)
            {
                varE = element;
            }











            Console.WriteLine("Hello, World!");
        }
    }
}