public abstract class ClassroomDecorator implements Classroom {
    protected Classroom decoratedClassroom;

    public ClassroomDecorator(Classroom decoratedClassroom) {
        this.decoratedClassroom = decoratedClassroom;
    }

    public String getDescription() {
        return decoratedClassroom.getDescription();
    }
}
