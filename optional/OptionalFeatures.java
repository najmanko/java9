package optional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalFeatures {


    public static void main(String[] args) {

        //Optional.or(Supplier)
        final Optional<String> customValue = Optional.of("custom");
        final Optional<String> defaultValue = Optional.of("default");
        final Optional<String> empty = Optional.empty();

        System.out.println("custom or default:");
        System.out.println(customValue.or(() -> defaultValue).get());//custom
        System.out.println("empty or defalut:");
        System.out.println(empty.or(() -> defaultValue).get());//default

        //Optional.stream()
        System.out.println("aList");
        Optional<String> valueA = Optional.of("a");
        List<String> aList = valueA.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(aList.toString());
        aList.stream().forEach(s -> System.out.println("aList vaue: " + s));

        System.out.println("emptyList");
        Optional<String> valueEmpty = Optional.empty();
        List<String> emptyList = valueEmpty.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(valueEmpty.toString());
        emptyList.stream().forEach(s -> System.out.println("emptyList vaue: " + s));
    }
}