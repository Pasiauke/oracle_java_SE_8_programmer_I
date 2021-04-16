import executable.Executable;
import features.Features;
import imp.main.Import;
import scope.Scope;
import structure.ClassStructure;

import java.util.Arrays;

public class JavaBasics {

    public static void main(final String... args) {
        if (args.length != 0) {
            ARGS argument = ARGS.getArg(args[0]);
            switch (argument) {
                case SCOPE:
                    System.out.println("Hello! Start Scope tutorial...");
                    new Scope().run();
                    break;
                case STRUCTURE:
                    System.out.println("Hello! Start Structure tutorial...");
                    new ClassStructure().method();
                    break;
                case EXECUTABLE:
                    System.out.println("Hello! Start Executable tutorial...");
                    Executable.main(args);
                    break;
                case IMPORT:
                    System.out.println("Hello! Start Import tutorial...");
                    new Import().run();
                    break;
                case FEATURES:
                    System.out.println("Hello! Start Features tutorial...");
                    new Features().features();
                    break;
                default:
                    System.out.println("Hello!" + Arrays.toString(args));

            }
        }
    }

    private enum ARGS {
        SCOPE("scope"),
        STRUCTURE("structure"),
        EXECUTABLE("executable"),
        IMPORT("import"),
        FEATURES("features");

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
