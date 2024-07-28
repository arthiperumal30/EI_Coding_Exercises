public class UserFactory {
    public static User createUser(String type, String name) {
        if ("Teacher".equalsIgnoreCase(type)) {
            return new Teacher(name);
        } else if ("Student".equalsIgnoreCase(type)) {
            return new Student(name);
        }
        return null;
    }
}
