package datatypes.lifecycle;

import common.Lesson;

public class ObjectLifecycle implements Lesson {

    @Override
    public void start() {

        System.out.println("In this lesson we are gonna describe the life cycle of an object in java.");

        System.out.println("1. First the java classes must be compiled. Pre compiled java classes are stored in .java files. After compilation" +
                "\n.class files are created.");
        System.out.println("2. When java program is starting, compiled classes must be loaded into memory from runtime can reads it." +
                "\nAt this time class is not loaded from memory into runtime. This is done when class is needed.");
        SomeObject someObject = null; 
        System.out.println("3. Runtime looks for all initialized STATIC members of the class as static fields, static methods and static blocks.");

    }
}
