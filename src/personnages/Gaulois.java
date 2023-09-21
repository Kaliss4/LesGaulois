package personnages;

public class Gaulois {
	private String nom;
	private int force;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	private void parler(String texte) {
		System.out.println(prendreParole()+ "«"+ texte + "»");
	}
	private String prendreParole () {
		return "Le gaulois" + nom + " : ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}
	@Override
	public String toString() {
		return "Gaulois [getNom()=" + getNom() + ", prendreParole()=" + prendreParole() + "]";
	}
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois ("Asterix",  8);
		System.out.println(asterix);
	}
}
