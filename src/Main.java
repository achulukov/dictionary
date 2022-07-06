import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String words = "matata akuna tiki taka porque no itiendo aragones dexp totoro";

        words = Arrays.stream(words.split(" "))
                .distinct()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.joining(" ")); // Здесь мы видим пример монада

        Function<String, String[]> convert = x -> x.split(" "); // Пример чистой функции
        String[] dictionary = convert.apply(words);
        for (String word : dictionary) {
            System.out.println(word);
        }
    }
}
