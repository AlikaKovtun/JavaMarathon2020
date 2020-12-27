package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scan.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        int moreThan8count = 0;
        int eql1count = 0;
        int oddCount = 0;
        int evenCount = 0;
        int sum = 0;

        for (int number : array) {
            if (number > 8) moreThan8count++;
            else if (number == 1) eql1count++;
            if (number % 2 == 0) evenCount++;
            else oddCount++;
            sum += number;
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Информация о массиве: ");
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + moreThan8count);
        System.out.println("Количество чисел равных 1: " + eql1count);
        System.out.println("Количество четных чисел: " + evenCount);
        System.out.println("Количество нечетных чисел: " + oddCount);
        System.out.println("Сумма всех элементов массива: " + sum);


    }
}
