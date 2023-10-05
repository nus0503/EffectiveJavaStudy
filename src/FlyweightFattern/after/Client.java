package FlyweightFattern.after;

public class Client {
    public static void main(String[] args) {
        Character character  = new Character('h', "white", FontFactory.getFont("nanum:12"));
        System.out.println(character.toString());
    }

}

