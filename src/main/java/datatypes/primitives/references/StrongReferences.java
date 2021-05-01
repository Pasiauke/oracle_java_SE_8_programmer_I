package datatypes.primitives.references;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.util.UUID.randomUUID;

public class StrongReferences {

    private static final Map<String, String> cache = new HashMap<>();

    public void run() {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            final String next = scanner.next();
            if ("fill".equals(next)) {
                for (int i = 0; i < 1000000; i++) {
                    cache.put(randomUUID().toString(), randomUUID().toString());
                }
            } else if ("invalidate".equals(next)) {
                cache.clear();
            } else if ("gc".equals(next)) {
                System.gc();
            } else if ("exit".equals(next)) {
                System.exit(0);
            } else {
                System.out.println("unknown");
            }
        }
    }
}
