package scope;

/**
 * @author Paweł Kołczyk-Kasprzycki pawel.kolczyk-kasprzycki@gmail.com
 * <p>
 * This purpose of this class is show the scope of variables in Java.
 *
 */

public class Scope {

    private static final String classScopeVariable = "This variable's scope is class";

    public void run() {

        final String methodScopeVariable = "This variable's scope is method";
        System.out.println(methodScopeVariable);


        for (int i = 0; i < 2; i++) {
            String loopScopeVariable = "This variable's scope is loop";
            System.out.println(loopScopeVariable);
            System.out.println(methodScopeVariable);
            System.out.println(classScopeVariable);
        }

        {
            String blockScopeVariable = "This variable's scope is block";
            System.out.println(blockScopeVariable);
            System.out.println(methodScopeVariable);
            System.out.println(classScopeVariable);

        }
        System.out.println(methodScopeVariable);
        System.out.println(classScopeVariable); // Prints "This variable's scope is class"
        final String classScopeVariable = "Shadowed variable"; // This is variable shadowing and it's a bad practice!
        System.out.println(classScopeVariable); // Prints "Shadowed variable"

    }
}
