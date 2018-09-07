package stream;

import java.util.stream.Stream;

public class DropTakeWhile {

    public static void main(String[] args) {
        System.out.println("takeWhile");
        Stream.of(1, 2, 3, 4, 10, 1).takeWhile(i -> i < 4).forEach(System.out::print);


        System.out.println("dropWhile");
        Stream.of(1, 2, 3, 4, 10, 1, 2,3,4,5,6).dropWhile(i -> i <= 3).forEach(System.out::print);
    }
}
