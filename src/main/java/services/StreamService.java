package services;

import java.util.List;
import java.util.stream.Collectors;

public class StreamService {
    private List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");

    public void compareWithOriginal () {
        List <String> limitedString = strings.stream()
                .limit(4)
                .toList();

        System.out.println(strings);
        System.out.println(limitedString);
    }

    public void coffeeOrder() {
        List<String> coffees = List.of("Cappuccino", "Americano", "Espresso", "Cortado", "Mocha", "Cappuccino", "FlatWhite", "Latte");
        List<String> coffeesEndingInO = coffees.stream()
                .distinct()
                .sorted()
                .filter(s -> s.endsWith("o") )
                .collect(Collectors.toList());

        System.out.println(coffeesEndingInO);
    }

}
