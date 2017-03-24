import java.util.ArrayDeque;
import java.util.Stack;


public class Joueur {

		private String nom;
		private boolean actif;
		private MainJoueur;
		private TableJoueur;
		
		public Joueur(String n, boolean a)
		{
			this.nom=n;
			this.actif=a;
			this.mainJoueur=new ArrayDeque<Carte>();
			this.tableJoueur=new ArrayDeque<Carte>();
		}
		
		public String getNom()
		{
			return this.nom;
		}
		
		public boolean getStaut()
		{
			return this.actif;
		}
		
		public ArrayDeque<Carte> creerTable()
		{
			return new ArrayDeque();
		}
		
		public static void main(String[] args) {
			Carte f = new Carte("Foosko", true);
			System.out.println(f.getNom());
			ArrayDeque<Carte> s = f.creerTable();
			System.out.println(s.isEmpty());
			s.push(f);
			System.out.println(s.isEmpty());
			System.out.println(s.peek());
		}
		
		

}
