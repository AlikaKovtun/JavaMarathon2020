package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> absentShoes = findAbsentShoes(new File("src/main/resources/shoes.csv"));
        createTXTfile(new File("src/main/resources/missing_shoes.txt"), absentShoes);


    }

    public static List<String> findAbsentShoes(File file) throws FileNotFoundException {
        List<String> shoes = new ArrayList<>();
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String pair = scan.nextLine();
            String[] info = pair.split(";");
            if (Integer.parseInt(info[2]) == 0) {
                shoes.add(info[0] + ", " + info[1] + ", " + info[2]);
            }
        }
        return shoes;
    }

    public static void createTXTfile(File file, List<String> list) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(file);
        for (String s : list) {
            pw.print(s + "\n");
        }
        pw.close();
    }
}
