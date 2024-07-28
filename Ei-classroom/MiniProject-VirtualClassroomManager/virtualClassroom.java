import java.util.*;

public class virtualClassroom {
    public static void main(String[] args) {

        VirtualClassroomManager manager = new VirtualClassroomManager();
        String user_input = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------VIRTUAL CLASSROOM MAMAGER--------");

        System.out.println("Input Hints : ");
        System.out.println("1.add_classroom <class_name>\n2.list_classrooms\n3.remove_classroom <class_name>\n4.add_student <student_id> <class_name>\n5.list_students <class_name>\n6.schedule_assignment <class_name> <assignment_details>\n7.submit_assignment <student_id> <class_name> <assignment_details>\n8.exit");

        while (user_input.toLowerCase() != "exit" ) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine().trim();
            String[] command = input.split(" ", 4);

            if(user_input.toLowerCase() != "exit" )
            {
                if (command.length == 0) {
                    continue;
                }

                String action = command[0];

                switch (action) {
                    case "add_classroom":
                        if (command.length < 2) {
                            System.out.println("Usage: add_classroom <class_name>");
                        } else {
                            String className = command[1];
                            System.out.println(manager.addClassroom(className));
                        }
                        break;

                    case "list_classrooms":
                            System.out.println(manager.listClassrooms());
                            break;

                    case "remove_classroom":
                        if (command.length < 2) {
                            System.out.println("Usage: remove_classroom <class_name>");
                        } else {
                            String className = command[1];
                            System.out.println(manager.removeClassroom(className));
                        }
                        break;

                    case "add_student":
                        if (command.length < 3) {
                            System.out.println("Usage: add_student <student_id> <class_name>");
                        } else {
                            String studentId = command[1];
                            String className = command[2];
                            System.out.println(manager.addStudent(studentId, className));
                        }
                        break;

                    case "list_students":
                        if (command.length < 2) {
                            System.out.println("Usage: list_students <class_name>");
                        } else {
                            String className = command[1];
                            System.out.println(manager.listStudents(className));
                        }
                        break;

                    case "schedule_assignment":
                        if (command.length < 3) {
                            System.out.println("Usage: schedule_assignment <class_name> <assignment_details>");
                        } else {
                            String className = command[1];
                            String assignmentDetails = command[2];
                            System.out.println(manager.scheduleAssignment(className, assignmentDetails));
                        }
                        break;

                    case "submit_assignment":
                        if (command.length < 4) {
                            System.out.println("Usage: submit_assignment <student_id> <class_name> <assignment_details>");
                        } else {
                            String studentId = command[1];
                            String className = command[2];
                            String assignmentDetails = command[3];
                            System.out.println(manager.submitAssignment(studentId, className, assignmentDetails));
                        }
                        break;

                    case "exit":
                        scanner.close();
                        return;

                    default:
                        System.out.println("Unknown command. Available commands: add_classroom, list_classrooms, remove_classroom, add_student, list_students, schedule_assignment, submit_assignment, exit.");
                        break;
                }
            }
        }
    }
}
