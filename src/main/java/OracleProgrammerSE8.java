import basics.executable.Executable;
import basics.features.Features;
import basics.imp.main.Import;
import basics.scope.Scope;
import common.Lesson;
import common.LessonDefinition;
import common.NAME;
import common.Tutorial;
import datatypes.variables.Casting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static common.NAME.BASICS;
import static common.NAME.DATA_TYPES;
import static common.NAME.getByName;

public class OracleProgrammerSE8 {


    public static void main(String... args) {
        new Starter().run();
    }

    private static class Starter {
        private final Map<NAME, Tutorial> tutorials = new HashMap<>();

        private static final String WELCOME_MESSAGE = "Welcome to a Oracle Programmer SE8 I tutorial";
        private static final String CHOOSE_TUTORIAL_MESSAGE = "Existing tutorials: " + NAME.valuesNames();
        private static final String TUTORIAL_NOT_FOUND_MESSAGE = "Tutorial not found";
        private static final String CHOOSE_LESSON_MESSAGE = "Available lessons: %s";
        private static final String LESSON_NOT_FOUND_MESSAGE = "Lesson not found";

        private static final String EXIT = "exit";


        Starter() {
            registerTutorials(
                    new Tutorial(BASICS,
                            new LessonDefinition("scope", new Scope()),
                            new LessonDefinition("features", new Features()),
                            new LessonDefinition("import", new Import()),
                            new LessonDefinition("executable", new Executable())),
                    new Tutorial(DATA_TYPES,
                            new LessonDefinition("casting", new Casting()))
            );
        }

        private void run() {

            System.out.println(WELCOME_MESSAGE);
            System.out.println(CHOOSE_TUTORIAL_MESSAGE);

            final Scanner scanner = new Scanner(System.in);

            while (scanner.hasNext()) {
                final String input = scanner.next();
                if (input.equals(EXIT)) {
                    break;
                }

                Tutorial tutorial = tutorials.get(getByName(input));
                if (tutorial == null) {
                    System.out.println(TUTORIAL_NOT_FOUND_MESSAGE);
                    System.out.println(CHOOSE_TUTORIAL_MESSAGE);
                    continue;
                }
                System.out.printf((CHOOSE_LESSON_MESSAGE) + "%n", tutorial.getLessons().keySet());

                final Scanner lessonScanner = new Scanner(System.in);
                while (lessonScanner.hasNext()) {
                    final String lessonTitle = lessonScanner.next();
                    if (lessonTitle.equals(EXIT)) {
                        break;
                    }
                    Lesson lesson = tutorial.getLessons().get(lessonTitle);
                    if (lesson == null) {
                        System.out.println(LESSON_NOT_FOUND_MESSAGE);
                        System.out.printf((CHOOSE_LESSON_MESSAGE) + "%n", tutorial.getLessons().keySet());
                        continue;
                    }

                    System.out.println("START LESSON [" + lessonTitle + "]\n");
                    lesson.start();
                    System.out.println("\nEND LESSON [" + lessonTitle + "]\n");

                    System.out.printf((CHOOSE_LESSON_MESSAGE) + "%n", tutorial.getLessons().keySet());

                }

                System.out.println(CHOOSE_TUTORIAL_MESSAGE);

            }
        }

        private void registerTutorials(final Tutorial... tutorials) {
            Arrays.stream(tutorials).forEach(tutorial -> this.tutorials.put(getByName(tutorial.getTitle()), tutorial));
        }
    }


}