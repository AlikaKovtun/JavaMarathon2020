package day6;


public class Task1 {
    public static void main(String[] args) {

        Motorbike moto = new Motorbike(2019, "Red", "GB12");

        moto.info();
        System.out.println(moto.yearDifference(2025));
        System.out.println(moto.yearDifference(1988));


    }
}
