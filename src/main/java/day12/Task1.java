package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();

        cars.add("Ford");
        cars.add("Aston Martin");
        cars.add("Ferrari");
        cars.add("Subaru");
        cars.add("Jeep");

        System.out.println(cars);

        cars.add(3, "Toyota");
        cars.remove(0);

        System.out.println(cars);

    }
}
