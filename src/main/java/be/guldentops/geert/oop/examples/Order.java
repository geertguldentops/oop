package be.guldentops.geert.oop.examples;

/* access modifier */
public class Order {

	// DATA - fields/attribute (types)/state (private)
	private String name;
	private int price;
	private int volume;
	private String countryCode;

	// BEHAVIOUR - methods (public)

	// Constructor - special method used to create objects of a class.
	// the name of this method must be EXACTLY the same as the class.

	// access modifier - NO RETURN TYPE - NameOfClass(parameter1, parameter2, ...) {
	//      body of the constructor (logic/code)
	//      NO RETURN !
	// }
	public Order(String name,
	             int price,
	             int volume,
	             String countryCode) {
		this.name = name;
		this.price = price;
		this.volume = volume;
		this.countryCode = countryCode;
	}

	// access modifier - return type - name(parameter1, parameter2, ...) {
	//      body of the method (logic/code)
	//      if return type not void return a value;
	// }
	public int calculateTotalPrice() {
		int totalPrice = price * volume;

		return totalPrice;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void changePriceTo(int price) {
		this.price = price;
	}
}
