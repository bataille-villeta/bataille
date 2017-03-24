import java.util.ArrayDeque;

public class MainJoueur {
	
	private ArrayDeque<Carte> main;
	
	/**
	* Construit une instance de MainJoueur.
	*/
	public MainJoueur()
	{
		this.main = new ArrayDeque<Carte>();
	}
	
	/**
	* Ajoute une carte en-dessous de la main.
	*/
	public void ajouteSousPile(Carte c){
		this.main.addLast(c);
	} 
	
	/**
	* Pose une carte de la main sur la table.
	*/
	public void enleveSurPile(Carte c){
		this.main.removeFirst();
	} 
	
	/**
	* Retourne true si la main contient la Carte C.
	*/
	public boolean contient(Carte c){
		if(this.main.contains(c)) return true;
		else return false;
	}

}

