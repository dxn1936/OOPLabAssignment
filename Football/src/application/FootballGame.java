package application;

import pojo.Ball;
import pojo.GoalKeeper;
import pojo.Player;
import pojo.Team;

public class FootballGame {

	public static void main(String[] args) {
		Player player1 = new Player("Ronaldinho", 10);
		//player1.kickBall(null);
		//Ball ball = new Ball(5.0);
		Player player2 = new Player("Messi", 10);
		//player2.kickBall(ball);
		/*
		GoalKeeper goalKeeper = new GoalKeeper("O.Kahn", 1, false);
//		goalKeeper.setFullName("O.Kahn");
		System.out.println("--" + goalKeeper.getJerseyNumber());
		System.out.println("--" + goalKeeper.getHasGlowes());
		goalKeeper.catchBall();
		System.out.println("---------------");
		*/
		
		
		Player player3;
		try {
			player3 = (Player) player1.clone();
		} catch(Exception e) {
			player3 = new Player();
		}
		
		System.out.println(player3.getFullName());
		
		Team team1 = new Team("Liverpool");
		team1.addPlayer(player1);
		team1.addPlayer(player2);
		team1.addPlayer("M. Salah");
		
		
		
		Team team2;
		try {
			team2 = (Team) team1.clone();
		} catch(Exception e) {
			team2 = new Team("");
			System.out.println("unable to clone team");
		}
		team2.setTeamName("ManU");
		player2.setFullName("Rooney");
		team1.printPlayers();
		team2.printPlayers();
	}

}
