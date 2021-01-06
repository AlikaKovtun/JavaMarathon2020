package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        MusicBand scorpions = new MusicBand("Scorpions", 1965, new ArrayList<>(Arrays.asList(new MusicArtist("Рудольф Шенкер", 55),
                new MusicArtist("Клаус Майне", 78), new MusicArtist("Маттиас Ябс", 66),
                new MusicArtist("Павел Мончивода", 70), new MusicArtist("Микки Ди", 77))));
        MusicBand rammstein = new MusicBand("Rammstein", 1994, new ArrayList<>(Arrays.asList(new MusicArtist("Тиль Линдеманн", 55),
                new MusicArtist("Рихард Круспе", 56), new MusicArtist("Пауль Ландерс", 60),
                new MusicArtist("Оливер Ридель", 58), new MusicArtist("Кристиан Лоренц", 70),
                new MusicArtist("Кристоф Шнайдер", 66))));

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
