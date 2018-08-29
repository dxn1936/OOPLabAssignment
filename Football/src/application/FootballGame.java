package application;

import pojo.Ball;
import pojo.GoalKeeper;
import pojo.Player;

public class FootballGame {

	public static void main(String[] args) {
		Player player1 = new Player("Ronaldinho", 10);
		player1.kickBall(null);
		
		Ball ball = new Ball(5.0);
		Player player2 = new Player("Messi", 10);
		player2.kickBall(ball);
		
		GoalKeeper goalKeeper = new GoalKeeper("O.Kahn", 1, false);
//		goalKeeper.setFullName("O.Kahn");
		System.out.println("--" + goalKeeper.getJerseyNumber());
		System.out.println("--" + goalKeeper.getHasGlowes());
		goalKeeper.catchBall();
		
	}

}
