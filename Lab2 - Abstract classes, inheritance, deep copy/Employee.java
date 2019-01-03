package lab2;

import java.util.Calendar;

public abstract class Employee implements Comparable<Employee>, EmployeeInfo {
	
	// Explanation of why Employee is abstract?
	
	String fn;
	String ln;
	
	int idNumber;
	String gender; // M or F
	
//	int m= 0;
//	int d = 0;
//	int y = 0;
	
	Calendar dob = Calendar.getInstance(); // Is defaulted to current time
	

			//Calendar.getInstance();
	
	
	//QUESTIONS:
	
	// How to implement monthlyEarning abstract method?
	// DOB use calendar Java class
	
	
	
	public Employee(){
		
	}
	
	public Employee(String ln, String fn, int idn, String g, int m, int d, int y)
	{
		this.ln = ln;
		this.fn = fn;
		this.idNumber = idn;
		this.gender = g; // M or F
	
		
		
		
		dob.set(Calendar.MONTH, m);
		dob.set(Calendar.DATE, d);
		dob.set(Calendar.YEAR, y); 
		
	}
	
	
	public String toString()
	{
		return "\nEmployee ID Number:" 
				+ idNumber + "\nEmployee name: " + fn + " " + ln
				+ "\nBirth Date: " + dob.get(Calendar.MONTH) 
				+ "/" + dob.get(Calendar.DATE) 
				+ "/" + dob.get(Calendar.YEAR)+ "\n" ;
	}
	public int compareTo(Employee otherE)
	   {
	      // Comparison is done in employee class, but actual sorting done in main
	     return otherE.getLastName().compareTo(getLastName()); 
	   }
	
	//public int compare()
	
	// Implement sorting algorithm 
	
	
	
	public static int max(Employee e1, Employee e2) {
		
		return e1.compareTo(e2);
		
	}
	
	// Abstract method for monthly earning
	
	
	// Accessors
	
	public String getLastName() {
		return ln;
	}
	
	public String getFirstName() {
		return fn;
	}
	
	public int getID() {
		return idNumber;
	}
	
	public String getGender() {
		return gender;
	}
	
	public Calendar getDOB() {
		return dob;
	}
	
	// Mutators
	
	public void setDOB(Calendar d) {
		dob = d;
	}
	
	public void setLastName(String ln) {
		this.ln = ln;
		
	}
	
	public void setFirstName(String fn) {
		this.fn = fn;
		
	}
	
	public void setIDNumber(int x) {
		idNumber = x;
		
	}
	
	public void setGender(String g) {
		gender = g;
	}
	
	public abstract double monthlyEarning();
	
}
