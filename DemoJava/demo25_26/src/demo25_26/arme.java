package demo25_26;

public class arme 
{
	//-- attributs --// 
	//-- protected --// 
	protected int mDegats;
	protected String mNomComplet; 

	//-- private --//
	private int mTest1;
	private char mTest2;

	//-- constructeur --// 
	public arme() 
	{ 
		mTest1 = 10; 
		mTest2 = 'A'; 
	}
	
	public arme(String nomArme, int Degat) 
	{

	}

	public int Frapper() 
	{
	    int degatInflige = 0;

	    return degatInflige; 
	}

	public int Frapper(byte degat) // ref
	{
	    int degatInflige = 0;

	    return degatInflige;
	}

	public int Frapper(float degat) // out 
	{
	    int degatsInflige = 0;

	    degat = 0;

	    return degatsInflige;
	}
}
