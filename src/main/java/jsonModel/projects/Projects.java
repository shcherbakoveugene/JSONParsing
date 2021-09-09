package jsonModel.projects;

import java.util.List;

public class Projects {

    private String name;
    private String releaseGroup;
    private List<ReportFiles> reportFiles;
    private List<ChildProjects> childProjects;
    private List<RootCauses> rootCauses;
    private List<Epics> epics;

    public String getName() {
        return name;
    }

    public String getReleaseGroup() {
        return releaseGroup;
    }

    public List<ReportFiles> getReportFiles() {
        return reportFiles;
    }

    public List<ChildProjects> getChildProjects() {
        return childProjects;
    }

    public List<RootCauses> getRootCauses() {
        return rootCauses;
    }

    public List<Epics> getEpics() {
        return epics;
    }
}
