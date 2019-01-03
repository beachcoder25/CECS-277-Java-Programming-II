package lab2;

public class Education implements Cloneable {
	
	
	String degree;
	String major;
	int research;
	
	// Attributes, use enumeration
	
	public Education() {
		

	}
	
	public Education(String d, String m, int i) {
		
		degree = d;
		major = m;
		research = i;
		
	}
	
	// Accessors
	
	public String getDegree() {
		return degree;
	}
	
	public String getMajor() {
		return major;
	}
	
	public int getResearch() {
		return research;
	}
	
	// Mutators
	
	public String setDegree(String d) {
		
		degree = d;
		return degree;
	}
	
	public String setMajor(String m) {
		
		major = m;
		return major;
	}
	
	public int setResearch(int r) {
		
		research = r;
		return research;
	}

	public String toString()
	{
		return "\nDegree: " + getDegree() + "\nMajor: "
				+ getMajor() + "\nReserarch: " + getResearch() + "\n" ;
	}
	
	public Object clone() throws CloneNotSupportedException{
		
		return super.clone();
		
	}
}
