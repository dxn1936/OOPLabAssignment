package pojo;

public class Player {
	private String fullName;
	private Integer jerseyNumber;
	
	public void kickBall() {
		System.out.println("kick");
	}
	
	public Player() {
		fullName = "";
		jerseyNumber = 0;
	}

	public Player(String fullName, Integer jerseyNumber) {
		this.fullName = fullName;
		this.jerseyNumber = jerseyNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(Integer jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
}
