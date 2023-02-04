package collections.models;

public class FilmV2 extends Film{

    private Publisher publisher;
    public FilmV2(String title, String director, int releaseYear) {
        super(title, director, releaseYear);
        this.publisher = new Publisher("Paramount");
    }

    @Override
    public boolean equals(Object aFilm) {
        FilmV2 other = (FilmV2) aFilm;
        boolean result = this.publisher.getName().equals(other.publisher.getName());
        return result;
    }

    @Override
    public int hashCode() {
        if (getTitle() == "beta") {
            return 7;
        }
        return getTitle().hashCode();
    }

    public void shoutPublisher() {
        System.out.println(publisher);
    }
}
