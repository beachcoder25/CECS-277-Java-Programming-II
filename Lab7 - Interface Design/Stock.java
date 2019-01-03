package lab7Q2;

public class Stock {
	  
	   String stockName;
	   double price;
	  
	   
	   public Stock(String n, double p) {
		   
		   stockName = n;
	       price = p;
	   }
	  
	   
	   public void buy(int quantity){
		   
	       System.out.println("Bought: " + quantity + " shares of:\n" + this);
	   }
	  
	   
	   public void sell(int quantity){
		   
	       System.out.println("Sold: " + quantity + " shares of:\n" + this);
	   }
	   
	   
	   @Override
	   public String toString() {
	       return stockName + " @ $" + price + " per share\n";
	   }
	  
	}