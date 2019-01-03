package lab1Problem2;

public class CashRegisterTester {
	
	public static void main(String[] args)
	{
		final double NICKEL_VALUE = 0.05;
		final double DIME_VALUE = 0.1;
		final double QUARTER_VALUE = 0.25;
		final double DOLLAR_VALUE = 1.0;
		
		CashRegister myRegister = new CashRegister();
		myRegister.recordPurchase(1.82);
		System.out.println(myRegister.recordPurchase(1.82));
		myRegister.enterPayment(1, new MonetaryUnit(DOLLAR_VALUE, "dollar bill"));
		myRegister.enterPayment(3, new MonetaryUnit(QUARTER_VALUE, "quarter"));
		myRegister.enterPayment(2, new MonetaryUnit(NICKEL_VALUE, "nickel"));
		double myChange = myRegister.giveChange();
		System.out.println("Change: " + myChange);
		System.out.println("Expected: 0.03");
		
		
//		MonetaryUnit c1 = new MonetaryUnit(DOLLAR_VALUE, "dollar bill");
//		MonetaryUnit c2 = new MonetaryUnit(DIME_VALUE, "dollar bill");
//		MonetaryUnit c3 = new MonetaryUnit(QUARTER_VALUE, "dollar bill");
//		
//		
//		System.out.println(c1.getValue());
//		System.out.println(c2.getValue());
//		System.out.println(c3.getValue());
		

		}
	}
	


