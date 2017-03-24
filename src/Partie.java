
public class Partie {

    private int tour;
    private JeuxCarte jc;
    private Joueur[] joueurs;

    /**
	* Construit une instance de Partie.
	*/
    public Partie() {
        this.tour = 0;
    }

    /**
	* Retourne le numéro de tour de la partie en cours.
	*/
    public int getTour() {
        return this.tour;
    }

    /**
	* Retourne le numéro de tour de la partie en cours.
	*/
    public String toString() {
        String s = ("Nombre de tour : "+this.tour);
        return s;
    }
    
	}


