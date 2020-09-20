/**
 * A child of class Cake. This describes a typical Birthday Cake.
 * @author Jonathan Terry
 *
 */
public class BirthdayCake extends Cake {
	
	/**
	 * A constructor for this class. All variables are set to some predefined value.
	 * @return An instance of BirthdayCake
	 */
	public BirthdayCake() {
		super();
		name = "Birthday Cake";
		price = 109.99;
		numLayers= 1;
		shape = Shape.SHEET;
		flavor = "Funfetti";
		icing = "Vanilla";
		decorations.add("Sprinkles");
		decorations.add("Candy Flowers");
		decorations.add("Icing Writing");
		
		
	}

}
