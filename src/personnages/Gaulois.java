package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole()+ " "+ texte + " ");
	}
	public String prendreParole () {
		return "Le gaulois " + nom + " : ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force / 3 *effetPotion);
	}
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion ; 
		parler ("Merci Druide, je sens que ma force est " + forcePotion + " fois decuplee.");
	}
	@Override
	public String toString() {
		return "Gaulois [getNom=" + getNom() + ", prendreParole()=" + prendreParole() + "]";
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois ("Asterix",  8);
		System.out.println(asterix);
		asterix.prendreParole();
		asterix.parler("Bonjour");
		Romain unRomain = new Romain ("unRomain", 3);
		asterix.frapper(unRomain);
		Druide panoramix = new Druide ("Panoramix", 5 , 10);
		asterix.boirePotion(panoramix.preparerPotion()) ;
		
	}
}
