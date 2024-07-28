public class Teacher extends User {
    public Teacher(String name) {
        super(name);
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Teacher.");
    }
}
