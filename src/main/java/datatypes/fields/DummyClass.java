package datatypes.fields;

public class DummyClass {

    public int publicField;
    private int privateField;

    public int getPrivateField() {
        return this.privateField;
    }

    public void setPrivateField(final int privateField) {
        this.privateField = privateField;
    }
}
