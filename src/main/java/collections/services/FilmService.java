package collections.services;

import collections.models.Film;
import collections.models.FilmV2;
import collections.models.FilmRecord;

import java.util.*;

public class FilmService {
    Film alpha = new FilmV2("alpha", "john", 1999);
    Film beta = new FilmV2("beta", "john", 2002);
    Film sigma = new FilmV2("sigma", "carl", 2009);

    public void play() {
        List<Film> filmRecord = FilmRecord.getFilms();
        System.out.println(filmRecord);

        filmRecord.sort(Comparator.comparing(Film::getTitle));
        System.out.println(filmRecord);

        Set<Film> filmSet = new HashSet<>(filmRecord);
        System.out.println(filmSet);
    }

    public void list_and_set () {
        List<Film> filmList = new ArrayList<>();
        filmList.add(alpha);
        filmList.add(beta);
        filmList.add(alpha);
        filmList.add(new Film("alpha", "john", 1999));
        filmList.add(sigma);
        filmList.add(beta);

        filmList.sort(Comparator.comparing(Film::getTitle));
        Set<Film> filmSet = new HashSet<>(filmList);

        System.out.println(filmList);
        System.out.println(filmSet);

        System.out.println(
                filmList.get(0) == filmList.get(1)
        );
    }

    public void hashSet() {
        List<Film> filmList = new ArrayList<>();
        filmList.add(alpha);
        filmList.add(alpha);
        filmList.add(new FilmV2("alpha", "john", 1999));
        filmList.add(beta);
        filmList.add(sigma);

        Set<Film> filmSet = new HashSet<>(filmList);
        System.out.println(filmSet);

        Set<Film> filmTreeSet = new TreeSet<>(filmList);
//        Set<Film> filmTreeSet = new TreeSet<>((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(filmTreeSet);
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

}
