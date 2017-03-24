
public class JeuxCarte {

	private int nbCarte;
    private Carte[] JeuxCarte;

    /**
	* Construit une instance de JeuxCarte.
	*/
    public JeuxCarte(int nbCarte) {
        this.nbCarte = nbCarte;
        this.JeuxCarte = new Carte[nbCarte];
        
        for (int i=0; i<(nbCarte/4); i++) {
            Carte c = new Carte(i+1, "pique");
            JeuxCarte[i] = c;
        }
        for (int i=0; i<(nbCarte/4)+1; i++) {
            Carte c = new Carte(i+1, "carreau");
            JeuxCarte[i+(nbCarte/4)] = c;
        }
        for (int i=0; i<(nbCarte/4)+1; i++) {
            Carte c = new Carte(i+1, "trefle");
            JeuxCarte[i+(nbCarte/4)*2] = c;
        }
        for (int i=0; i<(nbCarte/4)+1; i++) {
            Carte c = new Carte(i+1, "coeur");
            JeuxCarte[i+(nbCarte/4)*3] = c;
        }

        System.out.println(JeuxCarte);

    }

    public int getNbCarte() {
        return this.nbCarte;
    }
    
    public Carte getCarte(int i) {

    	 return this.JeuxCarte[i];
    }

/*    public String toString() {
        String s;
        s = ("Le jeux de cartes : \n");
        for (int i=1; i<27; i++) {
            s += (JeuxCarte[i]);
        }
        return s;
    }
*/
    public static void main(String args[]) {
    	JeuxCarte jeu = new JeuxCarte(53);
    	
    	for(int i=1;i<52;i++)
        {
    		System.out.println(jeu.getCarte(i));
    		//System.out.println(jeu.getCarte(i));
        }
    }

}
