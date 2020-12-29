package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane boeing737 = new Airplane("Boeing", 2018, 145, 40);
        boeing737.setYear(2017);
        boeing737.setLength(150);
        boeing737.fillUp(-100);
        boeing737.fillUp(100);
        boeing737.info();

    }
}
