import collections.services.FilmService;
import streams.services.StringStreamService;

public class JavaSandbox {

    public static void main(String[] args) {
        FilmService filmService = new FilmService();
//        filmService.testListOf();

        StringStreamService stringStreamService = new StringStreamService();
//        stringStreamService.limitCollectStream();
//        stringStreamService.sortLimitCollectStream();
//        stringStreamService.testCollectionImmutability();
        stringStreamService.testMap();


    }


}