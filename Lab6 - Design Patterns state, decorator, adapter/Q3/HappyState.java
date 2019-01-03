package lab6q3;


public class HappyState implements RobotState{
	
	@Override
	public void action(Robot r) {
	
		System.out.println("\nThe robot is in a happy state:");
		r.talk();
		r.cook();
		
		System.out.println("");
	}



}
