package services;

import models.songs.Song;
import models.songs.Songs;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamService {
    private List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");

    public void compareWithOriginal () {
        List <String> limitedString = strings.stream()
                .limit(4)
                .toList();

        System.out.println(strings);
        System.out.println(limitedString);
    }

    public void coffeeOrder() {
        List<String> coffees = List.of("Cappuccino", "Americano", "Espresso", "Cortado", "Mocha", "Cappuccino", "FlatWhite", "Latte");
        List<String> coffeesEndingInO = coffees.stream()
                .distinct()
                .sorted()
                .filter(s -> s.endsWith("o") )
                .collect(Collectors.toList());

        System.out.println(coffeesEndingInO);
    }

    public void findSongByGenre(String str) {
        List<Song> songs = new Songs().getSongs();

        List<Song> songByGenre = songs.stream()
                .filter(s -> s.getGenre().equalsIgnoreCase(str))
                .toList();
        System.out.println(songByGenre);
    }

    public void findSongByGenreContaining(String str) {
        List<Song> songs = new Songs().getSongs();
        List<Song> songByGenre = songs.stream()
                .filter(s -> s.getGenre().toLowerCase().contains(str.toLowerCase()))
                .toList();
        System.out.println(songByGenre);
    }

    public void listGenres() {
        List<String> genres = new Songs().getSongs()
                .stream()
                .map(Song::getGenre)
                .distinct()
                .toList();
    }

    public void testOptional(String str) {
        Optional<Song> firstSongOptional = new Songs().getSongs()
                .stream()
                .filter(s -> s.getGenre().toLowerCase().contains(str.toLowerCase()))
                .findFirst();

        if (firstSongOptional.isPresent()) {
            System.out.println(firstSongOptional);
        } else {
            System.out.println("fu");
        }
    }


}
