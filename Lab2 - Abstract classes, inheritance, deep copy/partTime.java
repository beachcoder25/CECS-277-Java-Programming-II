package lab2;

import java.util.Calendar;

public class partTime extends Staff{

	int hoursWorkedPerWeek = 0;
	//double hourRATE = 45.22;
	double incomeTotal;

	
	
	public partTime(String ln, String fn, int idn, String g, double hr, int hw, int bd, int bm, int by){
		
		// super(variables in super class not in PT)
		
		super(ln, fn, idn, g, hr, bd,bm,by);
		hoursWorkedPerWeek = hw;
	
		// setDOB(dob);
		// Hour

		
	}
	
	//public partTime()
	
	public double monthlyEarning() {
		
		incomeTotal = hourlyRate * hoursWorkedPerWeek * 4;
		// (double)hoursWorkedPerWeek * 4;
		return incomeTotal;
	}
	

	
	public double getHoursWorkedPerWeek() {
		return hoursWorkedPerWeek;
	}
	
	
	public String toString() {
		return super.toString() + "Hours worked per week: " + hoursWorkedPerWeek 
		+ "\nMonthly Salary: " + incomeTotal + "\n"; 
	}
	
}


