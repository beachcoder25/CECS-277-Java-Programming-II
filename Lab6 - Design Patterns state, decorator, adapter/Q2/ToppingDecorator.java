package lab6q2;


// Design a simple pizza and use three different 
// types of toppings (pepperoni, sausage, and extra cheese) in any order the customers wants.

public abstract class ToppingDecorator implements Pizza{ 
	
	// Implements allows ToppingDecorator access to the same information as plain pizza
	protected Pizza newPizza;
	//protected double totalCost = 0;
	
	public ToppingDecorator(Pizza newPizza) {
		
		this.newPizza = newPizza;
		//totalCost = 0;
	}
	
	// Implementing methods from Pizza Interface
	
	// Allows anything that implements ToppingDecorator access to these methods!!!
	
	public String prepareFood() {
		
		return newPizza.prepareFood();
	}
	
	public double getCost() {
		
		return newPizza.getCost();
		
	}
							
}
