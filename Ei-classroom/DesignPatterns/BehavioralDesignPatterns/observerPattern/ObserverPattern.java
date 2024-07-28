public class ObserverPattern {
    public static void main(String[] args) {
        Classroom classroom = new Classroom("Math");

        Teacher teacher = new Teacher("Mr. Smith");
        Student student1 = new Student("John Doe");
        Student student2 = new Student("Jane Doe");

        classroom.addObserver(teacher);
        classroom.addObserver(student1);
        classroom.addObserver(student2);

        classroom.addAssignment("Assignment 1");
        classroom.addAssignment("Assignment 2");
    }
}
