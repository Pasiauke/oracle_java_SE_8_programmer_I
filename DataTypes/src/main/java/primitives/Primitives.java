package primitives;

/**
 * @author Paweł Kołczyk-Kasprzycki pawel.kolczyk.kasprzycki@gmail.com
 * <p>
 * This class purpose is to show the difference between primitive and reference variables aswell as
 * describe all existing primitive types in java 8.
 *
 */
public class Primitives {
    // Primitive variable - this type of variables simply stores a value
    // Reference variable - this type of variables stores a reference to an object in memory

    // Primitive types and addresses of the objects are stored in STACK memory
    // Object values are stored in HEAP memory
    // Object reference (address) stored in STACK pointed on the value in HEAP

    public void primitives() {

        byte _byte = 0;             // SIZE: 8 bits     RANGE: -128 <=> 127

        short _short = 1;           // SIZE: 16 bits    RANGE: -32,768 <=> 32,767

        int _int = 2;               // SIZE: 32 bits    RANGE: -2,147,483,648 <=> 2,147,483,647
        // In order to implement unsigned mechanism you should use Integer class static methods Integer.toUnsignedLong() etc.

        long _long = 3L;            // SIZE: 64 bits    RANGE: -9,223,372,036,854,775,808 <=> 9,223,372,036,854,775,807
        // Long class also have static methods for unsigned numbers

        float _float = 4.0F;        // SIZE: 32 bits    RANGE: 1.40239846 x 10^-45 <=> 3.40282347 x 10^38
        // Single precision 32-bit IEEE 754 floating point. This data type should NEVER be used for precise values such as currency
        // in that case java.math.BigDecimal should be used

        double _double = 5.0D;      // SIZE: 64 bits    RANGE: 4.9406564584124654 x 10^-324 <=> 1.7976931348623157 x 10^308
        // Double precision 64-bit IEEE 754 floating point. Like float data type this one should not be used for currencies and such.

        char _char = '6';           // SIZE: 16 bits    RANGE: 0 <=> 65,535
        // This data type store 16 bit UNICODE character. You can directly pass character or just a number representation of it
        // by start a char array for example '\u1234'

        boolean _boolean = true;    // SIZE: 1 bit      RANGE: TRUE <=> FALSE

        // Creating a primitive types with huge values you can use underscore to separate group of numbers
        long _longLong = 1234_5678_9012_3456L;

        // Literals are additional letters that are used for defining value type
        // Some literals are placed at the start of the value and others in the end

        // Literals used at the start indicates using different number system. Also for defining char character
        // 0x = hexadecimal
        // 0b = binary
        // \u = unicode character

        int intHexadecimal = 0x4F;
        int intBinary = 0b100101;

        System.out.println("Hex:  " + intHexadecimal + " Bin: " + intBinary);

        // Literals at the end of the value indicated different datatype
        // l or L = long
        // f or F = float
        // d or D = double
        // e<number> = scientific notation eq. 1234e2

    }
}
