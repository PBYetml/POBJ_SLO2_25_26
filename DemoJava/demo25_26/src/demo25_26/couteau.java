package demo25_26;

public class couteau extends arme{

    //-- attribut --// 
    //-- private --// 
    private String mTypeArme;
    private String mModele;

    // constructeur 
    public couteau() 
    { 
    	super(); 
    	mDegats = 10; 
    	
    }
    public couteau(String Modele, int degats)
    { }

    @Override 
    public int Frapper()
    {
        int degatsInflige = 0;

        return degatsInflige;
    }

    @Override 
    public int Frapper( byte degat) 
    {
        int degatsInflige = 0;

        return degatsInflige; 
    }

    @Override 
    public int Frapper( float degat )
    {
        int degatsInflige = 0;

        degat = 0; 

        return degatsInflige;
    }
}


