import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI
{
    public static void main(String args[])
    {
        Stream<String> s1 = Stream.of("Hello","World","Apple","Ravan");

        s1.forEach(System.out::println);
        System.out.println("--------------------------------------------");

        List<String> l1 = new ArrayList<>();
        l1.add("banana");
        l1.add("apple");
        l1.add("peach");
        l1.add("guava");
        l1.add("zombo");
        l1.add("mango");

        List<String> l2 = l1.stream().filter((msg) -> msg.length() >= 5).collect(Collectors.toList());
        l2.forEach(System.out::println);

        System.out.println("--------------------------------------------");

        List<String> sortedList = l1.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        System.out.println("--------------------------------------------");





    }
}