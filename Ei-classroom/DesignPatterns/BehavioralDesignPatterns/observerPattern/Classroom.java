import java.util.ArrayList;
import java.util.List;

public class Classroom extends Subject {
    private String name;
    private List<String> assignments = new ArrayList<>();

    public Classroom(String name) {
        this.name = name;
    }

    public void addAssignment(String assignment) {
        assignments.add(assignment);
        notifyObservers("New assignment added to " + name + ": " + assignment);
    }
}
