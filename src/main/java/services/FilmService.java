package services;

import models.films.Film;
import models.films.FilmRecord;
import models.films.FilmV2;

import java.util.*;

public class FilmService {
    List<Film> films;

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

    public void play() {
        List<Film> filmRecord = FilmRecord.getFilms();
        System.out.println(filmRecord);

        filmRecord.sort(Comparator.comparing(Film::getTitle));
        System.out.println(filmRecord);

        Set<Film> filmSet = new HashSet<>(filmRecord);
        System.out.println(filmSet);
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

}
