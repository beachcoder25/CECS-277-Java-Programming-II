package lab3;

import java.util.ArrayList;

/**
 * 
 * @author Jonah
 * 
 * Describes a report card for a set of grades and classes
 *
 */

public class ReportCard {
	
	private ArrayList<LineItem> lineItem;
	private String studentName;
	private String semester;
	private double totalGPA;
	private double totalCredits;
	//private double addedGPA;
	
	
	
	public ReportCard (String n, String s)
	{
		lineItem = new ArrayList<LineItem>();
		studentName =n;
		semester = s;
	}
	
	public void add(LineItem l) {
		lineItem.add(l);
	}
	
	/**
	   Calculates GPA
	   @param g Grade received
	   @param c Credits the course is
	 */
	
	public double calculateTotalGPA()
	{
		
		for (LineItem l: lineItem) {
			totalCredits = totalCredits + l.getCredits();
			totalGPA = totalGPA + l.getTotalGPA();
		}
		
		totalGPA = (totalGPA / totalCredits);
		
		return totalGPA;	
	}
	
	/**
	   Formats the report card
	   @return Formatted report card
	 */
	
	public String format()
	{
		String j = "                                Report Card\n\n"
				+ "Student Name: " + studentName + "\nSemester: " + semester + "\n\n\n";
		
		// System.out.println("");
		
		for(LineItem item : lineItem) {
			j = j +  item.format() + "\n";
		}
		
		j = j + String.format("Average GPA: %8.2f",  calculateTotalGPA());
		
		// How do I get this to print with a space???
		
		String k = "\n\n\n\n";
		
		return j + k;
	}

	
	public ArrayList<LineItem> getLineItem() {
		return lineItem;
	}

	public void setLineItem(ArrayList<LineItem> lineItem) {
		this.lineItem = lineItem;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public double getTotalGPA() {
		return totalGPA;
	}

	public void setTotalGPA(double totalGPA) {
		this.totalGPA = totalGPA;
	}


}
