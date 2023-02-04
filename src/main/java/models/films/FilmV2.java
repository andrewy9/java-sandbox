package models.films;

public class FilmV2 extends Film{
    public FilmV2(String title, String director, int releaseYear) {
        super(title, director, releaseYear);
    }

    @Override
    public boolean equals(Object aFilm) {
        Film other = (Film) aFilm;
        return getTitle().equals(other.getTitle());
    }

    @Override
    public int hashCode() {
        return getTitle().hashCode();
    }
}
