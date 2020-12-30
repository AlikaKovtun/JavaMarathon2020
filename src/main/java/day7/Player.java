package day7;

public class Player {

    private int stamina;
    static final int MAX_STAMINA = 100;
    static final int MIN_STAMINA = 0;
    static final int MAX_PLAYERS = 6;
    static int countPlayers;

    {
        if (countPlayers == MAX_PLAYERS) System.out.println("Команды набраны");
        else countPlayers++;
    }

    public Player(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == MIN_STAMINA) return;
        stamina--;
        if (stamina == MIN_STAMINA) countPlayers--;
    }

    public static void info() {
        String vacant = "";
        switch (MAX_PLAYERS - countPlayers) {
            case 1: vacant = "свободное место";
            break;
            case 2:
            case 3:
            case 4: vacant = "свободных места";
            break;
            case 5: vacant = "свободных мест";
            break;

        }
        if (countPlayers < MAX_PLAYERS)
            System.out.println("Команды неполные. На поле еще есть " + (MAX_PLAYERS - countPlayers) + " " + vacant);
        else
            System.out.println("На поле нет свободных мест");

    }
}
