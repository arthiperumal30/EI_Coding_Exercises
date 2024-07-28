public class ClassroomAdapter implements ClassroomManagementSystem {
    private OldClassroomSystem oldClassroomSystem;

    public ClassroomAdapter(OldClassroomSystem oldClassroomSystem) {
        this.oldClassroomSystem = oldClassroomSystem;
    }

    @Override
    public void addStudent(String student) {
        oldClassroomSystem.enrollStudent(student);
    }

    @Override
    public void removeStudent(String student) {
        oldClassroomSystem.disenrollStudent(student);
    }
}
