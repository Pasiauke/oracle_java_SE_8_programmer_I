package executable;

/**
 * @author Paweł Kołczyk-Kasprzycki pawel.kolczyk.kasprzycki@gmail.com
 * <p>
 * Purpose of this class is to show how to run java program and producing console output
 * <p>
 * How to run java program:
 * 1. Compile class file that contains "main" method
 * javac .\BasicApplication.java
 * <p>
 * This produces a compiled byte file BasicApplication.class
 * <p>
 * 2. Run compiled code
 * java BasicApplications
 */

public class Executable {

    // This is a main application method. It is an entry point of every java program.
    // main method MUST be "public" and "static" and have parameters of String array
    // There can be only one "main" method in scope of the class
    public static void main(String[] args) {
        // This line passes argument to the "out" stream this means to the basic application stream.
        // Argument will be shown in the console
        System.out.println("Hello world!");
    }
}
