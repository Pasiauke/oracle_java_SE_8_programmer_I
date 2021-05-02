package datatypes.primitives.references;

import common.Lesson;

import java.lang.ref.WeakReference;

import static datatypes.primitives.References.callGC;

public class WeakReferences implements Lesson {

    @Override
    public void start() {

        // A weakly referenced object is cleared by the Garbage Collector when it's weakly reachable.
        System.out.println("Create WEAK object with strong reference");
        SampleClass sampleClass = new SampleClass("WEAK");

        // Create weak reference by
        System.out.println("Create Weak Reference to a WEAK object");
        WeakReference<SampleClass> sampleClassWeakReference = new WeakReference<>(sampleClass);
        callGC();
        WeakReference<SampleClass> weakRef = new WeakReference<>(new SampleClass());

        System.out.println("Retrieve object with weak reference");
        SampleClass ref2 = sampleClassWeakReference.get();

        System.out.println("sampleClass: " + sampleClass + " ref2: " + ref2);
        sampleClassWeakReference.clear();
        sampleClass = null;
        System.out.println("sampleClass: " + sampleClass + " ref2: " + ref2);

        callGC();
        ref2.display();

        ref2 = null;
        System.out.println("sampleClass: " + sampleClass + " ref2: " + ref2);

        callGC();


    }
}
