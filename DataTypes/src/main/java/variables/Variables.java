package variables;

/**
 * @author Paweł Kołczyk-Kasprzycki pawel.kolczyk.kasprzycki@gmail.com
 * <p>
 * In this class we are gonna know how to declare and initialize variables.
 */

public class Variables {
    // Field declaration:
    int classVariable;

    public void variables() {
        int localVariable; // This is how you can declare variable. The syntax is
        // <data type> <variable name>;
        // you have to pass correct data type. It can be a class or a primitive type.
        // you have a freedom with creating a variable name but you have follow some rules:
        // * name cannot start with number or special sign you can use underscore or a dollar
        // * name cannot be a keyword such a 'public' 'class' etc.
        // * name cannot contains spaces or special characters
        // * names are case sensitive

        // These are valid variables:
        int _variable;
        int $variable;

        // Initialization of local variable:
        localVariable = 1;
        // The local variables MUST BE initialized. In other case compiler will throw an error.
        // Local variables are slightly different; the compiler never assigns a default value to an uninitialized local variable.
        // If you cannot initialize your local variable where it is declared, make sure to assign it a value before you attempt
        // to use it. Accessing an uninitialized local variable will result in a compile-time error.

        // The class fields primitive variables do not require initialization. That's because objects are stored in Java Heap Space (Sterta)
        // so the compiler are responsible for automatic initialization of the variables. For classes the default value is null, and for primitives
        // the default values depends on variable type - typically its a 0.
        // Data Type 	            Default Value (for fields)
        // byte 	                0
        // short 	                0
        // int 	                    0
        // long 	                0L
        // float 	                0.0f
        // double 	                0.0d
        // char 	               '\u0000'
        // String (or any object)   null
        // boolean 	                false


        // All methods data are stored in Java Stack Memory. Local variables are part of the methods and java compiler do not instantiate it automatically
        // compiler only do that for objects in heap.


        System.out.println(classVariable);
        System.out.println(localVariable);

    }
}
