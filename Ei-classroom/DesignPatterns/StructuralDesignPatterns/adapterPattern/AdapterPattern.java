public class AdapterPattern {
    public static void main(String[] args) {
        OldClassroomSystem oldSystem = new OldClassroomSystem();
        ClassroomManagementSystem adapter = new ClassroomAdapter(oldSystem);

        adapter.addStudent("John Doe");
        adapter.removeStudent("John Doe");
    }
}
