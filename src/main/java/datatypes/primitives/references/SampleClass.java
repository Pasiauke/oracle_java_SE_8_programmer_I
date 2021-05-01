package datatypes.primitives.references;

import java.nio.charset.StandardCharsets;
import java.util.Random;

public class SampleClass {

    private final String field;

    private final int anotherField;

    public SampleClass(final String field, final int anotherField) {
        this.field = field;
        this.anotherField = anotherField;
    }

    public String compute() {
        StringBuilder builder = new StringBuilder(field);

        for (int i = 0; i < anotherField; i++) {
            byte[] array = new byte[7]; // length is bounded by 7
            new Random().nextBytes(array);
            String generatedString = new String(array, StandardCharsets.UTF_8);

            builder.append(generatedString);
        }

        return builder.toString();
    }
}
