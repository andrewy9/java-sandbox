package collections.models;

import java.util.ArrayList;
import java.util.List;

public class FilmRecord {
    public static List<Film> getFilms() {
        List<Film> films = new ArrayList<>();
        films.add(new Film("HarryPotter", "JK Rowling", 2001));
        films.add(new Film("Jaw", "Steven Spielberg", 1993));
        films.add(new Film("HarryPotter", "JK Rowling", 2001));
        films.add(new Film("Lord of the Rings", "Peter Griffin", 2007));
        films.add(new Film("Deadpool", "Mr Reynold", 2012));
        films.add(new Film("Lord of the Rings", "Peter Griffin", 2007));
        return films;
    }

}
