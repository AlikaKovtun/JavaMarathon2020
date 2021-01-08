package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws Exception {
        try {
            printSumDigits(new File("numbers"));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }

    public static void printSumDigits(File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        int counter = 0;
        int sum = 0;
        while (scan.hasNextLine()) {
            int number = Integer.parseInt(scan.nextLine());
            sum+=number;
            counter++;

        }
        if(counter<10||counter>10) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Некорректный входной файл");
            }
        }
        else System.out.println("Сумма чисел: " + sum);

    }
}
