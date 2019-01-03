package lab5PartB;

import java.awt.Color;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentMap {

	static Map<Integer, Student> students; 
	static Map<Student, Character> grades; 

	public static void main(String[] args) {
		// Keys are Student objects


		StudentMap map1 = new StudentMap();

		Student s1 = new Student("Jonah", "Cornish", 1); 
		Student s2 = new Student("Chuck", "Adams", 2); 
		Student s3 = new Student("Chuck", "Adams", 113);
		Student s4 = new Student("Jane", "Adams", 44);
		Student s5 = new Student("Al", "Bundy", 77);



		Grade g1 = new Grade('A');
		Grade g2 = new Grade('B');
		Grade g3 = new Grade('C');

		students = new HashMap<Integer, Student>();

		grades = new HashMap<Student, Character>();
		//students.put("Jonah", "Happy");

		students.put(s1.getID(), s1);
		students.put(s2.getID(), s2);
		students.put(s3.getID(), s3);
		students.put(s4.getID(), s4);
		students.put(s5.getID(), s5);

		grades.put(s1, g1.value);
		grades.put(s2, g2.value);
		grades.put(s3, g3.value);
		grades.put(s4, g1.value);
		grades.put(s5, g2.value);

		while(true) {

			System.out.println("Please enter your choice below: \n\nTo add students press #1\nTo remove students press #2"
					+ "\nTo modify grades press #3\nTo print all grades press #4");

			Scanner in = new Scanner(System.in);
			int choice = in.nextInt();

			if(choice == 1) 
			{

				map1.addStudent(students, grades);
			}


			if(choice == 2) 
			{
				System.out.println("YOU CHOSE 2");
				System.out.println("Please enter an ID number of the student you would like to remove: ");
				int studentID = in.nextInt();
				System.out.println("\nSearching for the student with ID: " + studentID);
				Student foundStudent = students.get(studentID);

				if(foundStudent != null) {
					System.out.println("You will be removing the following student: ");
					System.out.println(foundStudent);
					students.remove(studentID);

				}

				else {
					System.out.println("The student is NOT in the set!!!\n");
				}
			}


			if(choice == 3)
			{
				System.out.println("Enter the ID of the student to change their grade");
				int sID = in.nextInt();

				Set<Integer> keySet1 = students.keySet();
				Set<Student> keySet2 = grades.keySet();

				for (Integer key1 : keySet1)
				{
					Student value1 = students.get(key1);

					for (Student key2: keySet2) {
						if(key2 == value1) {

							System.out.println("Enter the grade for the student: ");
							char grade = in.next().charAt(0);
							Grade value2 = new Grade('A');
							value2.setGrade(grade);
							System.out.println("\nMatched Student: " + key2 
									+"\nGrade: " + value2.value);
						}
					}
				}	
			}


			if(choice == 4) 
			{


				Set<Integer> keySet3 = students.keySet();
				Set<Student> keySet4 = grades.keySet();
				//ArrayList<Student> studentArray = null;
				ArrayList<Student> studentArray = new ArrayList<>(grades.keySet());
				Collections.sort(studentArray);
				System.out.println("Array Size: " + studentArray.size());
				
				for(Student s: studentArray) {
					System.out.println("Grade: " + grades.get(s));
					System.out.println(s);
				}


				/*for (Integer key1 : keySet3)
				{
					Student value1 = students.get(key1);
					
					for (Student key2: keySet4)
					{

						studentArray = new ArrayList<Student>();
						studentArray.add(key2);
						System.out.println("Array Size: " + studentArray.size());


						
						if(key2 == value1) 
						{

							char value2 = grades.get(key2);
							System.out.println("\nMatched Student: " + key2 
									+"\nMatched grade: " + value2);

						}
						 
					}*/

				//}
				//System.out.println(studentArray.size());
				//Collections.sort(studentArray);
				//for(Student s: studentArray) {
					//System.out.println(s);

			}
		}

		/*
			Set<Integer> keySet1 = students.keySet();
			Set<Student> keySet2 = grades.keySet();

			for (Integer key1 : keySet1)
			{
				Student value1 = students.get(key1);

				for (Student key2: keySet2) {
					if(key2 == value1) {

						char value2 = grades.get(key2);
						System.out.println("\nMatched Student: " + key2 
								+"\nMatched grade: " + value2);

					}
				}
			}*/
	}	


void addStudent(Map<Integer, Student> ms, Map<Student, Character> mg)
{

	// Thought this would be an issue because s0 is always the same, 
	// but it isn't because we add based off of ID,correct?
	while(true) {
		Scanner in = new Scanner(System.in);
		Student s0 = new Student();

		System.out.println("Please enter the Students first name");
		String fn = in.next();
		s0.firstName = fn;

		System.out.println("Please enter the Students last name");
		String ln = in.next();
		s0.lastName = ln;

		System.out.println("Please enter the Students ID");
		int ID = in.nextInt();
		s0.setID(ID);

		System.out.println("Please enter the Students grade");
		Grade grade = new Grade(in.next().charAt(0));

		ms.put(s0.getID(), s0);
		mg.put(s0, grade.value);
		grade.setGrade(grade.value);

		break;

	}
}
}



