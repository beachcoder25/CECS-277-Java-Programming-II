package lab6q3;

public class BoringState implements RobotState{
	
	@Override
	public void action(Robot r) {
	
		System.out.println("The robot is in a boring state");
		r.sing();
		
		System.out.println("\nReturning to HappyState:"
				+ "");
		HappyState hS = new HappyState();
		
		
		//System.out.println("\nThe robot returns to a happy state:");
		
		hS.action(r);
		
		System.out.println("");
	}

}
