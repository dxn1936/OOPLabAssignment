package pojo;

public class GoalKeeper extends Player {
	private Boolean hasGlowes;
	
	public void catchBall() {
		System.out.println("catchball");
	}
	public GoalKeeper(String fullName, Integer jerseyNumber, Boolean hasGlowes) {
		super(fullName, jerseyNumber);
		this.hasGlowes = hasGlowes;
	}

	public Boolean getHasGlowes() {
		return hasGlowes;
	}

	public void setHasGlowes(Boolean hasGlowes) {
		this.hasGlowes = hasGlowes;
	}
}
