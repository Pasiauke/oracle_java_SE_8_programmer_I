package structure;

/**
 * @author Paweł Kołczyk-Kasprzycki pawel.kolczyk-kasprzycki@gmail.com
 * <p>
 * Purpose of this class is to show class structure in Java
 */

public // Access modifier
class // "class" keyword which identified that this is class
ClassStructure // class name
{ // start of the class block

    // inside of class can contains fields, methods, blocks, other classes etc.

    // This is a field it may be a primitive variable or other class
    private final String field;

    // This is a class constructor.
    // Constructor is a method called when object of this class is created by using keyword "new".
    // For example: "new ClassStructure();"
    public ClassStructure() {
        this.field = "Field";
    }

    // This is a method
    public void method() {
        System.out.println(this.field);
    }

} // end of the class block
