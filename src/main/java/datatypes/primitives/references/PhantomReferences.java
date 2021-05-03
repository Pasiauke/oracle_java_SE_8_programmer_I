package datatypes.primitives.references;

import common.Lesson;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

import static datatypes.primitives.References.callGC;

public class PhantomReferences implements Lesson {
    @Override
    public void start() {

        System.out.println("PhantomReference is special type of reference. It cannot return a referer and is used to handle the object finalization." +
                "\nIn previous types GC call finalize() method from the SimpleClass. In PhantomReference we can specify the finalization methon" +
                "\nwithout modifying the class we want to refer.");

        System.out.println("\nCreate new Object with strong reference...");
        Object object = new Object();

        System.out.println("Create referenceQueue...");
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();

        System.out.println("Create PhantomReference...");
        PhantomReference<Object> phantomReference = new ObjectFinalizer(object, referenceQueue);

        System.out.println("Remove strong reference from object");
        object = null;

        callGC();

        System.out.println("Is reference enqueued? " + phantomReference.isEnqueued());

        System.out.println("Poll from referenceQueue...");
        Reference<?> referenceFromQueue;
        while ((referenceFromQueue = referenceQueue.poll()) != null) {
            System.out.println("Call finalizeIt() method from PhantomReference...");
            ((ObjectFinalizer) referenceFromQueue).finalizeIt();
            referenceFromQueue.clear();
        }
    }

    private static class ObjectFinalizer extends PhantomReference<Object> {

        public ObjectFinalizer(Object referent, ReferenceQueue<? super Object> q) {
            super(referent, q);
        }

        public void finalizeIt() {
            System.out.println("=== Clearing...");
        }
    }
}
