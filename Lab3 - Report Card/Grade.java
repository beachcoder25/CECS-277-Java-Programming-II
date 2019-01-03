package lab3;

/**
   Represents grade and GPA point value
 */

public class Grade {
	
	String grade;
	double gradePoint = 0;
	
	

	
	public Grade()
	{	
		this.grade = null;
		this.gradePoint = 0;
	}
	
	
	public Grade(String grade)
	{
		this.grade = grade;
		 
		if(this.grade == "A") {
			gradePoint = 4;
		}
		
		else if(this.grade == "B") {
			gradePoint = 3;
		}
		
		else if(this.grade == "C") {
			gradePoint = 2;
		}
		
		else if(this.grade == "D") {
			gradePoint = 1;
		}
		
		else {
			gradePoint = 0;
		}
	}
	
	
	/**
	   Gets grade alpha value
	   @return letter grade
	 */
	
	public String getGrade()
	{
		return grade;
	}
	
	/**
	   Gets grade numeric value
	   @return GPA points for alpha value
	 */
	
	public double getGradePoint()
	{
		return gradePoint;
	}
	
	

}
