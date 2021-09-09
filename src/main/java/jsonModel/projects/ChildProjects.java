package jsonModel.projects;

import java.util.List;

public class ChildProjects {

    private String name;
    private String releaseGroup;
    private List<ReportFiles> reportFiles;
    private List<ChildProjects> childProjects;

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
}
