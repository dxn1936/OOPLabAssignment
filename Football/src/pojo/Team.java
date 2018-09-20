package pojo;

import java.util.ArrayList;
import java.util.List;

public class Team implements Cloneable {
	private Player players[];
	private Boolean homeJersey;
	private String teamName;
	private List<String> playerList;
	
	public void addPlayer(Player player) {
		int i = 0;
		while(players[i] instanceof Player) {
			i++;
		}
		if(i < players.length) {
			players[i] = player;
			System.out.println(player.getFullName() + " is added to " + teamName);
		} else {
			System.out.println("team is full");
		}
	}
	
	public void addPlayer(String name) {
		addPlayer(new Player(name, 0));
	}
	
	public void printPlayers() {
		int i = 0;
		System.out.println("TEAM = " + teamName);
		while(i < players.length && players[i] instanceof Player) {
			System.out.println("(" + (i+1) + ") " + players[i].getFullName());
			i++;
		}
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public Team(String teamName) {
		players = new Player[55];
		homeJersey = true;
		this.teamName = teamName;
		this.playerList = new ArrayList();
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

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
}
