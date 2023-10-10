package personnages;

public class Trophee {
	private Gaulois nom ; 
	private Equipement equipement;
	
	public Trophee(Gaulois nom, Equipement equipement) {
		super();
		this.nom = nom;
		this.equipement = equipement;
	}
	
	public Gaulois getNom() {
		return nom;
	}
	
	public Equipement getEquipement() {
		return equipement;
	}
	
	public String donnerNom() {
		return nom.getNom();
	}
}

