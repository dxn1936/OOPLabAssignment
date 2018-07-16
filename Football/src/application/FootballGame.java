package application;

import pojo.Player;
import pojo.Team;

public class FootballGame {

	public static void main(String[] args) {
		Team teamA = new Team();
		Player player1 = new Player("Ronaldinho", 10);
		Player player2 = new Player("C. Ronaldo", 7);
		teamA.addPlayer(player1);
		teamA.addPlayer(player2);

	}

}
