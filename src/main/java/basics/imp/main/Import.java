package basics.imp.main;

import basics.imp.other.OtherClass;
import common.Lesson;

import static basics.imp.other.OtherClass.STATIC_FIELD;
import static basics.imp.other.OtherClass.staticPublicMethod;

/**
 * @author Paweł Kołczyk-Kasprzycki pawel.kolczyk.kasprzycki@gmail.com
 * <p>
 * Purpose of this class is to show how to import class and fields in order to use in our app
 */
public class Import implements Lesson {

    public void start() {
        OtherClass otherClass = new OtherClass();
        otherClass.publicMethod(); // Now we can use method

        SimilarClass similarClass = new SimilarClass();
        // We dont have to import this class because it is in the same package

        staticPublicMethod();

        System.out.println(STATIC_FIELD);

    }
}
