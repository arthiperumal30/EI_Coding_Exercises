public class Student extends User {
    public Student(String name) {
        super(name);
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Student.");
    }
}
