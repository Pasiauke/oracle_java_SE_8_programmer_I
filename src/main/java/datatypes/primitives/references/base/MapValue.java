package datatypes.primitives.references.base;

import java.nio.charset.StandardCharsets;
import java.util.Random;

public class MapValue {
    private final String value;

    public MapValue() {
        byte[] array = new byte[20];
        new Random().nextBytes(array);
        value = new String(array, StandardCharsets.UTF_8);
    }

    @Override
    public String toString(){
        return this.value;
    }

    @Override
    protected void finalize() {
        System.out.println(">>= [" + this.value + "] MapValue is collected by GC");
    }
}
