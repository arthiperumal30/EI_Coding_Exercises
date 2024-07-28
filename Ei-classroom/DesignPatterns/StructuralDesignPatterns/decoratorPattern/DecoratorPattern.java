public class DecoratorPattern {
    public static void main(String[] args) {
        Classroom classroom = new BasicClassroom();
        System.out.println("Classroom: " + classroom.getDescription());

        Classroom projectorClassroom = new ProjectorClassroom(new BasicClassroom());
        System.out.println("Classroom: " + projectorClassroom.getDescription());

        Classroom smartBoardClassroom = new SmartBoardClassroom(new BasicClassroom());
        System.out.println("Classroom: " + smartBoardClassroom.getDescription());

        Classroom fullFeaturedClassroom = new SmartBoardClassroom(new ProjectorClassroom(new BasicClassroom()));
        System.out.println("Classroom: " + fullFeaturedClassroom.getDescription());
    }
}

