package lab6q3;



public class Tester {

	public static void main(String[] args) {

		System.out.println("Testing BoringState: \n");
		Context context = new Context();
		context.setState(new BoringState());
		context.gameAction();
		System.out.println("*****");
		context.setState(new HappyState());
		context.gameAction();
		System.out.println("*****");
		
	}
}