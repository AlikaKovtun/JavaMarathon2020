package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        MusicBand scorpions = new MusicBand("Scorpions", 1965, new ArrayList<>(Arrays.asList("Рудольф Шенкер",
                "Клаус Майне", "Маттиас Ябс", "Павел Мончивода", "Микки Ди")));
        MusicBand rammstein = new MusicBand("Rammstein", 1994, new ArrayList<>(Arrays.asList("Тиль Линдеманн",
                "Рихард Круспе", "Пауль Ландерс", "Оливер Ридель", "Кристиан Лоренц", "Кристоф Шнайдер")));

        System.out.println("До слияния групп:");
        rammstein.printMembers();
        scorpions.printMembers();
        System.out.println();
        MusicBand.transferMembers(scorpions, rammstein);
        System.out.println("После слияния групп:");
        rammstein.printMembers();
        scorpions.printMembers();


    }
}
