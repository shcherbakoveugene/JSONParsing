package jsonModel.projects;

import java.util.List;

public class Epics {

    private String name;
    private String description;
    private int sSizes;
    private int startDateOffset;
    private List<String> releases;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getsSizes() {
        return sSizes;
    }

    public int getStartDateOffset() {
        return startDateOffset;
    }

    public List<String> getReleases() {
        return releases;
    }
}
