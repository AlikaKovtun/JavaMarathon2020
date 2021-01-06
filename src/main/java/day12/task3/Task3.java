package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> bands = new ArrayList<>();

        bands.add(new MusicBand("Queen", 1970));
        bands.add(new MusicBand("Rammstein", 1994));
        bands.add(new MusicBand("Nirvana", 1987));
        bands.add(new MusicBand("Scorpions", 1965));
        bands.add(new MusicBand("DDT", 1980));
        bands.add(new MusicBand("Tatu", 2001));
        bands.add(new MusicBand("Tartak", 2005));
        bands.add(new MusicBand("Radost", 2010));
        bands.add(new MusicBand("NeAngeli", 2012));
        bands.add(new MusicBand("Pilot", 2003));

        Collections.shuffle(bands);

        List<MusicBand> bandsAfter2000 = groupsAfter2000(bands);
        System.out.println("Все группы: ");
        System.out.println(bands);
        System.out.println("Группы основанные после 2000 года:");
        System.out.println(bandsAfter2000);


    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandsAfter2000 = new ArrayList<>();

        for (MusicBand mb : bands) {
            if (mb.getYear() >= 2000)
                bandsAfter2000.add(mb);
        }
        return bandsAfter2000;
    }

}
