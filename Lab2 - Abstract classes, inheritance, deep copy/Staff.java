package lab2;

public class Staff extends Employee {
	
	double hourlyRate = 0.00;
	double monthlySalary;
	
	public Staff(String ln, String fn, int idn, String g, 
			double hr, int d, int m, int y){
	
		
		super(ln, fn, idn, g, d, m, y);
		hourlyRate = hr;

		// monthlySalary = mS; Comes from interface
	
		
	}
	
	public double getHourlyRate() {
		return hourlyRate;
		
	}
	
	public void setHourlyRate(double hr) {
		hourlyRate = hr;
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	public double monthlyEarning() {

		double monthlySalary = hourlyRate * 160;  
				// * (double)EmployeeInfo.STAFF_MONTHLY_HOURS_WORKED;
		return monthlySalary;
	}
	
	
	// QUESTION: This is how we use super, correct?
	
	public String toString() {
		return "STAFF OR PART TIME:" + super.toString() + "Full time\nMonthly Salary: $" 
	+ monthlyEarning() + "\n";
	}
	
	
	

}
