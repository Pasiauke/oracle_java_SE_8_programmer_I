package datatypes.primitives.references.base;

public class SimpleClass {

    private final String field;
    private final byte[] bytes;

    public SimpleClass() {
        this("ABC", new byte[]{});
    }

    public SimpleClass(final String field) {
        this.field = field;
        this.bytes = new byte[]{};
    }

    public SimpleClass(final String field, final byte[] bytes) {
        this.field = field;
        this.bytes = bytes;
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
