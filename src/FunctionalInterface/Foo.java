package FunctionalInterface;

import java.util.function.Function;

public class Foo {
    public static void main(String[] args) {
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiple2 = (i) -> i * 2;

        System.out.println(plus10.apply(1));
        System.out.println(multiple2.apply(1));

    }
}
