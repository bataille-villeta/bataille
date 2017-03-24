
public class Partie {

    private int tour;
    private JeuxCarte jc;
    private Joueur[] joueurs;

    public Partie() {
        this.tour = 0;
    }

    public int getTour() {
        return this.tour;
    }

    public String toString() {
        String s = ("Nombre de tour : "+this.tour);
        return s;
    }
    
	}

}
