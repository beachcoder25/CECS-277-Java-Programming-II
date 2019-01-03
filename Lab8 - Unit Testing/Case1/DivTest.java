import static org.junit.Assert.*;

import org.junit.Test;

public class DivTest {

	@Test
	public void testDivIntPass() {
		assertEquals("error in divInt()", 3, Calculator.divInt(9, 3));
		assertEquals("error in divInt()", 0, Calculator.divInt(1, 9));
	}
	
	@Test
	public void testDivIntFail() {
		assertNotEquals("error in divInt()", 1, Calculator.divInt(9, 3));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void tesDivIntByZero() {
		Calculator.divInt(9, 0);
	}
	
	@Test
	public void testDivRealPass() {
		assertEquals("error in divInt()", 0.333333, Calculator.divReal(1, 3), 1e-6);
		assertEquals("error in divInt()", 0.111111, Calculator.divReal(1, 9), 1e-6);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void tesDivIntRealByZero() {
		Calculator.divReal(9, 0);
	}

}
