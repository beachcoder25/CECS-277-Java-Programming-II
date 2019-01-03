package lab7Q2;

public class BuyStock implements Purchase{
	
	int quantity;
	Stock product;
	 
	
	public BuyStock(Stock p, int q) {
		
		product = p;
		quantity = q;
	}
	


	@Override
	public void action() {
		
		product.buy(quantity);
	}

}