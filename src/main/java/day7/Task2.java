package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();

        Player player1 = new Player((90 + random.nextInt(11)));
        Player player2 = new Player((90 + random.nextInt(11)));
        Player player3 = new Player((90 + random.nextInt(11)));
        Player player4 = new Player((90 + random.nextInt(11)));
        Player player5 = new Player((90 + random.nextInt(11)));
        Player player6 = new Player((90 + random.nextInt(11)));

        Player.info();

        Player player7 = new Player((90 + random.nextInt(11)));
        Player player8 = new Player((90 + random.nextInt(11)));

        System.out.println(Player.getCountPlayers());

        for (int i = 0; i < Player.MAX_STAMINA; i++) {
            player2.run();
        }
        System.out.println(Player.getCountPlayers());

        Player.info();

    }
}
