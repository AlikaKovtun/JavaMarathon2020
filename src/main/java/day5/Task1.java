package day5;

public class Task1 {
    public static void main(String[] args) {

        Car astonMartin = new Car();
        astonMartin.setColor("Black");
        astonMartin.setModel("Aston Martin Vanquish");
        astonMartin.setYear(2020);

        System.out.println("The best car ever is " + astonMartin.getColor() + " " + astonMartin.getModel()
                + " " + astonMartin.getYear() + " year");


    }
}
