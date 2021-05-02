package datatypes.primitives.references;

import common.Lesson;
import datatypes.primitives.references.base.SimpleClass;

import static datatypes.primitives.References.callGC;

public class StrongReferences implements Lesson {

    @Override
    public void start() {

        // Strong reference is default type objects reference in java.
        // This means object will not be collected by garbage collector until it have a
        // strong reference to a value.

        // Strong reference is created
        SimpleClass abc = new SimpleClass();
        SimpleClass def = new SimpleClass("DEF");
        abc.display();

        // Forceful call the garbage collector
        callGC();
        System.out.println("Apply DEF to a ABC reference. ABC have no references");
        abc = def;

        // Forceful call the garbage collector
        callGC();

        // Forceful call the garbage collector
        callGC();

        System.out.println("Detach reference from sampleClass1 object");
        def = null;

        // Forceful call the garbage collector
        callGC();
    }
}
