package jsonModel.releaseGroups;

import java.util.List;

public class ReleaseGroups {

    private String name;
    private List<Releases> releases;

    public String getName() {
        return name;
    }

    public List<Releases> getReleases() {
        return releases;
    }
}
