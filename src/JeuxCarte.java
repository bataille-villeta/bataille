
public class JeuxCarte {

	private int nbCarte;
    private Carte[] JeuxCarte;

    public JeuxCarte(int nbCarte) {
        this.nbCarte = nbCarte;
        this.JeuxCarte = new Carte[nbCarte];
        
        for (int i=1; i<(nbCarte/4)+1; i++) {
            Carte c = new Carte(i, "pique");
            JeuxCarte[i] = c;
        }
        for (int i=1; i<(nbCarte/4)+1; i++) {
            Carte c = new Carte(i, "carreau");
            JeuxCarte[i+13] = c;
        }
        for (int i=1; i<(nbCarte/4)+1; i++) {
            Carte c = new Carte(i, "trefle");
            JeuxCarte[i+26] = c;
        }
        for (int i=1; i<(nbCarte/4)+1; i++) {
            Carte c = new Carte(i, "coeur");
            JeuxCarte[i+39] = c;
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
