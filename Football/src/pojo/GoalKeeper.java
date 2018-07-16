package pojo;

public class GoalKeeper extends Player {
	private Boolean hasGlowes;
	
	public void catchBall() {
		System.out.println("catchBall");
	}
	public GoalKeeper() {
		super();
		hasGlowes = true;
	}
	public GoalKeeper(String fullName, Integer jerseyNumber) {
		super(fullName, jerseyNumber);
		hasGlowes = true;
	}
	public Boolean getHasGlowes() {
		return hasGlowes;
	}
	public void setHasGlowes(Boolean hasGlowes) {
		this.hasGlowes = hasGlowes;
	}
}
