package lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Foo {
    public static void main(String[] args) {
        BinaryOperator<Integer> get = (a, b) -> a + b;

    }
}
