package methodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();

        UnaryOperator<String> hi = greeting::hello;
//        UnaryOperator<String> hello = Greeting::hello;
        Supplier<Greeting> newGreeting = Greeting::new;
        Function<String, Greeting> kjsGreeting = Greeting::new;
        Function<String, Greeting> js = (s) -> new Greeting(s);
        Greeting kjs = kjsGreeting.apply("kjs");
        System.out.println(kjs.getName());
        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;

//        Integer::toString()
//        Function<Integer, String> f = Integer.toString;
//        Function<Integer, String> f = i -> Integer::toString;
//        Function<Integer, String> f = i -> i.toString();
//        List<String> lists = Arrays.asList("A","B");
//
//        lists.stream()
//                .map(v -> Integer.parseInt(v))
//                .filter(v)
//                .collect(Collectors.toList())
    }

}
