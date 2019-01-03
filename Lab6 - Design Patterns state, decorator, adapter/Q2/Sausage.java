package lab6q2;

public class Sausage extends ToppingDecorator{

	
	
	
	public Sausage(Pizza newPizza) {
		super(newPizza); // Super = ToppingDecorator
		
		
		
		
		System.out.println("Adding Sausauge @ $1.00");
	}
	
	
	
	// FROM TOPPINGDECORATOR
	@Override
	public String prepareFood() {
		
		return super.prepareFood() + ", Sausage";
	}
	
	
	
	@Override
	public double getCost() {
		
		return super.getCost() + 3.50;
		
	}

}
