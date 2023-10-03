package personnages;

public class Romain {
	private String nom;
	private int force;
	Equipement[] equipement ; 
	private int nbEquipement=0;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force >=0 ; 
		Equipement[] equipement = new Equipement[nbEquipement];
		}
		
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole()+ " "+ texte + " ");
	}
	public String prendreParole () {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		assert force >= 0 ; 
		int forceAv = force ;
		force -= forceCoup ; 
		assert force < forceAv ;
		if (force >0) {
			parler ("Aie");
		} else {
			parler ("J'abandonne...");
		}	
		
	
	}
	public void sEquiper (Equipement nomEquipement) {
		// TODO : Faire le switch
		switch (key) {
		case value: {
			
			yield type;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}
	}
	public static void main (String[] args) {
		Romain unRomain = new Romain ("unRomain", (6));
		unRomain.prendreParole();
		unRomain.parler("Salut");
		unRomain.recevoirCoup(8);
		
	}
}
