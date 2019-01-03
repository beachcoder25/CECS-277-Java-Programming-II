package lab5PartB;


public class Student implements Comparable<Student>{
	
	String firstName;
	String lastName;
	int ID;
	
	
	public Student(String fn, String ln, int id) {
		
		firstName = fn;
		lastName = ln;
		ID = id;
		
		
	}
	

	public String toString()
	{
		return "\nFirst name: " + firstName + "\nLast name: " + lastName + "\nStudent ID: " + ID;
	}
	
	
	public Student() {
		
		firstName = "Sparky";
		lastName = "Sparkles";
		ID = 5;
		
				
	}


	public boolean equals(Object otherObject)
	{
		Student other = (Student) otherObject;
		
		return ID == other.ID;
		
	}
	
	
	/*
	public int hashCode() {
		
		return ID;
	}
	*/
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}


	@Override
	public int compareTo(Student s) {
		
		
		if(lastName.compareTo(s.lastName) == 0)
		{
			if(firstName.compareTo(s.firstName) == 0) 
			{
				if(ID < s.ID) {
					return -1;
				}
				
				else if( ID > s.ID) {
					return 1;
				}
			}
			
			else{
				return firstName.compareTo(s.firstName);
			}
		}
		
		else{
			return lastName.compareTo(s.lastName);
		}
		
		return 0;
	}
	
	@Override
	public int hashCode()
	{
	final int HASH_MULTIPLIER = 29;
	int h = HASH_MULTIPLIER * firstName.hashCode() + lastName.hashCode();
	h = HASH_MULTIPLIER * h + ((Integer)ID).hashCode();
	return h;
	}
	
	


}
