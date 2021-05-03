package datatypes.primitives.references;

import common.Lesson;
import datatypes.primitives.references.base.SimpleClass;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static datatypes.primitives.References.callGC;

public class SoftReferences implements Lesson {

    @Override
    public void start() {

        System.out.println("Soft Reference is a type of weak reference. Objects with soft reference will only be collected by GC when" +
                "\nJVM needs memory badly.");

        System.out.println("Create ABC object with strong reference...");
        byte[] abcBytes = new byte[9999];
        new Random().nextBytes(abcBytes);
        SimpleClass abc = new SimpleClass("ABC", abcBytes);

        ReferenceQueue<SimpleClass> referenceQueue = new ReferenceQueue<>();
        System.out.println("Create soft reference to an ABC object...");
        SoftReference<SimpleClass> softReference = new SoftReference<>(abc, referenceQueue);

        callGC();
        SimpleClass abc2 = softReference.get();

        System.out.println("Remove strong reference to ABC");
        abc = null;

        callGC();

        System.out.println("ABC object will not be collected by GC");
        softReference.get().display();

        System.out.println("This gonna throw OutOfMemoryException eventually. Before that ABC object will be collected by GC");
        List<byte[]> fillingList = new ArrayList<>();
        while (true) {
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (abc2 == null) {
                System.out.println("abc has been cleared");
                break;
            }
            byte[] array = new byte[1000];
            new Random().nextBytes(array);
            fillingList.add(array);
        }
    }

}
