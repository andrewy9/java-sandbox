import models.Film;
import models.FilmRecord;
import models.FilmV2;

import java.util.*;

public class JavaSandbox {
    Film alpha = new FilmV2("alpha", "john", 1999);
    Film beta = new FilmV2("beta", "john", 2002);
    Film sigma = new FilmV2("sigma", "carl", 2009);
    public static void main(String[] args) {
        new JavaSandbox().hashSet();
    }

    void play() {
        List<Film> filmRecord = FilmRecord.getFilms();
        System.out.println(filmRecord);

        filmRecord.sort(Comparator.comparing(Film::getTitle));
        System.out.println(filmRecord);

        Set<Film> filmSet = new HashSet<>(filmRecord);
        System.out.println(filmSet);
    }

    void list_and_set () {
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

    void hashSet() {
        List<Film> filmList = new ArrayList<>();
        filmList.add(alpha);
        filmList.add(alpha);
        filmList.add(new FilmV2("alpha", "john", 1999));
        filmList.add( beta);

        Set<Film> filmSet = new HashSet<>(filmList);

        System.out.println(filmList);
        System.out.println(filmSet);


    }
}