package generics.activity3;

public class BoxTest {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(24);
        Integer integerValue = integerBox.get();
        System.out.println(integerValue);
        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.14);
        Double doubleValue = doubleBox.get();
        System.out.println(doubleValue);
//        Box<String> stringBox = new Box<>();
//        stringBox.set("String Box");
//        String stringValue = stringBox.get();
//        System.out.println(stringValue);
    }
}
