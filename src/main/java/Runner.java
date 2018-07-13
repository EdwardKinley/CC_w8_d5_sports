import db.DBHelper;
import models.Competition;
import models.Manager;
import models.Player;
import models.Team;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Player player1 = new Player("Erin");
        Player player2 = new Player("Colby");
        Player player3 = new Player("Lochlin");
        Player player4 = new Player("Kirree");
        Player player5 = new Player("Ayla");
        Player player6 = new Player("Jamie");
        Player player7 = new Player("Orry");

        DBHelper.save(player1);
        DBHelper.save(player2);
        DBHelper.save(player3);
        DBHelper.save(player4);
        DBHelper.save(player5);
        DBHelper.save(player6);
        DBHelper.save(player7);

        ArrayList<Player> players1 = new ArrayList<Player>();
        ArrayList<Player> players2 = new ArrayList<Player>();
        players1.add(player1);
        players1.add(player2);
        players1.add(player3);
        players2.add(player4);
        players2.add(player5);
        players2.add(player6);

        Manager manager1 = new Manager("Jude");
        Manager manager2 = new Manager("Al");

        DBHelper.save(manager1);
        DBHelper.save(manager2);

        Team team1 = new Team("Edinburgh", manager1, players1);
        Team team2 = new Team("Oxford", manager2, players2);

        DBHelper.save(team1);
        DBHelper.save(team2);

        ArrayList<Team> teams = new ArrayList<Team>();
        teams.add(team1);
        teams.add(team2);

        Competition competition1 = new Competition("Kinley Cup", "cup", teams);

        DBHelper.save(competition1);

    }

}
