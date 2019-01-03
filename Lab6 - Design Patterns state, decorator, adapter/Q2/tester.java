package lab6q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;




// https://hastebin.com/anuhamarog.java




public class tester {

	private static int choice;
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		Pizza basicPizza = new PlainPizza();
		System.out.println(basicPizza.getCost());

		Pizza basicPizza2 = new Sausage(new ExtraCheese(new PlainPizza()));
		System.out.println(basicPizza2.getCost());

		
		
		
		while(true) {


			System.out.println("========= The Cheesey Weasel Pizza Parlour =========\n");
			System.out.println("          1. Plain Pizza. ");
			System.out.println("          2. Add Extra Cheese ");
			System.out.println("          3. Add Pepperoni  ");
			System.out.println("          4. Add Sausage ");
			System.out.println("          5. Exit \n");

			// System.out.println("Enter your choice: ");
			//choice = in.nextInt();

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());

			//if(choice == 1) {


			switch(choice) {
			
			
			case 1:{
				PlainPizza pp = new PlainPizza();
				
				System.out.println(pp.prepareFood());
				System.out.println(pp.getCost());
				
				System.out.println("");
			} break;

			case 2:{

				basicPizza = new ExtraCheese(basicPizza);
				System.out.println(basicPizza.prepareFood());
				System.out.println(basicPizza.getCost());
				
				System.out.println("");

			}break;

			case 3:{

				basicPizza = new Pepperoni(basicPizza);
				System.out.println(basicPizza.prepareFood());
				System.out.println(basicPizza.getCost());
				

			}break;

			case 4:{

				basicPizza = new Sausage(basicPizza);
				System.out.println(basicPizza.prepareFood());
				System.out.println(basicPizza.getCost());
				
				
			}break;
			
			
			default:{
				System.out.println("Other than these no food available");
			}
			
			case 5:{
				
		
				return;
			}
			}
		}
	}
}


