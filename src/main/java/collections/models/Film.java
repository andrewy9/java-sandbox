package collections.models;

public class Film implements Comparable<Film>{

    private String title;
    private String director;
    private int releaseYear;

    public Film(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public int compareTo(Film film) {
        return title.compareTo(film.getTitle());
    }

    @Override
    public String toString() {
        return title + " " + director + " " + releaseYear;
    }
}
