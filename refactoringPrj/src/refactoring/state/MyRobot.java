package refactoring.state;
public class MyRobot {
	
	private State state; // 0 : Happy, 1: Angry, 2: Cold 

	public MyRobot() {
		state = new HappyState();
	}
	
	public void setState(State state) {
		this.state = state;
	}	

	public void talk() {
		state.talk();
	}
}