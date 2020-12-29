package day6;

public class Teacher {

    private String name;
    private String lesson;

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public void evaluate(Student student) {
        int grade = 2 + (int) (Math.random() * 4);
        String grade2 = null;
        switch (grade) {
            case 2:
                grade2 = "неудовлетворительно";
                break;
            case 3:
                grade2 = "удовлетворительно";
                break;
            case 4:
                grade2 = "хорошо";
                break;
            case 5:
                grade2 = "отлично";
                break;
        }

        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +
                " по предмету " + lesson + " на оценку " + grade2);

    }
}
