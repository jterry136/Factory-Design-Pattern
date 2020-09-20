/**
 * A child class of Cake. It describes a typical Carrot Cake.
 * @author Jonathan Terry
 *
 */
public class CarrotCake extends Cake {
	
	/**
	 * A constructor for CarrotCake. All variables are set to some
	 * predefined value.
	 * @return An instance of CarrotCake
	 */
	public CarrotCake() {
		super();
		name = "Carrot Cake";
		price = 54.99;
		numLayers = 2;
		shape = Shape.ROUND;
		flavor = "Carrot";
		icing = "Cream Cheese";
		decorations.add("Walnuts");
		decorations.add("Candy Carrots");
	}

}
