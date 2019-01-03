package lab3;

/**
   Hold class name and total credits for each class
 */
public class Classes {
	
	private String className;
	private double credits = 0;
	
	
	public Classes(){
		
		className = null;
		credits = 0;
		
	}
	
	public Classes(String className, double credits){

		this.className = className;
		this.credits = credits;
		

	}
	
	
	/**
	   Returns total credits the course was, used in calculating GPA
	   @return credits for course
	 */
	
	
	public double getCredits()
	{
		return credits;
	}
	
	
	/**
	   Formats class item for report card
	   @return a formatted string of the class
	 */

	public String format()
	{
		return "Class: " + className +  "\ncredits: " + credits;
	}
	
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public double getcredits() {
		return credits;
	}

	public void setcredits(double gpacredits) {
		this.credits = gpacredits;
	}

}
