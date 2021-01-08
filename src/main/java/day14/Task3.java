package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        try {
            System.out.println(parseFileToObjList(new File("people")));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }


    public static List<Human> parseFileToObjList(File file) throws FileNotFoundException {
        List<Human> people = new ArrayList<>();
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String human = scan.nextLine();
            int space = human.indexOf(" ");
            String name = human.substring(0, space);
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
            int ageInt = Integer.parseInt(age);
            people.add(new Human(name, ageInt));

        }
        return people;
    }
}
