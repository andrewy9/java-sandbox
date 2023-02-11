package services;

import models.films.Film;

import java.util.Comparator;
import java.util.List;

public class StreamPuzzle {
    public static void mian (String[] args) {
        FilmSearch songSearhc = new FilmSearch();
    }
}

class FilmSearch {
    private final List<Film> films = new FilmService().getFilms();

    void PrintTopFiveFilms() {
        List<String> topFive = films.stream()
                .distinct()
                .sorted(Comparator.comparingInt(Film::getReleaseYear))
                .limit(5)
                .map(Film::getTitle)
                .toList();

        System.out.println(topFive);
    }
}
