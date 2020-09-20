/**
 * A child class of Cake. It describes a typical Black Forest Cake.
 * @author Jonathan Terry
 *
 */
public class BlackForestCake extends Cake {
	
	/**
	 * A constructor for the BlackForestCake class. All variables are set to some
	 * predefined value.
	 * @return An instance of BlackForestCake
	 */
	public BlackForestCake() {
		super();
		name = "Black Forest Cake";
		price = 47.99;
		numLayers = 3;
		shape = Shape.ROUND;
		flavor = "Black Forest";
		icing = "Whipped Cream";
		decorations.add("Cherries");
		decorations.add("Chocolate Flakes");
		decorations.add("Whipped Cream");
	}

}
