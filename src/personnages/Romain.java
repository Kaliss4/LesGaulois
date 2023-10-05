package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement ; 
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
	public void sEquiper1 (Equipement equipement) {
		switch (equipement.length) {
		case 2 : {
			System.out.println("Le soldat Minus est bien protégé");;
		}
		case 1 : {
			if (equipement[1] == "Casque"){
					System.out.println("Le soldat Minus possede deja un casque");
			}
			else {
				System.out.println("Le soldat Minus possede deja un bouclier");
			}
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + equipement.length);
		}
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

	public static void main (String[] args) {
		Romain unRomain = new Romain ("unRomain", (6));
		unRomain.prendreParole();
		unRomain.parler("Salut");
		unRomain.recevoirCoup(8);
		
	}
}
