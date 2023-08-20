package generics.activity1;

public class Box<T> {
    private T field;

    public void set(T field) {
        this.field = field;
    }

    public T get() {
        return field;
    }
}
