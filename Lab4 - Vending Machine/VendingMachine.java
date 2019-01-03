package lab4;

import java.util.ArrayList;

public class VendingMachine {
	
	// What properties and members do we need?
	
	ArrayList<Product> products;
	
	CoinSet currentCoin;
	CoinSet coins; // Why do we need this if we have current coin?
	int quantity;
	
	// It keeps track of the total coins in the machine
	
	
	// That should be the only attributes you need for Vending Machine...
	
	// METHODS
	
	// addCoin(Coin c) {

	
		//add c to currentCoins!!!
		
	
	// }
	
	
	  public void addProduct(Product p, int q) {
		  
		  quantity = q;
		  products.add(p);
		  
		  // use for loop to deal with quantity... No duplicates!
	  }
	  /*
	  What arguments should we use?
	  
	  Product p and int quantity
	  
	  
	   * 
	   * ArrayList can only store 1 cookie, do a for loop quantity times to add to arrayList
	  
	 */
	
	
	
	   void buyProduct(Product p)
	   {
	   
	   	  // If bought, you must remove from ArraList products
		   
		   
	   	  
	   	  for(products.size()) // Check to makesure it is in the list
	   	  
	   	  
	   	  
	   	  // Call method equals!!! To check if product is available for purchase
	   	  
	   	     pp == products.get(i) // .get() is a function of ArrayList
	   	     
	   	     if(p.equals(pp))
	   	     {
	   	     	// cHECK IF WE GOT ENOUGH MONEY BEFORE RELEASING PRODUCTS
	   	     	
	   	     	// Check currentcoin
	   	     	
	   	     	if(p.setPrice() < currentCoin.getvalue()){
	   	     	
	   	     	 // Remove p from products
	   	     		
	   	     	    products.remove(p);
	   	     	 
	   	     	 // Update the Coins
	   	     	 
	   	     	 // Clear(remove) all coins from the currentCoin
	   	     	
	   	     	
	   	     	}
	   	     	
	   	     
	   	     
	   	     }
	   
	   }
	 
}
