package lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import lab2.Faculty.Level;


// GOOD RESOURCE FROM TEXTBOOK!!! https://bookshelf.vitalsource.com/#/books/9781118838822/cfi/6/508!/4/2/426/8/4/102/2/2/2@0:49.2

// EVEN BETTER!!! https://bookshelf.vitalsource.com/#/books/9781118838822/cfi/6/510!/4/2/306/4/4/78/2/2/2@0:100

public class TesterClass {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		
		double allEmpTotal = 0; // Used for all employee salaries
		double ptEmpTotal = 0; // Used for all pt employee salaries
		
		
		Employee[] employeeArray = new Employee[9];
		ArrayList<Employee> sortedList = new ArrayList<Employee>();
		
		
		// Staff
		
		employeeArray[0] = new Staff("Allen", "Paita", 123, "M", 50.00,2,23,59);
		employeeArray[1] = new Staff("Zapata", "Steven", 456, "F", 35.00,7,12,64); 
		employeeArray[2] = new Staff("Rios", "Enrique", 789, "M", 40.00,6,2,70); 
		
		Education e = new Education("Ph.d", "Engineering", 3);
		Education e1 = new Education("Ph.d", "English", 1);
		Education e2 = new Education("MS", "Physical Education", 0);
		
	
		// Faculty
		
		employeeArray[3] = new Faculty("Johnson", "Anne", 243, "F", e, Faculty.Level.FU, 4, 27, 62); // How did you parameterize the Level?
		employeeArray[4] = new Faculty("Bouris", "William", 791, "F", e1, Faculty.Level.AO, 3, 14, 75);
		employeeArray[5] = new Faculty("Andrade", "Christopher", 623, "F", e2, Faculty.Level.AS, 5, 22, 80);
		
	
		// PT Employees
		
		employeeArray[6] = new partTime("Guzman", "Augusto", 455, "F", 35.00, 30,8,10,77);
		employeeArray[7] = new partTime("Depirro", "Martin", 678, "F", 30.00, 15, 9,15,87); 
		employeeArray[8] = new partTime("Aldaco", "Marque", 945, "F", 20.00, 35,11,24,88); 
		
		
		// ArrayList for sorting
		
         for(Employee x:employeeArray) {
			
			sortedList.add(x); 
		}
         
//        System.out.println("ALL EMPLOYEES BY ASCENDING ID NUMBER");
// 		System.out.println("------------------------------");
// 		for(Employee p:employeeArray) {
// 			
// 			
// 			System.out.println(p);
// 		}
         
         
//        System.out.println("INCOME TOTALS");
// 		System.out.println("------------------------------");
 		
 		
         for (int i=0; i < employeeArray.length; i++) {
 			
 			allEmpTotal += employeeArray[i].monthlyEarning();
 			
 			if(employeeArray[i] instanceof partTime) {
 				ptEmpTotal +=  employeeArray[i].monthlyEarning();
 			}
 		}
//        System.out.println("PT income total: " + ptEmpTotal);
//		System.out.println("ALL employee income total: " + allEmpTotal + "\n\n");
//		
//        
//		System.out.println("SORTED LIST IN REVERSE ORDER");
//		System.out.println("------------------------------");
		
		
		// Collections.sort(sortedList);
       // Collections.reverse(sortedList);
     
        
//		for(Employee object:sortedList) {
//			System.out.println(object);
//		}

		
//		System.out.println("\nEND OF SORTED LIST!!!\n\n\n);
//		System.out.println("\nTEST TEST TEST TEST\n\n");
		
		IDDesc id = new IDDesc();
		Arrays.sort(employeeArray,id);
		
//		for(Employee object:sortedList) {
//			System.out.println(object);
//		}
		
		
		// CLONE TESTING!!!
		
		System.out.println("CLONING");
		System.out.println("------------------------------");
		
		// Deep copy allows to change attribute, not all
		
		//Education e10 = new Education("MS", "Physical Education", 0);
		
		Employee newFaculty1 = new Faculty("Trump", "Donald", 623, "F", e2, Faculty.Level.FU, 5, 22, 80); 
		//Faculty newFaculty2 = new Faculty(); // Employee type
		Faculty newFaculty2 = (Faculty) ((Faculty) newFaculty1).clone();

		
		System.out.println("Object to be cloned: \n");
		System.out.println(newFaculty1);
		
		System.out.println("Cloned Object:\n ");
		System.out.println(newFaculty2);
		
		newFaculty1.ln="Drumpf";
		
		System.out.println("Object to be cloned: \n");
		System.out.println(newFaculty1);
		
		System.out.println("Cloned Object:\n ");
		System.out.println(newFaculty2);
		
		
		
		System.out.println("Our newly created object, now cloned:");
		// newFacultyObject.facultyClone(employeeArray[4]);
		//System.out.println(newFaculty);
	
 		}
	}

