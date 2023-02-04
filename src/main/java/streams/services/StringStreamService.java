package streams.services;

import java.util.List;
import java.util.stream.Collectors;

public class StringStreamService {
    private List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
    public void limitCollectStream() {
        List<String> result = strings.stream()
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(result);
    }

    public void sortLimitCollectStream() {
        List<String> result = strings.stream()
                .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(result);
    }

    public void testCollectionImmutability() {
        List<String> result = strings.stream()
                .limit(4)
                .collect(Collectors.toList());

        System.out.println(strings);
        System.out.println(result);
    }

    public void testMap() {
        List<String> result = strings.stream()
                .limit(4)
                .map((a) -> {
                    System.out.println(a);
                    return a.toUpperCase();
                })
                .collect(Collectors.toList());
    }
}
