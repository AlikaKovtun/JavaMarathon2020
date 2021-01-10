package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        printResult(new File("numbers"));
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        int sum = 0;
        int counter = 0;
        while (scan.hasNextLine()) {
            sum += Integer.parseInt(scan.nextLine());
            counter++;
        }
        double average = (double) sum / counter;
        System.out.println(average);
        System.out.printf("%.3f", average);

    }
}

