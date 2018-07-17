package application;

import pojo.GoalKeeper;
import pojo.Player;

public class FootballGame {

	public static void main(String[] args) {
		Player player1 = new Player("Ronaldinho", 10);
		player1.kickBall();
		
		GoalKeeper goalKeeper = new GoalKeeper("O.Kahn", 1, false);
//		goalKeeper.setFullName("O.Kahn");
		System.out.println("--" + goalKeeper.getJerseyNumber());
		System.out.println("--" + goalKeeper.getHasGlowes());
		goalKeeper.catchBall();
	}

}
