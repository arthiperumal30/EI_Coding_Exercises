import java.util.*;

class VirtualClassroomManager {
    private Map<String, Classroom> classrooms;

    public VirtualClassroomManager() {
        classrooms = new HashMap<>();
    }

    public String addClassroom(String className) {
        if (classrooms.containsKey(className)) {
            return "Classroom " + className + " already exists.";
        }
        classrooms.put(className, new Classroom(className));
        return "Classroom " + className + " has been created.";
    }

    public String listClassrooms() {
        if (classrooms.isEmpty()) {
            return "No classrooms available.";
        }
        StringBuilder sb = new StringBuilder("Classrooms:\n");
        for (String className : classrooms.keySet()) {
            sb.append(className).append("\n");
        }
        return sb.toString().trim();
    }

    public String removeClassroom(String className) {
        if (classrooms.containsKey(className)) {
            classrooms.remove(className);
            return "Classroom " + className + " has been removed.";
        }
        return "Classroom " + className + " does not exist.";
    }

    public String addStudent(String studentId, String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            return classroom.addStudent(studentId);
        }
        return "Classroom " + className + " does not exist.";
    }
    
    public String listStudents(String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            return "Students in classroom " + className + ": " + classroom.getStudents();
        }
        return "Classroom " + className + " does not exist.";
    }

    public String scheduleAssignment(String className, String assignmentDetails) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            return classroom.scheduleAssignment(assignmentDetails);
        }
        return "Classroom " + className + " does not exist.";
    }

   public String submitAssignment(String studentId, String className, String assignmentDetails) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            if (classroom.getStudents().contains(studentId)) {
                // Assume assignment submission simply logs the action for now
                return "Assignment submitted by Student " + studentId + " in classroom " + className + ".";
            }
            return "Student " + studentId + " is not enrolled in classroom " + className + ".";
        }
        return "Classroom " + className + " does not exist.";
    }

}
