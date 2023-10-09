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
		this.equipement = new Equipement[2];
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
	public void sEquiper1 (Equipement test_elem) {
		switch (nbEquipement) {
		case 2 : 
			System.out.println("Le soldat " + nom + " est bien protégé");;
			break;
		
		case 1 : 
			if ( equipement[0]== test_elem ){
					System.out.println("Le soldat" + nom +" possede deja un " +  test_elem);
			break;
			}
		
		
		default:
			equipement[nbEquipement] = test_elem ;
			nbEquipement++;
			break;
		}
	}

//	public void recevoirCoup(int forceCoup) {
//		assert force >= 0 ; 
//		int forceAv = force ;
//		force -= forceCoup ; 
//		assert force < forceAv ;
//		if (force >0) {
//			parler ("Aie");
//		} else {
//			parler ("J'abandonne...");
//		}	
//	}

	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
//		if (force > 0) {
//		 parler("Aïe");
//		 } 
//		else {
//		 equipementEjecte = ejecterEquipement();
//		 parler("J'abandonne...");
//		 }
		if (force==0) {
		parler("Aïe");
		}
		else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
			}
		// post condition la force a diminuée
		assert force < oldForce;
		return equipementEjecte;
	}
	private int calculResistanceEquipement(int forceCoup) {
		String texte;
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement;) {
				if ((equipement[i]!= null && equipement[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				} 
				else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
				i++;
			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
		}
	
		private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + " s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipement[i] != null) {
				equipementEjecte[nbEquipementEjecte] = equipement[i];
				nbEquipementEjecte++;
				equipement[i] = null;
				}
			}
		return equipementEjecte;
		}
	
	
	public static void main (String[] args) {
		Romain unRomain = new Romain ("unRomain", 6);
		unRomain.sEquiper1(Equipement.CASQUE);
		unRomain.sEquiper1(Equipement.CASQUE);
		
	}

	public int getForce() {
		return force;
	}
}
