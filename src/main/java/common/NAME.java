package common;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum NAME {
    BASICS("basics"),
    DATA_TYPES("dataTypes");

    private final String name;

    NAME(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static NAME getByName(final String name) {
        return Arrays.stream(values())
                .filter(a -> a.getName().equals(name))
                .findFirst().orElse(null);
    }

    public static List<String> valuesNames() {
        return Arrays.stream(values()).map(NAME::getName).collect(Collectors.toList());
    }
}