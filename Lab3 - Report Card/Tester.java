package lab3;

public class Tester {
	
	public static void main(String[] args) {
		
		
		Grade g1 = new Grade("A");
		Grade g2 = new Grade("B");
		Grade g3 = new Grade("C");
		Grade g4 = new Grade("D");
		Grade g5 = new Grade("F");
		
		
		//System.out.println(g1.getGradePoint());
		
		//System.out.println("\n");
		
		Classes c1 = new Classes("History", 3);
		Classes c2 = new Classes("Maths", 5);
		Classes c3 = new Classes("Programming", 3);
		// System.out.println(c1.format());
		
		//System.out.println("\n");
		
		LineItem l1 = new LineItem(c1, g5);
		LineItem l2 = new LineItem(c2, g1);
		LineItem l3 = new LineItem(c3, g2);
		
//		System.out.println(l1.format());
//		System.out.println("");
//		
//		System.out.println(l2.format());
//		System.out.println("");
//		
//		System.out.println(l3.format());
//		System.out.println("");
		
		ReportCard r1 = new ReportCard("Bobby Joe", "Spring");
		r1.add(l1);
		r1.add(l2);
		r1.add(l3);
		
		System.out.println(r1.format());
		
	}

}
