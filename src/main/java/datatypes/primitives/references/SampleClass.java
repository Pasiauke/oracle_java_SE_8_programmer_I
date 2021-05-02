package datatypes.primitives.references;

public class SampleClass {

    private final String field;

    public SampleClass() {
        this("ABC");
    }

    public SampleClass(final String field) {
        this.field = field;
    }

    public void display() {
        System.out.println("Display object: " + this.field);
    }

    @Override
    protected void finalize() {
        System.out.println(">>> [" + this.field + "] object is collected by GC");
    }

    @Override
    public String toString() {
        return "Class field: " + this.field;
    }
}
