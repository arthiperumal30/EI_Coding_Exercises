public class SmartBoardClassroom extends ClassroomDecorator {
    public SmartBoardClassroom(Classroom decoratedClassroom) {
        super(decoratedClassroom);
    }

    @Override
    public String getDescription() {
        return decoratedClassroom.getDescription() + ", with Smart Board";
    }
}
