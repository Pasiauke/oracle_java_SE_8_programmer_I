package datatypes.primitives.references;

import common.Lesson;
import datatypes.primitives.references.base.MapKey;
import datatypes.primitives.references.base.MapValue;
import datatypes.primitives.references.base.SimpleClass;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.WeakHashMap;

import static datatypes.primitives.References.callGC;

public class WeakReferences implements Lesson {

    @Override
    public void start() {
        // Description from Baeldung. It must be changed in the future for something more explanatory
        System.out.println("A weakly referenced object is cleared by the Garbage Collector when it's weakly reachable.\n" +
                "\n" +
                "Weak reachability means that an object has neither strong nor soft references pointing to it. The object can be reached only by traversing a weak reference." +
                "\n" +
                "First off, the Garbage Collector clears a weak reference, so the referent is no longer accessible. Then the reference is placed in a reference queue (if any associated exists) where we can obtain it from.\n" +
                "\n" +
                "At the same time, formerly weakly-reachable objects are going to be finalized.");
        System.out.println("1 - Simple WeakReference\n2 - WeakHashMap\n3 - WeakReference with ReferenceQueue");
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                part1();
                break;
            case 2:
                part2();
                break;
            case 3:
                part3();
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    private void part1() {
        System.out.println("=== PART I - WeakReference for an object ===");
        System.out.println("Create ABC object with strong reference");
        SimpleClass abc = new SimpleClass("ABC");

        System.out.println("Create Weak Reference to a ABC object");
        WeakReference<SimpleClass> abcWeakReference = new WeakReference<>(abc);

        System.out.println("Retrieve ABC object from weak reference");
        SimpleClass abcFromWeakReference = abcWeakReference.get();

        System.out.println("abc: " + abc + " abcWeakReference: " + abcWeakReference + " abcFromWeakReference: " + abcFromWeakReference);

        callGC();

        System.out.println("Clear abcWeakReference");
        abcWeakReference.clear();
        callGC();
        System.out.println("abc: " + abc + " abcWeakReference: " + abcWeakReference + " abcFromWeakReference: " + abcFromWeakReference);

        System.out.println("Assign null reference to abc");
        abc = null;
        callGC();
        System.out.println("abc: " + abc + " abcWeakReference: " + abcWeakReference + " abcFromWeakReference: " + abcFromWeakReference);

        abcFromWeakReference.display();

        System.out.println("Assign null reference to abcFromWeakReference");
        abcFromWeakReference = null;
        callGC();
        System.out.println("abc: " + abc + " abcWeakReference: " + abcWeakReference + " abcFromWeakReference: " + abcFromWeakReference);

        System.out.println("Assign null reference to abcWeakReference");
        abcWeakReference = null;
        callGC();

        System.out.println("abc: " + abc + " abcWeakReference: " + abcWeakReference + " abcFromWeakReference: " + abcFromWeakReference);

    }

    private void part2() {
        System.out.println("\n\n=== PART II - WeakReference with WeakHashMap ===");

        MapKey simpleKey1 = new MapKey("SK1");
        MapKey simpleKey2 = new MapKey("SK2");

        MapValue simpleValue1 = new MapValue();
        MapValue simpleValue2 = new MapValue();

        MapKey weakKey1 = new MapKey("WK1");
        MapKey weakKey2 = new MapKey("WK2");

        MapValue weakValue1 = new MapValue();
        MapValue weakValue2 = new MapValue();

        System.out.println("Preparing maps...");
        HashMap<MapKey, MapValue> simpleMap = new HashMap<>();
        simpleMap.put(simpleKey1, simpleValue1);
        simpleMap.put(simpleKey2, simpleValue2);

        WeakHashMap<MapKey, MapValue> weakMap = new WeakHashMap<>();
        weakMap.put(weakKey1, weakValue1);
        weakMap.put(weakKey2, weakValue2);

        printMap("Simple map:", simpleMap);
        printMap("Weak map:", weakMap);

        System.out.println("\nRemove simple key...");
        simpleKey1 = null;
        System.out.println("Remove weak key...");
        weakKey1 = null;

        callGC();

        printMap("Simple map:", simpleMap);
        printMap("Weak map:", weakMap);

    }

    private void part3() {
        try {

            System.out.println("\n\n=== PART III - WeakReference with ReferenceQueue ===");
            System.out.println("\n ReferenceQueues can only be used to notify our code about the " +
                    "loss of memory objects referred to by these non-strong references.\n");
            System.out.println("Create ABC object with strong reference...");

            SimpleClass abc = new SimpleClass("ABC");

            System.out.println("Create ReferenceQueue...");
            ReferenceQueue<SimpleClass> referenceQueue = new ReferenceQueue<>();

            System.out.println("Create weak reference to ABC...");
            WeakReference<SimpleClass> weakReference = new WeakReference<>(abc, referenceQueue);
            System.out.println("Any weak references? " + (referenceQueue.poll() != null));
            callGC();

            System.out.println("Remove strong reference to ABC...");
            abc = null;
            callGC();

            System.out.println("Any weak references was removed? " + (referenceQueue.remove() != null));
            System.out.println("Does the weak reference still hold the heap object ? " + (weakReference.get() != null));
            System.out.println("Is the weak reference added to the ReferenceQ  ? " + (weakReference.isEnqueued()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void printMap(final String mapTitle, final Map<MapKey, MapValue> map) {
        System.out.println(mapTitle);
        map.forEach((k, v) -> System.out.println(k + ", " + v));
    }
}
