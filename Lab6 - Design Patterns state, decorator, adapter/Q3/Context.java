package lab6q3;

public class Context {

	private RobotState state = null;
	private Robot robot = new Robot();

	public void setState(RobotState state) {
		this.state = state;
	}

	public void gameAction() {
		state.action(robot);
	}
}





