package pojo;

public class Team {
	private Player players[];
	private Boolean homeJersey;
	
	public void addPlayer(Player player) {
		int i = 0;
		while(players[i] instanceof Player) {
			i++;
		}
		if(i < players.length) {
			players[i] = player;
			System.out.println("player is added");
		} else {
			System.out.println("team is full");
		}
	}
	
	public Team() {
		players = new Player[55];
		homeJersey = true;
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	public Boolean getHomeJersey() {
		return homeJersey;
	}

	public void setHomeJersey(Boolean homeJersey) {
		this.homeJersey = homeJersey;
	}
	
}
