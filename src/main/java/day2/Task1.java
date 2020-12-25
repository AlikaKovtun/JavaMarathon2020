package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество этажей: ");
        int etagi = scan.nextInt();

        if (etagi >= 1 && etagi <= 4) System.out.println("Малоэтажный дом");
        else if (etagi >= 5 && etagi <= 8) System.out.println("Среднеэтажный дом");
        else if (etagi >= 9) System.out.println("Многоэтажный дом");
        else if (etagi < 0) System.out.println("Ошибка ввода");

    }
}
