package datatypes.primitives.references.base;

public class SimpleClass {

    private final String field;

    public SimpleClass() {
        this("ABC");
    }

    public SimpleClass(final String field) {
        this.field = field;
    }

    public void display() {
        System.out.println("Display object: " + this.field);
    }

    @Override
    protected void finalize() {
        System.out.println(">>= [" + this.field + "] object is collected by GC");
    }

    @Override
    public String toString() {
        return this.field;
    }
}
