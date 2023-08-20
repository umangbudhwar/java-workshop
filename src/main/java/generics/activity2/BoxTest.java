package generics.activity2;

import generics.activity1.Box;

public class BoxTest {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(24);
        Integer integerValue = integerBox.get();
        System.out.println(integerValue);
        Box<String> stringBox = new Box<>();
        stringBox.set("String Box");
        String stringValue = stringBox.get();
        System.out.println(stringValue);
    }
}
