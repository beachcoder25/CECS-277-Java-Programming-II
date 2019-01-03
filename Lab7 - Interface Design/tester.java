package lab7Q2;

public class tester {

	public static void main(String[] args) {




		Stock microsoft = new Stock("Microsoft", 110);
		Stock exxon = new Stock("Exxon", 15);
		Stock google = new Stock("Google", 85);
		Stock marijuanaStock = new Stock("Marijuana Stock", 420);



		Purchase stock1 = new BuyStock(microsoft, 10);
		Purchase stock2 = new BuyStock(exxon, 3);
		Purchase stock3 = new BuyStock(google, 7);
		Purchase stock4 = new BuyStock(marijuanaStock, 100);
		
		
		stock1.action();
		stock2.action();
		stock3.action();
		stock4.action();

		System.out.println("");

		Purchase stock5 = new SellStock(microsoft, 6);
		Purchase stock6 = new SellStock(exxon, 3);
		Purchase stock7 = new SellStock(google, 4);
		Purchase stock8 = new SellStock(marijuanaStock, 42);
		
		stock5.action();
		stock6.action();
		stock7.action();
		stock8.action();

		
	}


}


