import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String words = "Matata akuna tiki taka porque no itiendo aragones dexp totoro";
        String[] arrWords = words.split(" ");
        List<String> listWords =  Arrays.stream(arrWords).sorted(Comparator.naturalOrder()).collect(Collectors.toList()); // Здесь мы видим пример монада
        StringBuilder dictionary = new StringBuilder();
        Function<String, String> convert = x -> x + " "; // Пример чистой функции
        for (String word : listWords ) {
            System.out.println(word);
            dictionary.append(convert.apply(word));
        }
        System.out.println(dictionary);
    }
}
