package lab6q2;

public class Pepperoni extends ToppingDecorator{
	
	public Pepperoni(Pizza newPizza) {
		super(newPizza); // Super = ToppingDecorator
		
		
		System.out.println("Adding Pepperoni @ $0.75");
	}
	
	
	
	// FROM TOPPINGDECORATOR
	@Override
	public String prepareFood() {
		
		
		return super.prepareFood() + ", Pepperoni";
	}
	
	@Override
	public double getCost() {
		
		return super.getCost() + 3.00;
		
	}

}
