import java.util.*;

class Classroom {
    private String name;
    private List<String> students;
    private List<String> assignments;

    public Classroom(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getStudents() {
        return students;
    }


    public String addStudent(String studentId) {
        if (!students.contains(studentId)) {
            students.add(studentId);
            return "Student " + studentId + " has been enrolled in classroom " + name + ".";
        }
        return "Student " + studentId + " is already enrolled in classroom " + name + ".";
    }

    public String scheduleAssignment(String assignmentDetails) {
        assignments.add(assignmentDetails);
        return "Assignment for classroom " + name + " has been scheduled.";
    }

    @Override
    public String toString() {
        return "Classroom " + name + ": " + students.size() + " students, " + assignments.size() + " assignments";
    }

}
