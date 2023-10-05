package item1;

public class Order {
    private int id;
    private String name;
    private String nickname;

//    public Order(int id, String name) { //동일한 타입의 시그니처 생성자가 있기에 에러
//        this.id = id;
//        this.name = name;
//    }
//
//    public Order(int id, String nickname) { //동일한 타입의 시그니처 생성자가 있기에 에러
//        this.id = id;
//        this.nickname = nickname;
//    }

    public static Order newOrderByName() { // 정적 팩토리 메소드를 사용해 동일한 시그니처도 메소드명만 바꿈으로 가능
        Order order = new Order();
        order.id = 1;
        order.name = "kjs";
        return order;
    }

    public static Order newOrderByNickname() { // 정적 팩토리 메소드를 사용해 동일한 시그니처도 메소드명만 바꿈으로 가능
        Order order = new Order();
        order.id = 1;
        order.nickname = "js";
        return order;
    }
}
