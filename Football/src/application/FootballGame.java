package application;

import pojo.GoalKeeper;
import pojo.Player;

public class FootballGame {

	public static void main(String[] args) {
		Player player1 = new Player("Ronaldinho", 10);
		GoalKeeper player2 = new GoalKeeper("O. Kahn", 1);
		player2.kickBall();
		player2.catchBall();
	}

}
