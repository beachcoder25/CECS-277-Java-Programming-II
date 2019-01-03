package lab6q2;

public class ExtraCheese extends ToppingDecorator {

	public ExtraCheese(Pizza newPizza) {
		super(newPizza); // Super = ToppingDecorator
		
		System.out.println("Adding Mozzerella @ $0.50");
	}

	// FROM TOPPINGDECORATOR
	@Override
	public String prepareFood() {
		
		//return tempPizza.prepareFood() + ", Extra Cheese";
		return super.prepareFood() + ", Extra Cheese";
	}
	
	@Override
	public double getCost() {
		
		//return tempPizza.getCost() + .50;
		return super.getCost() + 2.50;
		
	}
}
