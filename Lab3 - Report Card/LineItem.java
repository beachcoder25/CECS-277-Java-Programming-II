package lab3;


public class LineItem {
	
	private String grade;
	private String className;
	private double credits;
	private double gpa;
	

	
//	private ArrayList<Classes> class1;
//	private ArrayList<Grade> grade1;
	
	public LineItem(Classes c, Grade g) {
		
		gpa = g.getGradePoint();
		grade = g.getGrade();
		
		className = c.getClassName();
		credits = c.getcredits();
		
	}
	
	public double getTotalGPA() {
		
		return credits * gpa;
	}
	
	public String format()
	{
		return "Class: " + className + "\nGrade: " + grade 
				+ "\nCredits: " + credits + "\nGrade points: " +  getTotalGPA();
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

}
