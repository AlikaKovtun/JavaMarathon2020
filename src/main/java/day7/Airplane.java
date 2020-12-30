package day7;

public class Airplane {

    private String producer;
    private int year;
    private double length;
    private double weight;
    private int fuel;

    public Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer);
        System.out.println("Год выпуска: " + year);
        System.out.println("Длина: " + length);
        System.out.println("Вес: " + weight);
        System.out.println("Количетсво топлива в баке: " + fuel);
    }

    public void fillUp(int n) {
        if (n < 0) {
            System.out.println("Некорректное значение");
            return;
        }
        fuel += n;

    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.length > airplane2.length)
            System.out.println(airplane1.producer + " длиннее, чем " + airplane2.producer);
        else if (airplane2.length > airplane1.length)
            System.out.println(airplane2.producer + " длиннее, чем " + airplane1.producer);
        else
            System.out.println("Самолеты " + airplane1.producer + " и " + airplane2.producer + " одинаковой длины");


    }
}
