package item03;


public class MetaElvis<T> {
    private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();
    private MetaElvis() {
    }
    @SuppressWarnings("unchecked")
    public static <E> MetaElvis<E> getInstance(){ return (MetaElvis<E>) INSTANCE;}
    public void say(T t) {
        System.out.println(t);
    }

    public void leaveTheBuild() {
        System.out.println("Whoa baby, i`m outta here!");
    }

    public static void main(String[] args) {

    }
}
