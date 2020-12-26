package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Введите делимое: ");
            double divident = scan.nextDouble();
            System.out.print("Введите делитель: ");
            double divider = scan.nextDouble();
            if (divider == 0) return;
            System.out.println("Результат деления: " + (divident / divider));

        }
    }
}
