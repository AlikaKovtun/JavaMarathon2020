package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        createTXTNumbersFile(new File("file1.txt"));
        createAverageDoubleFile(new File("file1.txt"), new File("file2.txt"));
        printResult(new File("file2.txt"));

    }

    public static void createTXTNumbersFile(File file) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(file);
        for(int i = 0; i<1000; i++) {
            int number = (int) (Math.random()*101);
            pw.print(number);
            pw.print(" ");
        }
        pw.close();
    }

    public static void createAverageDoubleFile(File file, File file2) throws FileNotFoundException {
        final int count_of_numbers = 20;
        int counter = 0;
        int sum = 0;
        Scanner scan = new Scanner(file);
        PrintWriter pw = new PrintWriter(file2);
        while (scan.hasNext()) {
            sum += scan.nextInt();
            counter++;
            if(counter == count_of_numbers) {
                pw.print((double)sum/count_of_numbers);
                pw.print(" ");
                counter = 0;
                sum = 0;
            }
        }
        pw.close();
        scan.close();
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        double sum = 0;
        while (scan.hasNext()) {
            sum += scan.nextDouble();
        }
        int sumInt = (int) sum;
        System.out.println(sumInt);


    }

}
