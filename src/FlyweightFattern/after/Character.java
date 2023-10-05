package FlyweightFattern.after;

public class Character {
    private char value;
    private String color;
    private Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }

    @Override
    public String toString() {
        return "Character{" +
                "value=" + value +
                ", color='" + color + '\'' +
                ", fontFamily=" + font.family +
                ", fontSize=" + font.size +
                '}';
    }
}
