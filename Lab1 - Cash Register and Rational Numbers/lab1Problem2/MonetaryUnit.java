package lab1Problem2;

/**
 * 
 * @author Jonah Cornish
 *
 * This class allows the creation of monetary objects (coins) for use for our calculations
 *
 */


public class MonetaryUnit {
	
	double coinValue;
	String coinName;


	/**
	 * 
	 * @param coinValue Amount the coin is worth
	 * @param coinName Name of the type of coin
	 */
	public MonetaryUnit(double coinValue, String coinName) {
		
		this.coinValue = coinValue;
		this.coinName = coinName;
		
	}
	
	
	/**
	 * 
	 * @return Coins value, used for testing purposes
	 */
	public double getValue() {
		
		return coinValue;
	}

}
