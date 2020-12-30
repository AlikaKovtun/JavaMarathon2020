package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("Boeing", 1998, 150, 200);
        Airplane airplane2 = new Airplane("Airbus", 2012, 160, 300);

        Airplane.compareAirplanes(airplane1, airplane2);

    }
}