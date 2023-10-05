package item1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays.stream(OrderStatus.values()).forEach(System.out::println);

    }
}
