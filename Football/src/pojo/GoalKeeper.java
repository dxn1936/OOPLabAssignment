package pojo;

public class GoalKeeper extends Player {
	
	public void catchBall() {
		System.out.println("catchBall");
	}
	public GoalKeeper(String fullName, Integer jerseyNumber) {
		super(fullName, jerseyNumber);
	}
}
