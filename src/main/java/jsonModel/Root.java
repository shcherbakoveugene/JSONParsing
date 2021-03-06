package jsonModel;

import jsonModel.projects.Projects;
import jsonModel.releaseGroups.ReleaseGroups;

import java.util.List;

public class Root {

    private List<ReleaseGroups> releaseGroups;
    private List<Projects> projects;

    public List<ReleaseGroups> getReleaseGroups() {
        return releaseGroups;
    }

    public List<Projects> getProjects() {
        return projects;
    }
}
