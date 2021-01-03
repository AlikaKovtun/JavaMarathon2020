package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student student = new Student("George", "Second");
        Teacher teacher = new Teacher("Ms Black", "Literature");

        System.out.println(student.getGroup());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();


    }
}
