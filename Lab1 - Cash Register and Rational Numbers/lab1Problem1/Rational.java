package lab1Problem1;

import java.util.Scanner;


/**
 * 
 * @author Jonah Cornish
 *
 * This class allows us to interact with Rational numbers for various calculations
 *
 */
public class Rational {

	private int numerator;
	private int denominator;
	private double numeratorDouble;
	private double denominatorDouble;
	
	
/**
 * Default Constructor 
 */

	public Rational()
	{
		numerator = 0;
		denominator = 0;

	}

	
	/**
	 * Paramaterized Constructor 
	 */
	
	public Rational(int num, int den)
	{
		numerator = num;
		denominator = den;
	}
	
	/**
	 * Paramaterized Constructor for Double
	 */
	
	public Rational(double num, double den)
	{
		numeratorDouble = num;
		denominatorDouble = den;
		
	}
	
	/**
	 * 
	 * @return Numerator
	 */
	
	public int getNumerator() {
		return numerator;
	}
	
	/**
	 * 
	 * @return Numerator Double
	 */
	
	public double getNumeratorDouble() {
		
		numeratorDouble = (double)numerator;
		return numeratorDouble;
	}

	/**
	 * 
	 * @return Denominator
	 */
	
	public int getDenominator() {
		return denominator;
	}
	
	/**
	 * 
	 * @return Denominator Double
	 */
	
	public double getDenominatorDouble() {
		
		denominatorDouble = (double)denominator;
		return denominatorDouble;
	}

	/**
	 * 
	 * Set Numerator
	 */
	
	public void setNumerator(int value) {
		numerator = value;
	}

	/**
	 * 
	 * Set Denominator
	 */
	
	public void setDenominator(int value) {
		denominator = value;
	}

	/**
	 * 
	 * @return Rational number based off user input
	 */
	public  Rational inputRational() {

		Scanner in = new Scanner(System.in);

		System.out.println("Please input the numerator: ");
		numerator = in.nextInt(); 

		System.out.println("Please input the denominator: ");
		denominator = in.nextInt(); 
		
		return new Rational(numerator, denominator);
	
	}

	/**
	 * Converts to string
	 */
	
	public String toString() {

		return "numerator: " + numerator + ", denominator: " + denominator;
	}
	/**
	 * Reduction method used for testing, never used in runtime
	 */
	
	private void reduce()
	{
		if (numerator != 0)
		{
			int common = gcd(numerator, denominator);

			numerator = numerator / common;
			denominator = denominator / common;
		}

	}
	
	/**
	 * 
	 * @param m First denominator
	 * @param n Second denominator
	 * @return Greatest Common Denominator
	 */
	private int gcd(int m, int n) {

		int r;
		while(n != 0) {
			r = m % n;
			m = n;
			n = r;
		}

		return m;
	}

	/**
	 * 
	 * @param r1 Rational number for calculations
	 * @param r2 Rational number for calculations
	 * @return Sum of added Rational numbers
	 */
	
	public Rational add(Rational r1, Rational r2) {

		numerator = ((r1.getNumerator() * r2.getDenominator()) + (r1.getDenominator()  * r2.getNumerator()));
		denominator = (r1.getDenominator() * r2.getDenominator());
		
		return new Rational(numerator, denominator);
		
	}
	
	/**
	 * 
	 * @param r1 Rational number for calculations
	 * @param r2 Rational number for calculations
	 * @return Sum of subtracted Rational numbers
	 */
	
	public Rational sub(Rational r1, Rational r2) {
		
		numerator = ((r1.getNumerator() * r2.getDenominator()) - (r1.getDenominator()  * r2.getNumerator()));
		denominator = (r1.getDenominator() * r2.getDenominator());
				
		return new Rational(numerator, denominator);
		
	}
	
	/**
	 * 
	 * @param r1 Rational number for calculations
	 * @param r2 Rational number for calculations
	 * @return Product of multiplication
	 */
	
	public Rational mul(Rational r1, Rational r2) {

		int numerator = r1.getNumerator() * r2.getNumerator();
		int denominator = r1.getDenominator() * r2.getDenominator();

		return new Rational(numerator, denominator);
		
	}
	
	/**
	 * 
	 * @param r1 Rational number for calculations
	 * @param r2 Rational number for calculations
	 * @return Product of division
	 */
	
	public Rational div(Rational r1, Rational r2) {
		
		int numerator = r1.getNumerator() * r2.getDenominator();
		int denominator = r1.getDenominator() * r2.getNumerator();
		
		return new Rational(denominator, numerator);
		
	}
	
	/**
	 * 
	 * @param r1 Rational number for calculations
	 * @param r2 Rational number for calculations
	 * @return Product of double division
	 */
	
	public static double divToDouble(Rational r1, Rational r2) {
		
		double numerator = (double)r1.getNumerator() * (double)r2.getDenominator();
		double denominator = (double)r1.getDenominator() * (double)r2.getNumerator();
		
		double total = (numerator /  denominator);
		
		return total;
	}
	
	/**
	 * 
	 * Main method for testing
	 */
	
	public static void main(String[] args) {

		
		
		Rational r3 = new Rational();
		r3.inputRational();
		System.out.println("\n");
		Rational r1 = new Rational(r3.getNumerator(), r3.getDenominator());
		
		r3.inputRational();
		System.out.println("\n");
		Rational r2 = new Rational(r3.getNumerator(), r3.getDenominator());
		
		
		r3.add(r1, r2);
		System.out.println("ADDITION: " + r1.getNumerator() + " / " + r1.getDenominator() + 
				" + " + r2.getNumerator() + " / " + r2.getDenominator() + 
				" = " + r3.getNumerator() + " / " + r3.getDenominator() + "\n");
		
		
		r3.sub(r1, r2);
		System.out.println("SUBTRACTION: " + r1.getNumerator() + " / " + r1.getDenominator() + 
				" - " + r2.getNumerator() + " / " + r2.getDenominator() + 
				" = " + r3.getNumerator() + " / " + r3.getDenominator() + "\n");
		
		r3 = r3.mul(r1, r2);
		System.out.println("MULTIPLICATION: " + r1.getNumerator() + " / " + r1.getDenominator() + 
				" * " + r2.getNumerator() + " / " + r2.getDenominator() + 
				" = " + r3.getNumerator() + " / " + r3.getDenominator() + "\n");
		
		
		// Why do I have to assign r3 =? It wont work with r3.div(r1, r2) ???????????????????????????
		r3 = r3.div(r1, r2); 
		System.out.println("DIVISION: " + r1.getNumerator() + " / " + r1.getDenominator() + 
				" / " + r2.getNumerator() + " / " + r2.getDenominator() + 
				" = " + r3.getDenominator() + " / " + r3.getNumerator() + "\n");
		
		System.out.println("DIVISION AS DOUBLE (Real Number): " + divToDouble(r1, r2) + "\n\n");
		
		r1.setNumerator(2);
		r2.setDenominator(5);
		
		System.out.println("Changed Numerator and Denominator:\n");
		System.out.println("Numerator: " + r1.getNumerator() + " \nDenominator: " + r2.getDenominator());
		
	}
}
	





