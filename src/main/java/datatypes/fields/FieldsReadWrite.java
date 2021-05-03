package datatypes.fields;

import common.Lesson;

public class FieldsReadWrite implements Lesson {

    @Override
    public void start() {

        System.out.println("In this lesson we are gonna explain how to write and read to object fields");

        System.out.println("Create dummy class...");
        DummyClass dummyClass = new DummyClass();

        System.out.println("We can read and write directly when fields are public");

        System.out.println("Write to public field... ");
        dummyClass.publicField = 20;

        System.out.println("Read from public field... " + dummyClass.publicField);

        System.out.println("\nIf field are private or have other access modificator that prevents from direct access" +
                "\nyou have to use getters and setters method");


        System.out.println("Set private field via setter method...");
        dummyClass.setPrivateField(30);
        System.out.println("Read from field using getter method... " + dummyClass.getPrivateField());

    }
}
