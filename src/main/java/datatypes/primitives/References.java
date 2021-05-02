package datatypes.primitives;

import common.Lesson;
import datatypes.primitives.references.StrongReferences;

public class References implements Lesson {

    @Override
    public void start() {

        new StrongReferences().run();
    }
}
