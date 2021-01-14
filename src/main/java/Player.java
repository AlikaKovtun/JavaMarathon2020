public class Player {

    private int[][] battleField;
    private String name;
    private int shipCount = 20;
    private int fourDeckCount = 4;


    public Player(String name) {
        this.name = name;
    }

    public void setBattleField(int[][] battleField) {
        this.battleField = battleField;
    }

    public int[][] getBattleField() {
        return battleField;
    }

    public String getName() {
        return name;
    }


    public int getShipCount() {
        return shipCount;
    }

    public void setShipCount(int shipCount) {
        this.shipCount = shipCount;
    }

    public int getFourDeckCount() {
        return fourDeckCount;
    }

    public void setFourDeckCount(int fourDeckCount) {
        this.fourDeckCount = fourDeckCount;
    }


    public void prindBattleField() {
        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField[i].length; j++) {
                if(battleField[i][j] == 1) System.out.print("\uD83D\uDEE5");
                if(battleField[i][j] == 2) System.out.print("\uD83D\uDEE5");
                if(battleField[i][j] == 3) System.out.print("\uD83D\uDEE5");
                if(battleField[i][j] == 4) System.out.print("\uD83D\uDEE5");
                if(battleField[i][j] == 0) System.out.print("\u2B1C");
                if(battleField[i][j] == 5) System.out.print("\uD83D\uDFE5");
            }
            System.out.println();
        }
    }
}
