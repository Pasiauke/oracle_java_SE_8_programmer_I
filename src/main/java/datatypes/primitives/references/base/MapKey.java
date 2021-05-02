package datatypes.primitives.references.base;

public class MapKey {

    private final String key;

    public MapKey(final String key) {
        this.key = key;
    }

    @Override
    public String toString(){
        return this.key;
    }

    @Override
    protected void finalize() {
        System.out.println(">>= [" + this.key + "] MapKey is collected by GC");
    }
}
