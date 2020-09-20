/**
 * This class represents a Bakery. It has methods that enable cake ordering and cake creation.
 * @author Jonathan Terry
 *
 */
public class Bakery {
	
	/**
	 * This method represents the creation of the Cake in the Bakery.
	 * @param type A String that specifies which child class of Cake is being made
	 * @return An instance of a child of Cake, the specific class depends on the value of type.
	 */
	private Cake createCake(String type) {
		
		Cake cake;
		
		if(type.equalsIgnoreCase("Carrot Cake")) {
			cake = new CarrotCake();
		}
		
		else if(type.equalsIgnoreCase("Black Forest Cake")) {
			cake = new BlackForestCake();
		}
		
		else if(type.equalsIgnoreCase("Birthday Cake")) {
			cake = new BirthdayCake();
		}
		
		else {
			cake = null;
			System.out.println("There was a problem with the order");
		}
		
		return cake;
		
	}
	
	/**
	 * This method represents the ordering process. First the Cake is created, then the price is given.
	 * Lastly, it is returned to the user/customer.
	 * @param type A String that specifies what kind of Cake (child of Cake class) is being made.
	 * @return An instance of a child of Cake, the specific class depends on the value of type.
	 */
	public Cake orderCake(String type) {
		Cake orderedCake = createCake(type);
		orderedCake.createCake();
		orderedCake.getPrice();
		return orderedCake;
	}

}
