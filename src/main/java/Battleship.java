
import java.util.Scanner;

public class Battleship {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Игрок 1 введите Ваше имя: ");
        String name = scan.nextLine();
        Player player1 = new Player(name);
        System.out.println("Время расставлять корабли, " + player1.getName() + ". Игрок 2 отвернитесь!");
        player1.setBattleField(createBattleField());
        player1.prindBattleField();
        System.out.print("Игрок 2 введите Ваше имя: ");
        String name2 = scan.nextLine();
        Player player2 = new Player(name2);
        System.out.println("Время расставлять корабли, " + player2.getName() + ". Игрок 1 отвернитесь!");
        player2.setBattleField(createBattleField());
        player2.prindBattleField();
        int firstMove = 1 + (int) (Math.random() * 2);
        System.out.println("Опеределим жребием чей ход первый...");
        String whoIsMove;
        if (firstMove == 1) whoIsMove = player1.getName();
        else whoIsMove = player2.getName();
        while (true) {
            if (whoIsMove.equals(player1.getName()))
                whoIsMove = move(player1, player2);

            else if (whoIsMove.equals(player2.getName()))
                whoIsMove = move(player2, player1);

            else return;
        }

    }

    public static int[][] createBattleField() {
        int[][] battleField = new int[10][10];
        System.out.println("Введите координаты четырехпалубного корабля (формат x,y;x,y;x,y;x,y):");
        while (true) {
            int[] ship = coordinatesRequest(4);
            if (placeShipOnBattleField(ship, battleField)) continue;
            else break;
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Введите координаты трехпалубного корабля (формат x,y;x,y;x,y):");
            while (true) {
                int[] ship = coordinatesRequest(3);
                if (placeShipOnBattleField(ship, battleField)) continue;
                else break;
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите координаты двухпалубного корабля (формат x,y;x,y):");
            while (true) {
                int[] ship = coordinatesRequest(2);
                if (placeShipOnBattleField(ship, battleField)) continue;
                else break;
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Введите координаты однопалубного корабля (формат x,y):");
            while (true) {
                int[] ship = coordinatesRequest(1);
                if (placeShipOnBattleField(ship, battleField)) continue;
                else break;
            }
        }
        return battleField;
    }

    public static int[] coordinatesRequest(int decks) {
        int[] ship = new int[decks * 2];
        Scanner scan = new Scanner(System.in);
        while (true) {
            String fourDeckShip = scan.nextLine();
            String[] fourDeckShipCoord = fourDeckShip.split(";");
            if (fourDeckShipCoord.length != decks) {
                System.out.println("Вы ввели неверное количество координат! Введите заново: ");
                continue;
            }
            boolean t = false;
            int i = 0;
            for (String s : fourDeckShipCoord) {
                fourDeckShipCoord = s.split(",");
                if (fourDeckShipCoord.length != 2 || !s.matches("[0-9][,][0-9]"))
                    t = true;
                else {
                    ship[i++] = Integer.parseInt(fourDeckShipCoord[0]);
                    ship[i++] = Integer.parseInt(fourDeckShipCoord[1]);
                }
            }
            if (t) {
                System.out.println("Некорректные координаты! Введите заново: ");
                continue;
            }

            boolean xAbstr = true;
            boolean yAbstr = true;
            boolean isXequals = true;
            boolean isYequals = true;

            for (int l = decks - 1; l > 0; l--) {
                if (ship[(l * 2) + 1] != ship[(l * 2) - 1]) isYequals = false;
                if (Math.abs(ship[(l * 2) + 1] - ship[(l * 2) - 1]) != 1) yAbstr = false;
            }
            for (int l = decks - 1; l > 0; l--) {
                if (ship[l * 2] != ship[(l * 2) - 2]) isXequals = false;
                if (Math.abs(ship[l * 2] - ship[(l * 2) - 2]) != 1) xAbstr = false;
            }
            if (!(isXequals && yAbstr || isYequals && xAbstr)) {
                System.out.println("Ячейки с этими координатами располагаются не по порядку! Введите заново: ");
                continue;
            }
            break;
        }
        return ship;
    }

    public static boolean placeShipOnBattleField(int[] ship, int[][] battleField) {
        boolean isEmpty = false;
        boolean hasOreol = false;
        int counter = 0;
        int x, y;
        for (int k = 0; k < ship.length - 1; k += 2) {
            //Здесь меняю x,y местами так как при вводе х идет первым а у вторым
            //а в двумерном массиве сначала идет по оси у число а потом по х
            y = ship[k];
            x = ship[k + 1];
            if (battleField[x][y] != 0) isEmpty = true;

            if (isEmpty) {
                System.out.println("На этих ячейках уже распологается корабль! Введите другие: ");
                return isEmpty;
            }

            if (x == 0 || x == 9) {
                counter += 3;
                if (y == 0 || y == 9) counter += 2;
            } else if (y == 0 || y == 9) {
                counter += 3;
            }
            if (k > 0) counter++;

            if ((x - 1 >= 0) && (y - 1 >= 0) && (battleField[x - 1][y - 1] == 0)) counter++;
            if ((y - 1 >= 0) && battleField[x][y - 1] == 0) counter++;
            if ((x + 1 <= 9) && (y - 1 >= 0) && battleField[x + 1][y - 1] == 0) counter++;
            if ((x + 1 <= 9) && battleField[x + 1][y] == 0) counter++;
            if ((x + 1 <= 9) && (y + 1 <= 9) && battleField[x + 1][y + 1] == 0) counter++;
            if ((y + 1 <= 9) && battleField[x][y + 1] == 0) counter++;
            if ((x - 1 >= 0) && (y + 1 <= 9) && battleField[x - 1][y + 1] == 0) counter++;
            if ((x - 1 >= 0) && battleField[x - 1][y] == 0) counter++;

            if (counter != 8) {
                hasOreol = true;
                System.out.println("Ореол вокруг корабля должен быть не занят другими кораблями!");
                System.out.println("Введите новые координаты:");
                return hasOreol;
            }
            counter = 0;
            battleField[x][y] = ship.length / 2;
        }
        return false;
    }

    public static String move(Player playerMakesMove, Player playerDefends) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            boolean isSuccessful = false;
            System.out.println(playerMakesMove.getName() + " ваш ход!");
            System.out.println("Введите координаты цели:");
            String target = scan.nextLine();
            if (!target.matches("[0-9][,][0-9]")) {
                System.out.println("Некорректные координаты!");
                continue;
            }
            int y = Integer.parseInt(target.substring(0, 1));
            int x = Integer.parseInt(target.substring(2, 3));

            int[][] battleField = playerDefends.getBattleField();
            if (battleField[x][y] == 1 || battleField[x][y] == 2 || battleField[x][y] == 3 || battleField[x][y] == 4) {
                int counter = 0;
                if (x == 0 || x == 9) {
                    counter += 1;
                    if (y == 0 || y == 9) counter += 1;
                } else if (y == 0 || y == 9) counter += 1;
                if ((y - 1 >= 0) && (battleField[x][y - 1] == 0 || battleField[x][y - 1] == 5)) counter++;
                if ((x + 1 <= 9) && (battleField[x + 1][y] == 0 || battleField[x + 1][y] == 5)) counter++;
                if ((y + 1 <= 9) && (battleField[x][y + 1] == 0 || battleField[x][y + 1] == 5)) counter++;
                if ((x - 1 >= 0) && (battleField[x - 1][y] == 0 || battleField[x - 1][y] == 5)) counter++;
                if (battleField[x][y] == 4) {
                    int count = playerDefends.getFourDeckCount();
                    if ((count - 1) > 0) counter = 1;
                    playerDefends.setFourDeckCount(--count);
                }

                if (counter == 4) System.out.println("Убил!");
                else System.out.println("Ранил!");
                battleField[x][y] = 5;
                int shipCount = playerDefends.getShipCount();
                if (shipCount - 1 == 0) {
                    System.out.println(playerMakesMove.getName() + " победил! Игра окончена.");
                    return "End";
                } else {
                    playerDefends.setShipCount(--shipCount);
                    isSuccessful = true;
                }
            } else if (battleField[x][y] == 5) {
                System.out.println("Вы уже стреляли сюда! Будьте внимательнее.");
                isSuccessful = true;
            }
            if (isSuccessful) continue;
            System.out.println("Мимо!");
            playerDefends.prindBattleField();
            return playerDefends.getName();
        }
    }
}

