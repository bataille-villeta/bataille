import java.util.ArrayDeque;
import java.util.Stack;


public class Joueur {

		private String nom;
		private boolean actif;
		private MainJoueur main;
		private TableJoueur pile;
		
		/**
		* Construit une instance de Joueur.
		*/
		public Joueur(String n, boolean a)
		{
			this.nom=n;
			this.actif=a;
			this.main=new MainJoueur();
			this.pile=new TableJoueur();
		}
		
		/**
		* Récupère le nom du joueur.
		*/
		public String getNom()
		{
			return this.nom;
		}
		
		/**
		* Retourne true si un joueur joue toujours.
		*/
		public boolean getStaut()
		{
			return this.actif;
		}
		
		/**
		* Pose une carte de la main du joueur sur la table joueur.
		*/
		public void poseCarte()
		{
			this.main.enleveSurPile(main.getFirst());
		}
		
		public static void main(String[] args) 
		{
			JeuxCarte jeu = new JeuxCarte(53);
			MainJoueur main = new MainJoueur();
			TableJoueur pile = new TableJoueur();
			Joueur f = new Joueur("Foosko", true);
			
			Carte c1 = new Carte(1, "pique");
			Carte c2 = new Carte(2, "coeur");
			Carte c3 = new Carte(3, "carreau");
			Carte c4 = new Carte(4, "trefle");
			Carte c5 = new Carte(5, "pique");
			
			main.ajouteSurPile(c1);
			main.ajouteSurPile(c2);
			main.ajouteSurPile(c3);
			main.ajouteSurPile(c4);
			main.ajouteSurPile(c5);
			
			System.out.println(main.contient(c1));
			System.out.println(main.contient(c2));
			System.out.println(main.contient(c3));
			System.out.println(main.contient(c4));
			System.out.println(main.contient(c5));
			
			
			

			System.out.println(f.getNom());

		}
		
		

}
