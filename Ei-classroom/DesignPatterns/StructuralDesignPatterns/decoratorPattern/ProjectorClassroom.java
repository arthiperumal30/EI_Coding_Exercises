public class ProjectorClassroom extends ClassroomDecorator {
    public ProjectorClassroom(Classroom decoratedClassroom) {
        super(decoratedClassroom);
    }

    @Override
    public String getDescription() {
        return decoratedClassroom.getDescription() + ", with Projector";
    }
}
