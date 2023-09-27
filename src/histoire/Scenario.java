package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Druide panoramix = new Druide ("Panoramix", 5, 10);
		panoramix.prendreParole () ; 
		panoramix.parler ("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		Gaulois obelix = new Gaulois ("Obelix",  25);
		panoramix.booster(obelix);
		obelix.prendreParole();
		obelix.parler("Par Belenos, ce n'est pas juste !");
		Gaulois asterix = new Gaulois ("Asterix",  8);
		panoramix.booster(asterix);
		Romain minus = new Romain ("Minus", 6);
		asterix.prendreParole();
		asterix.parler ("Bonjour");
		minus.prendreParole(); 
		minus.parler ("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		
		
	}

}
