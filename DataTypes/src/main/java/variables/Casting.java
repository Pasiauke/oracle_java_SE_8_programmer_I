package variables;

/**
 * @author Paweł Kołczyk-Kasprzycki pawel.kolczyk.kasprzycki@gmail.com
 * <p>
 * In this class we are gonna know how to cast one variable type into another
 *
 */
public class Casting {
    byte b = 11;
    short s = 22;
    int i = 33;
    long l = 44;
    float f = 55;
    double d = 66;

    public void casting(){
        // There are two types of casting - widening (automatically) and narrowing (manually)

        // Widening - this type of casting are used when smaller data type are casted into larger one
        // byte -> short -> -> int -> long -> float -> double
        // Examples:
        System.out.println("WIDENING CASTING");
        double dd = b;
        System.out.println("double from byte: " + dd);
        float ff = i;
        System.out.println("float from int: " + ff);
        int ii = s;
        System.out.println("int from short: " + ii);


        // Narrowing - converting a larger type to a smaller size type
        // double -> float -> long -> int -> short -> byte
        // Examples:
        System.out.println("NARROWING CASTING");
        byte bb = (byte) d;
        System.out.println("byte from double: " + bb);
        int iii = (int) f;
        System.out.println("int from float: " + iii);
        short ss = (short) l;
        System.out.println("short from long: " + ss);

        // The char type requires always narrowing casting since it express different data type as the previous one
        System.out.println("CHAR CASTING");
        char c1 = (char) b;
        System.out.println("byte: " + b + " to char: " + c1);
        char c2 = (char) s;
        System.out.println("short: " + s + " to char: " + c2);
        char c3 = (char) i;
        System.out.println("int: " + i + " to char: " + c3);
        char c4 = (char) l;
        System.out.println("long: " + l + " to char: " + c4);
        char c5 = (char) f;
        System.out.println("float: " + f + " to char: " + c5);
        char c6 = (char) d;
        System.out.println("double: " + d + " to char: " + c6);

        // The boolean data type is an exception - it cannot be casted to other types and other types cannot cast from boolean



    }
}
