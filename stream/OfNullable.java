package stream;

import java.util.stream.Stream;

public class OfNullable {

    public static void main(String[] args) {
        System.out.println(Stream.ofNullable(null).count());
        System.out.println(Stream.ofNullable(new Object()).count());
    }
}
