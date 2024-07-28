public class FactoryPattern {
    public static void main(String[] args) {
        User teacher = UserFactory.createUser("Teacher", "Mr. Smith");
        User student = UserFactory.createUser("Student", "John Doe");

        teacher.displayRole();
        student.displayRole();
    }
}
