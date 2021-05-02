package datatypes.primitives;

import common.Lesson;
import datatypes.primitives.references.PhantomReferences;
import datatypes.primitives.references.SoftReferences;
import datatypes.primitives.references.StrongReferences;
import datatypes.primitives.references.WeakReferences;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class References implements Lesson {

    private static final String REFERENCE_LESSONS =
            "1. Strong/final references\n" +
                    "2.Weak references\n" +
                    "3.Soft references\n" +
                    "4.Phantom references\n" +
                    "5.Exit";

    private static final Map<Integer, Lesson> referenceLessons = new HashMap<>();

    static {
        referenceLessons.put(1, new StrongReferences());
        referenceLessons.put(2, new WeakReferences());
        referenceLessons.put(3, new SoftReferences());
        referenceLessons.put(4, new PhantomReferences());
    }

    @Override
    public void start() {

        System.out.println(REFERENCE_LESSONS);
        Scanner referenceScanner = new Scanner(System.in);

        final int referenceLesson = referenceScanner.nextInt();

        if (referenceLesson == 5) {
            return;
        }
        Lesson lesson = referenceLessons.get(referenceLesson);

        if (lesson == null) {
            System.out.println("Lesson not found");
            System.out.println(REFERENCE_LESSONS);
            return;
        }

        lesson.start();

    }

    public static void callGC() {
        System.out.println("\n>>> Calling GC...");
        System.gc();
        try {
            System.out.println(">>> Wait 2 sec");
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(">>> Calling GC DONE\n");

    }
}
