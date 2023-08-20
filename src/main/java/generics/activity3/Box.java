package generics.activity3;

public class Box<T extends Number> {
    private T field;

    public void set(T field) {
        this.field = field;
    }

    public T get() {
        return field;
    }
}
