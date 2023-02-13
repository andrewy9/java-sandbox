package services;

import models.films.Film;
import models.films.FilmV2;

import java.util.*;

public class FilmService {
    private List<Film> films;

    public List<Film> getFilms() {
        return films;
    }

    public FilmService() {
        Film alpha = new FilmV2("alpha", "john", 1999);
        Film beta = new FilmV2("beta", "john", 2002);
        Film sigma = new FilmV2("sigma", "carl", 2009);

        films = new ArrayList<>();
        films.add(beta);
        films.add(sigma);
        films.add(alpha);
        films.add(sigma);
    }

    public void sortByYear() {
        films.sort((f1, f2) -> f1.getReleaseYear() - f2.getReleaseYear());

        System.out.println(films);
    }

    public void testListOf() {
        List <String> listOfString = List.of("a","b","c");
//        listOfString.add("d");
//        listOfString.remove("c");
        HashSet<String> hashOfString = new HashSet<>(listOfString);
        hashOfString.add("d");
        System.out.println(listOfString);
        System.out.println(hashOfString);
    }
    public void makeFilmSet() {

        List<Film> newFilms = new ArrayList<>();
        newFilms.addAll(films);
        newFilms.add( new FilmV2("alpha", "john", 1999));

        System.out.println(films);
        System.out.println(newFilms);

        Set<Film> filmSet = new HashSet<>(newFilms);
        System.out.println(filmSet);
    }

    public void makeFilmTreeSet() {
        List<Film> newFilms = new ArrayList<>();
        newFilms.addAll(films);
        newFilms.add( new FilmV2("alpha", "john", 1999));

        Set<Film> filmTreeSet = new TreeSet<>(newFilms);
        System.out.println(filmTreeSet);
    }

    public void printTopFiveFilms() {
        List<String> topFive = films.stream()
                .distinct()
                .sorted(Comparator.comparingInt(Film::getReleaseYear))
                .limit(5)
                .map(Film::getTitle)
                .toList();
        System.out.println(topFive);
    }

    public void search(String director) {
        Optional<Film> result =  films.stream()
                .filter(film -> film.getDirector().equals(director))
                .findFirst();

        if (result.isPresent()) {
            System.out.println(result.get().getDirector());
        } else {
            System.out.println("No movie found by: " + director);
        }
    }
}
