package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите делимое: ");
            double divident = scan.nextDouble();
            System.out.print("Введите делитель: ");
            double divider = scan.nextDouble();
            if (divider == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println("Результат деления: " + (divident / divider));
        }

    }
}
