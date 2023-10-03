package personnages;

public class Village {
	private String nom;
	private Chef chef ;
	private Gaulois [] villageois ;
	private int nbVillageois = 0 ;
	private int nbVillageoisMax ;
	
	public Village (String nom, int nbVillageoisMax) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMax];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void ajoutHabitant (Gaulois nomVillageois) {
		villageois [nbVillageois] = nomVillageois ;
		nbVillageois ++ ; 
	}
	
	public String trouverHabitant (int numVillageois) {
		String nomGaulois = villageois[numVillageois].getNom();
		return nomGaulois ;
	}
	
	public void afficherVillageois () {
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les legendaires gaulois :");
		int i = 0 ; 
		while (i<nbVillageois) {
			System.out.println("- "+ trouverHabitant(i));
			i++ ; 
		}
		
	}

	public String getNom() {
		return nom;
	}
	
	public static void main (String [] args) {
		Village village = new Village ("Village des Irreductibles", 30) ; 
		Chef chef = new Chef("Abraracourcix", 6, village);
		village.setChef(chef);
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajoutHabitant(asterix);
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajoutHabitant(obelix);
		village.afficherVillageois();
		/*Gaulois gaulois = village.trouverHabitant(1);
		System.out.println(gaulois);
		Erreur car Gaulois doit devenir String et il n'y a pas d'habitant en 1*/
		/*Gaulois gaulois = village.trouverHabitant(30); 
		 Erreur car le compilateur prend Gaulois en tant que type et il cherche le type String*/
		
	}
}
