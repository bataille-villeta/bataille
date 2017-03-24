import java.util.ArrayDeque;


public class TableJoueur {

	private ArrayDeque<Carte> pile;
	
	/**
	* Construit une instance de CompteBancaire.
	*/
	public TableJoueur()
	{
		this.pile = new ArrayDeque<Carte>();
	}
	
	/**
	* Ajoute une carte au-dessus de la table.
	*/
	public void ajouteSurPile(Carte c){
		this.pile.addFirst(c);
	} 
	
	
	
	/**
	* Construit une instance de CompteBancaire.
	*/
	public void enleveSousPile(Carte c){
		this.main.removeLast();
	} 

}
