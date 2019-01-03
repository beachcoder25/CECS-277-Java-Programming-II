package lab6q1;

import java.util.Scanner;

public class Tester {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		SimpleName name1 = new SimpleName("Jeff Fisher");
		NameAdapter nameAdapt1 = new NameAdapter(name1);
		
		System.out.println("Original full name: " + name1.name);

		System.out.println("\nTesting setters: ");
		
		//System.out.println("\nSet first name: ");
		
		//String fN = in.next();
		
		//System.out.println("\nSet last name: ");
		
		//String lN = in.next();
		
		nameAdapt1.setFirstName("Sean");
		nameAdapt1.setLastName("McVay");
		
		System.out.println("\nSet first name: " + nameAdapt1.getFirstName() 
		+ "\nSet last name: " + nameAdapt1.getLastName() + "\nNew full name: " 
				+ nameAdapt1.getFirstName() + " " + nameAdapt1.getLastName() );
		
		
		System.out.println("\ngetName() on SimpleName"
				+ " object directly: " + name1.getName());
		
		name1.setName("Bobby Joe");
		System.out.println("\nCalling setName() directly on "
				+ "SimpleName object, new name set to: " + name1.name);
		
		
		
		
		System.out.println("\nGet first name: " + nameAdapt1.getFirstName() 
		+ "\nGet last name: " + nameAdapt1.getLastName() + "\nGet New full name: " 
				+ nameAdapt1.getFirstName() + " " + nameAdapt1.getLastName() );
		
		
		System.out.println("\ngetName() on SimpleName"
				+ " object directly: " + name1.getName());
		
	}

}
