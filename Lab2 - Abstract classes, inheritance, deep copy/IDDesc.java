package lab2;

import java.util.Comparator;

public class IDDesc implements Comparator {

	public int compare (Object ob1, Object ob2) {
		Employee emp1 = (Employee) ob1;
		Employee emp2 = (Employee) ob2;
		
		
		if(emp2.getID() > emp1.getID()) {
			return -1;
		}
		
		if(emp2.getID() < emp1.getID()) {
			return 1;
		}
		
		else {
			return 0;
		}
			
		
	}
}
