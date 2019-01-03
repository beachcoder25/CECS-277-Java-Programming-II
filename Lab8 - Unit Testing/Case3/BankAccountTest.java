import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.*;



public class BankAccountTest {



	private BankAccount account1; // , account2; // test fixtures

	public static void main(String[] args) throws Exception {
		
		BankAccount ba = new BankAccount("Mr. Bryan Walton", 3.5);

		ba.setCredit(5.00); 
		ba.setDebit(2.0); 
		System.out.println("Current balance is " + ba.getBalance());

	}


	@Test
	public void testDebit() throws Exception {
		// assetEquals(String message, long expected, long actual)
		System.out.println("Run @Test testDebitPass"); // for illustration

		BankAccount ba = new BankAccount("Mr. Bryan Walton", 3.5);

		ba.setCredit(5.00); 
		ba.setDebit(2.0); 
		
		// WILL FAIL
			// b/c debit should be -=
		
		//assertEquals("Balance: ", 6.5, ba.getBalance(), 1e-14);
		
		
		// WILL PASS
		
		assertEquals("Balance: ", 10.5, ba.getBalance(), 1e-14);

	}

}
