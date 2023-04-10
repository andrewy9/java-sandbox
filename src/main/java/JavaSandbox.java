import services.FilmService;
import services.LambdaService;
import services.StreamService;

public class JavaSandbox {

    public static void main(String[] args) {
        FilmService filmService = new FilmService();
        StreamService streamService = new StreamService();
        LambdaService lambdaService = new LambdaService("sunny");

        streamService.testOptional("blue");

        filmService.printTopFiveFilms();
        filmService.search("john");
        filmService.search("beach boys");

        lambdaService.capitaliseName(name -> name.toUpperCase());
        System.out.println(lambdaService.name);
    }

}