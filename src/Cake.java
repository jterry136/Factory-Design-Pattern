/**
 * A cake class that describes a generic cake.
 * @author Jonathan Terry
 *
 */

import java.util.ArrayList;

public abstract class Cake {
	protected String name;
	protected double price;
	protected int numLayers;
	protected ArrayList<String> decorations;
	protected Shape shape;
	protected String flavor;
	protected String icing;
	
	/**
	 * The constructor for the abstract Cake class simply sets decorations to a new ArrayList of type String
	 * @return An abstract instance of Cake
	 */
	public Cake() {
		this.decorations = new ArrayList<String>();
	}
	
	/**
	 * This method makes the Cake by calling createLayers, frostCake, and addDecorations
	 */
	public void createCake() {
		createLayers();
		frostCake();
		addDecorations();
		System.out.println(getPrice());
	}
	
	/**
	 * This method notifies the user of what type of cake is being made
	 * based on the cakes shape and number of layers.
	 */
	private void createLayers() {
		if(this.shape == Shape.CUPCAKES) {
			System.out.println("Creating " + this.flavor + " cupcakes");
		}
		
		else if(this.shape == Shape.BUNT) {
			System.out.println("Creating a " + this.flavor + "bunt cake");
		}
		
		else if(this.shape == Shape.ROUND || this.shape == Shape.SHEET) {
				System.out.println("Creating a " + this.numLayers + " layer " + this.shape.toString().toLowerCase() + " " + this.flavor + " cake");
		}
		
		else {
			System.out.println("Error");
		}
	}
	
	/**
	 * This method notifies the user of the type of frosting being put on their Cake.
	 */
	private void frostCake() {
		System.out.println("Frost cake with " + this.icing + " icing");
	}
	
	/**
	 * This method notifies the user on what decorations are being put on the Cake.
	 */
	private void addDecorations() {
		for(int i = 0; i<decorations.size(); i++) {
			System.out.println("Adding " + decorations.get(i));
		}
	}
	
	/**
	 * This method returns the value of price.
	 * @return A double value representing the Cake's price
	 */
	public double getPrice() {
		return this.price;
	}
	

}
