package lab5;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
Writing a simple lottery program. The program should randomly generates a wining lottery ticket, them prompt the player to enter a lotto numbers. Depending on how many numbers match, the player wins various prizes.
*/

public class lottery {

	Set<Integer> numbers;
	Iterator<Integer> iter;
	static Scanner in;

	public lottery() {

		numbers = new TreeSet<Integer>(); // New TreeSet of ints
		iter = numbers.iterator(); // Iterator for list
		in = new Scanner(System.in); // Scanner for input

	}

	public static void main(String[] args) {

	/*
	 	Sample output
	  
		Type 6 lotto numbers: 4  12  7  35  20  1
		Your ticket was: [ 4, 12, 7, 35, 20, 1]
		Winning numbers: [ 2, 13, 27, 7, 11, 4]
		Match numbers: [4,7]
		Your prize is $500.00
	*/

		//System.out.println("Lottery program has begun: ");
		Set<Integer> winningNumbers = generateWinningNumbers(); // New s
		Set<Integer> lottoTicket = getTicket();
		

		// Keep only the winning numbers from the user's ticket
		Set<Integer> matchingNumbers  = new TreeSet<Integer>(lottoTicket);
		matchingNumbers.retainAll(winningNumbers);


		// Prints the results
		System.out.println("\nYour choice of Lotto numbers: " + lottoTicket);
		System.out.println("The winning numbers: " + winningNumbers);
		System.out.println("\nYour ticket had " + matchingNumbers.size() + " numbers that matched!!!");

		
		if(matchingNumbers.size() > 0) {
			
			double prize = 0;
			
			if (matchingNumbers.size() == 1) {
				
				prize = 100;
			}
			
			else if (matchingNumbers.size() == 2) {
				
				prize = 1000;
			}
			
			else if (matchingNumbers.size() == 3) {
				
				 prize = 10000;
			}
			
			else if (matchingNumbers.size() == 4) {
				
				 prize = 100000;
			}
			
			else if (matchingNumbers.size() == 5) {
				
				 prize = 1000000;
			}
			
			else {
				 prize = 10000000;
			}
				

			System.out.println("The matched numbers were " + matchingNumbers);
			System.out.printf("You have won: $%4.2f" , prize);
		}
	}

	/*
	Requirements: Inplement the following methods in your program

	public static Set<Integer> generateWinningNumbers( )
	Winning numbers should be between 1 and 40
	
	*/
	public static Set<Integer> generateWinningNumbers() {
		
		Set<Integer> winningNumbers = new TreeSet<Integer>();
		Random randomNum = new Random();
		
		while(winningNumbers.size() < 6){
			int number = randomNum.nextInt(40) + 1;
			winningNumbers.add(number);
		}
		
		return winningNumbers;
	}
	
	/*
	public static Set<Integer> getTicket( )
	Read the player's lottery ticket from the console
	*/
	
	public static Set<Integer> getTicket() {
		Set<Integer> ticket = new TreeSet<Integer>();
		
		System.out.println("Enter 6 different numbers for your ticket, press enter after each number");
		in = new Scanner(System.in);
		
		while(ticket.size() < 6) {
			
			int number = in.nextInt();
			ticket.add(number);
		}
		return ticket;
		
	}

}




