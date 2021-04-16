package imp.main;

import imp.other.OtherClass;
// This is how we import specify class from a package
// We can also use wildcard * in order to import all class from this package `import imp.other.*`
// We cannot use class from other package if its not a 'public' class
// import imp.other.MoreOtherClass; is gonna cause this app failed when compile

import static imp.other.OtherClass.staticPublicMethod; // We can also import a method if its static.
import static imp.other.OtherClass.STATIC_FIELD; // The same if we want to import field

/**
 * @author Paweł Kołczyk-Kasprzycki pawel.kolczyk-kasprzycki@gmail.com
 * <p>
 * Purpose of this class is to show how to import class and fields in order to use in our app
 */
public class Import {

    public void run() {
        OtherClass otherClass = new OtherClass();
        otherClass.publicMethod(); // Now we can use method

        SimilarClass similarClass = new SimilarClass();
        // We dont have to import this class because it is in the same package

        staticPublicMethod();

        System.out.println(STATIC_FIELD);

    }
}
