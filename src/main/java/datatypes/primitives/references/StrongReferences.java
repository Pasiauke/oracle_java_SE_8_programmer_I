package datatypes.primitives.references;

import common.Lesson;
import datatypes.primitives.references.base.SimpleClass;

import static datatypes.primitives.References.callGC;

public class StrongReferences implements Lesson {

    @Override
    public void start() {

        System.out.println("Strong reference is default type objects reference in java.\n" +
                "This means object will not be collected by garbage collector until it have a\n" +
                "strong reference to a value.");

        System.out.println("Create ABC and DEF objects with strong reference...");
        SimpleClass abc = new SimpleClass();
        SimpleClass def = new SimpleClass("DEF");
        abc.display();

        // Forceful call the garbage collector
        callGC();
        System.out.println("Apply DEF to a ABC reference. ABC have no references");
        abc = def;

        // Forceful call the garbage collector
        callGC();

        System.out.println("Detach reference from DEF object");
        def = null;

        // Forceful call the garbage collector
        callGC();
    }
}
