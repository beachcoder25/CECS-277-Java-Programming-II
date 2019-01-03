package lab7Q2;

public class SellStock implements Purchase{


	Stock product;
	int quantity;


	public SellStock(Stock p, int q) {

		product = p;
		quantity = q;
	}


	@Override
	public void action() {

		product.sell(quantity);

	}

}
