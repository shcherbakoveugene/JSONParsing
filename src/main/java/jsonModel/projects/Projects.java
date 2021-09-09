package jsonModel.projects;

import java.util.List;

public class Projects {

    private String name;
    private String releaseGroup;
    private List<ReportFiles> reportFilesList;
    private List<ChildProjects> childProjectsList;
    private List<RootCauses> rootCausesList;
    private List<Epics> epicsList;

    public String getName() {
        return name;
    }

    public String getReleaseGroup() {
        return releaseGroup;
    }

    public List<ReportFiles> getReportFilesList() {
        return reportFilesList;
    }

    public List<ChildProjects> getChildProjectsList() {
        return childProjectsList;
    }

    public List<RootCauses> getRootCausesList() {
        return rootCausesList;
    }

    public List<Epics> getEpicsList() {
        return epicsList;
    }
}
