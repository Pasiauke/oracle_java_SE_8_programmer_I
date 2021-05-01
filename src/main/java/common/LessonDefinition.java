package common;

public class LessonDefinition {
    private final String title;
    private final Lesson lesson;

    public LessonDefinition(final String title, final Lesson lesson) {
        this.title = title;
        this.lesson = lesson;
    }

    public String getTitle() {
        return title;
    }

    public Lesson getLesson() {
        return lesson;
    }
}