package lab4;

public class Product {
	
	// Only need 2 things
	
	String description; // Title of the product EX: Cookie, Candy
	double price;
	
	// Overwrite the method equals
	
	boolean equals(Object other) {
		// Must be type object
		// Equal if they have same description AND same price!!!
		
		if (other == null) {
			return false;
		}
		
		else
		{
			Product p = Product (other); // Similar to clone
		}
		
		toString();
	}
	

}
