import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;

    private String orderer;

    private String ordererNickname;
    private OrderStatus orderStatus;
    private Order() {

    }

    private static final Order ORDER = new Order();
    public static Order newInstance() {
        return ORDER;
    }

    public static void main(String[] args) {
        Order order = new Order();
        if (order.orderStatus.equals(OrderStatus.aa)) {
            System.out.println("okk");
        }
    }


}
class Main {
    public static void main(String[] args) {
        HelloService ko = HelloService.of("ko");
        System.out.println(ko.hello());
        System.out.println(ko instanceof HelloService);
        System.out.println(ko instanceof KoreanHelloService);


        // 선언은 리턴타입에 인터페이스를 넣어지만 막상 리턴을 해주는 인스턴스는 인터페이스의 구현체로 얼마든지 바꿔줄
            //수 있다또한 인터페이스가 아니라 클래스를 선언해놓고 해당하는 클래스의 하위 클래스를 리턴할 수 있다.

//        기본적으로 정적 팩토리 메소드만을 쓰게끔 하는 클래스는 생성자를 private로 만들어야 한다. 그 말은 상속을 허용하지 않는다는 의미
//                정적 팩토리 메소드를 만들지만 생성자를 허용하는 경우도 있다. static한 정적 팩토리도 제공하면서 new도 제공하는 경우도 있다
//                예로는 List가 있다.
        System.out.println(OrderStatus.aa.hashCode());
        System.out.println(OrderStatus.bb.hashCode());
        System.out.println(OrderStatus.cc.hashCode());

      OrderStatus orderStatus = OrderStatus.aa;
//        System.out.println(orderStatus.);

        NutritionFacts nutritionFacts = new NutritionFacts.Builder(200, 8).calories(100)
                .sodium(33).carbohydrate(20).build();
        System.out.println(nutritionFacts.toString());

    }
}