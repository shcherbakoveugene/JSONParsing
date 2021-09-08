import java.util.List;

public class Releases {

    private String name;
    private int length;
    private int startDateOffset;
    private List<Sprints> sprints;

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getStartDateOffset() {
        return startDateOffset;
    }

    public List<Sprints> getSprints() {
        return sprints;
    }
}
