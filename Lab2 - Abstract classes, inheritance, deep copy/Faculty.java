package lab2;

public class Faculty extends Employee implements Cloneable{

	private Education e1;
	Level cName;
	
	
	String title; 
	String AS;
	String AO;
	String FU;


	
	
	public enum Level {
		AS, AO, FU // These represent integers
	}

	
	
	// Empty Faculty constructor okay?
	
	public Faculty() {
		
		// ???
	
	 
	}

	public Faculty(String ln, String fn, int idn, 
			String g, Education e, Level l, int d, int m, int y) {

		super(ln,fn,idn,g, d, m , y); // This constructs the employee object
	    this.e1 = e; // This creates the education object
		this.cName = l;		
	}
	
//	 public Faculty(Faculty ff) { // Clone method
//		 super(f.getLastName());
//		
//		this.name = f.getFirstName();
//		this.ID = f.getID();
//		this.gender = f.getGender();
//	 }

	
	public Object clone() throws CloneNotSupportedException {
		
		
		return super.clone();
//		Faculty f1 = (Faculty) super.clone();  // super.clone is an EMPLOYEE
//		this.e1 = (Education) e1.clone();
//		f1.setEducation(this.e1);
//		return f1;
		
	}
	 public void facultyClone(Employee e) {
		 
		 // Shallow copy
		 // super.clone()
		 
		Faculty f = (Faculty) e;
		this.fn = f.getFirstName();	
		this.ln = f.getLastName();	
		this.idNumber = f.getID();
		this.gender = f.getGender();
		this.dob = f.dob;
		this.cName = f.cName;
		this.e1 = f.e1;
	 }

	public Faculty(Level cName) {
		this.cName = cName;
	}
	
	public void setEducation(Education e) {
		this.e1 = e;
	}
 
	public void positionDetails() {
		switch (cName) {
		case AS:
			System.out.println("Assistant Professor");
			break;
 
		case AO:
			System.out.println("Associate Professor");
			break;
 
		case FU:
			System.out.println("Professor");
			break;
 
		}
	}
	
	public String getPosition() {
		
		switch (cName) {
		case AS:
			return "Assistant Professor";
			
 
		case AO:
			return "Associate Professor";
		
 
		case FU:
			return "Full Professor";
			
			
		default:
			return "Does not have a position";
			
		}
		
	}
	
	public String toString() {
		return "Faculty: " + super.toString() +  this.getPosition()   +  "\nMonthly Salary: " 
	+ monthlyEarning() + "\n";  // 
		
		// 
	
		// this.e1 == this.e1.toString BUT only works for toString
	}

	public double monthlyEarning() {

		//Need to set up abstract method in employee class

		if (cName == Faculty.Level.AS) {

			return FACULTY_MONTHLY_SALARY;
			
			// Before implementing EmployeeInfo
			// return EmployeeInfo.FACULTY_MONTHLY_SALARY;
		}

		else if (cName == Faculty.Level.AO) {

			return FACULTY_MONTHLY_SALARY * 1.5;
			
		}

		else {
			
			return FACULTY_MONTHLY_SALARY * 2.0;
		}
	}
}
