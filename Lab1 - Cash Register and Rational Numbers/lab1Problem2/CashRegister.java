package lab1Problem2;


/**
 * 
 * @author Jonah Cornish
 *
 * This class allows the creation of Cash Register objects, and provides methods to calculate purchases
 */
public class CashRegister {
	
	double total;
	double change;
	double totalCoinAmount;
	
	public CashRegister(){
		
		total = 0;
		change = 0;
		
	}
	
	/**
	 * 
	 * @param numberOfCoins Number of the type of coin
	 * @param m Monetary Unit object, provides name and value
	 * @return Total amount of coins deposited for purchase
	 */
	public double enterPayment(double numberOfCoins, MonetaryUnit m) {
		
		totalCoinAmount = totalCoinAmount + (numberOfCoins * m.getValue());
		return totalCoinAmount;
	}
		
	
	/**
	 * 
	 * @param total Amount of purchase
	 * @return Amount of purchase
	 */
	public double recordPurchase(double total) {
		
		this.total = total;
		return this.total;
	}
	
	/**
	 * 
	 * @return Change, rounded to 2 decimals
	 */
	
	public double giveChange() {
		
		double change = totalCoinAmount - this.total;
		double roundOff = Math.round(change * 100.0) / 100.0; // Source: https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
		return roundOff;
			
	}

}
