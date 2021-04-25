import primitives.Primitives;
import variables.Casting;
import variables.Variables;

import java.util.Arrays;

public class DataTypes {

    public static void main(final String... args) {
        if (args.length != 0) {
            ARGS argument = ARGS.getArg(args[0]);
            switch (argument) {
                case VARIABLES:
                    System.out.println("Hello! Start Variables tutorial...");
                    new Variables().variables();
                    new Casting().casting();
                    break;
                case PRIMITIVES:
                    System.out.println("Hello! Start Primitives tutorial...");
                    new Primitives().primitives();
                    break;
                case WRITE_OBJECTS:
                    System.out.println("Hello! Start Write objects to field tutorial...");
                    break;
                case LIFECYCLE:
                    System.out.println("Hello! Start Lifecycle tutorial...");
                    break;
                case WRAPPERS:
                    System.out.println("Hello! Start Wrappers tutorial...");
                    break;
                default:
                    System.out.println("Please use correct argument!");

            }
        }
    }

    private enum ARGS {
        VARIABLES("variables"),
        PRIMITIVES("primitives"),
        WRITE_OBJECTS("writeObjects"),
        LIFECYCLE("lifecycle"),
        WRAPPERS("wrappers");

        private final String name;

        ARGS(final String name) {
            this.name = name;
        }

        public static ARGS getArg(final String name) {
            return Arrays.stream(values())
                    .filter(a -> a.getName().equals(name))
                    .findFirst().orElse(null);
        }

        public String getName() {
            return this.name;
        }

    }
}
