package basics.features;

import common.Lesson;

/**
 * @author Paweł Kołczyk-Kasprzycki pawel.kolczyk.kasprzycki@gmail.com
 * <p>
 * This purpose of this class is to describe the main features of the java language and platform
 */

public class Features implements Lesson {
    private static final String NEW_LINE = "\n";

    private static final String FEATURES = "JAVA FEATURES" + NEW_LINE;

    private static final String SIMPLICITY =
            "* Simplicity - Java is simpler than most other languages that are used to create " +
                    "server applications, because of its consistent enforcement of the object " +
                    "model. The large, standard set of class libraries brings powerful tools " +
                    "to Java developers on all platforms." + NEW_LINE;

    private static final String PORTABILITY =
            "* Portability - Java is portable across platforms. It is possible to write " +
                    "platform-dependent code in Java, and it is also simple to write programs " +
                    "that move seamlessly across systems." + NEW_LINE;

    private static final String AUTOMATIC_STORE_MANAGEMENT =
            "* Automatic storage management - A JVM automatically performs all memory allocation " +
                    "and deallocation while the program is running. Java programmers cannot " +
                    "explicitly allocate memory for new objects or free memory for objects that " +
                    "are no longer referenced. Instead, they depend on a JVM to perform these " +
                    "operations. The process of freeing memory is known as garbage collection." + NEW_LINE;

    private static final String STRONG_TYPING =
            "* Strong typing - Before you use a field, you must declare the type of the field. " +
                    "Strong typing in Java makes it possible to provide a reasonable and safe solution " +
                    "to interlanguage calls between Java and PL/SQL applications, and to integrate " +
                    "Java and SQL calls within the same application." + NEW_LINE;

    private static final String NO_POINTERS =
            "* No pointers - Although Java is quite similar to C in its syntax, it does not support " +
                    "direct pointers or pointer manipulation. You pass all parameters, except primitive " +
                    "types, by reference and not by value. As a result, the object identity is preserved. " +
                    "Java does not provide low level, direct access to pointers, thereby eliminating any " +
                    "possibility of memory corruption and leaks." + NEW_LINE;

    private static final String EXCEPTION_HANDLING =
            "* Exception handling - Java exceptions are objects. Java requires developers to declare which " +
                    "exceptions can be thrown by methods in any particular class." + NEW_LINE;

    private static final String FLEXIBLE_NAMESPACE =
            "* Flexible namespace - Java defines classes and places them within a hierarchical structure " +
                    "that mirrors the domain namespace of the Internet. You can distribute Java " +
                    "applications and avoid name collisions. Java extensions, such as the Java Naming " +
                    "and Directory Interface (JNDI), provide a framework for multiple name services " +
                    "to be federated. The namespace approach of Java is flexible enough for Oracle to " +
                    "incorporate the concept of a schema for resolving class names in full compliance " +
                    "with the JLS." + NEW_LINE;
    private static final String SECURITY =
            "* Security - The design of Java bytecodes and JVM specification allow for built-in mechanisms " +
                    "to verify the security of Java binary code. Oracle Database is installed with an " +
                    "instance of Security Manager that, when combined with Oracle Database security, " +
                    "determines who can call any Java methods." + NEW_LINE;

    private static final String CONNECTIVITY_STANDARDS_TO_RDB =
            "* Standards for connectivity to relational databases - Java Database Connectivity (JDBC) " +
                    "and SQLJ enable Java code to access and manipulate data in relational databases. " +
                    "Oracle provides drivers that allow vendor-independent, portable Java code to " +
                    "access the relational database." + NEW_LINE;

    @Override
    public void start() {

        System.out.println(
                FEATURES +
                        NEW_LINE +
                        SIMPLICITY +
                        PORTABILITY +
                        AUTOMATIC_STORE_MANAGEMENT +
                        STRONG_TYPING +
                        NO_POINTERS +
                        EXCEPTION_HANDLING +
                        FLEXIBLE_NAMESPACE +
                        SECURITY +
                        CONNECTIVITY_STANDARDS_TO_RDB

        );
    }

}
