package common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Tutorial {
    private final String title;
    private final Map<String, Lesson> lessons;

    public Tutorial(final NAME title, final LessonDefinition... lessons) {
        this.title = title.getName();
        this.lessons = new HashMap<>();
        Arrays.stream(lessons)
                .forEach(lessonDefinition -> this.lessons.put(lessonDefinition.getTitle(), lessonDefinition.getLesson()));
    }

    private void runLesson(final String lessonTitle) {
        lessons.get(lessonTitle).start();
    }

    public String getTitle() {
        return title;
    }

    public Map<String, Lesson> getLessons() {
        return lessons;
    }


}