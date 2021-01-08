package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println(parseFileToStringList(new File("people")));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }

    public static List<String> parseFileToStringList(File file) throws Exception {
        List<String> people = new ArrayList<>();
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String human = scan.nextLine();
            int space = human.indexOf(" ");
            String age = human.substring((space + 1));
            if (age.contains("-")) {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.out.println("Некорректный входной файл");
                } finally {
                    return null;
                }
            }
            people.add(human);
        }
        return people;
    }
}
