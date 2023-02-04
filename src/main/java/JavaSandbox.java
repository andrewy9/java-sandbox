import models.films.FunctionalInterface;
import services.FilmService;
import services.LambdaService;
import services.StreamService;

public class JavaSandbox {

    public static void main(String[] args) {
        FilmService filmService = new FilmService();
        StreamService streamService = new StreamService();
        LambdaService lambdaService = new LambdaService("sunny");

        filmService.makeFilmTreeSet();
        FunctionalInterface fncInt = String::toUpperCase;
        lambdaService.capitaliseName(fncInt);
        System.out.println(lambdaService.name);
    }


}