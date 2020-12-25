package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число а: ");
        int a = scan.nextInt();
        System.out.print("Введите число b: ");
        int b = scan.nextInt();

        if (a >= b) {
            System.out.println("Некорректный ввод");
            return;
        }

        while (++a < b) {
            if (a % 5 == 0 && a % 10 != 0) {
                System.out.print(a + " ");
            }
        }

    }
}
