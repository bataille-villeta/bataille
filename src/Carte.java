

public class Carte {
	
	private int valeur;
	private String couleur;
	//private String nomFichier;
	
	
	public Carte(int valeur, String couleur)
	{
		this.valeur = valeur;
		this.couleur = couleur;
	}
	
	
	public String toString()
	{
		String s;
		s = new String(this.valeur+" "+this.couleur);
		return s;
	}
	
	
	
	public int getValeur()
	{
		return this.valeur;
	}
	
	public String getCouleur()
	{
		return this.couleur;
	}
	
	public boolean plusGrand(Carte a)
	{
		if(this.valeur > a.getValeur())
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	public boolean memeCarte(Carte a)
	{
		if(this.valeur == a.getValeur())
		{
			return true;
		}
		
		else return false;
	}
	
	
	public static void main(String[] args)
	{
		Carte n1 = new Carte(12, "rouge");
		Carte n2 = new Carte(12, "noir");
		//System.out.println(n1.getCouleur());
		
		System.out.println(n2.memeCarte(n1));
		System.out.println(n1);
		
	}
	
}
