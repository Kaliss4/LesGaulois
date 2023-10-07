package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement ; 
	private int nbEquipement=1;
	
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
	public int sEquiper1 (Equipement Test) {
		switch (nbEquipement) {
		case 2 : {
			System.out.println("Le soldat Minus est bien protégé");;
		}
		case 1 : {
			if ( equipement[0]== Equipement.CASQUE ){
					System.out.println("Le soldat Minus possede deja un casque");
			}
			else if (equipement[0]== Equipement.BOUCLIER) {
				System.out.println("Le soldat Minus possede deja un bouclier");
			}
			else {
				equipement[nbEquipement] = Test;
				return nbEquipement++;
			}
		}
		default:
			equipement[nbEquipement] = Test ;
			return nbEquipement++;
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
		
		
	}
}
