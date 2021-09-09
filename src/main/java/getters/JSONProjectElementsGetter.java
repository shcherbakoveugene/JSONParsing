package getters;

import builder.GsonBuilderHelper;
import jsonModel.projects.*;

import java.util.ArrayList;
import java.util.List;

public class JSONProjectElementsGetter {

    private GsonBuilderHelper gsonBuilderHelper;

    public JSONProjectElementsGetter() {
        gsonBuilderHelper = new GsonBuilderHelper();
    }

    public List<String> getProjectNames() {
        List<String> names = new ArrayList<>();

        for (Projects project : gsonBuilderHelper.getRoot().getProjects()) {
            names.add(project.getName());
        }

        return names;
    }

    public List<String> getProjectReleaseGroup() {
        List<String> releaseGroups = new ArrayList<>();

        for (Projects project : gsonBuilderHelper.getRoot().getProjects()) {
            releaseGroups.add(project.getReleaseGroup());
        }

        return releaseGroups;
    }

    private List<ReportFiles> getReportFiles() {
        List<ReportFiles> reportFiles = new ArrayList<>();

        for (Projects project : gsonBuilderHelper.getRoot().getProjects()) {
            reportFiles.addAll(project.getReportFiles());
        }

        return reportFiles;
    }

    public List<String> getReportFilesFileLocation() {
        List<String> fileLocations = new ArrayList<>();

        for (ReportFiles reportFile : getReportFiles()) {
            fileLocations.add(reportFile.getFileLocation());
        }

        return fileLocations;
    }

    public List<Integer> getReportFilesStartDateOffset() {
        List<Integer> startDateOffsets = new ArrayList<>();

        for (ReportFiles reportFile : getReportFiles()) {
            startDateOffsets.add(reportFile.getStartDateOffset());
        }

        return startDateOffsets;
    }

//    public List<ChildProjects> getChildProjects() {
//        List<ChildProjects> childProjects = new ArrayList<>();
//
//        for (Projects project : gsonBuilderHelper.getRoot().getProjects()) {
//            childProjects.addAll(project.getChildProjects());
//        }
//
//        return childProjects;
//    }
//
//    public List<ChildProjects> getCP() {
//        List<ChildProjects> childProjects = getChildProjects();
//
//        for (ChildProjects project : childProjects) {
//            childProjects.addAll(project.getChildProjects());
//        }
//
//        return childProjects;
//    }

    private List<RootCauses> getRootCauses() {
        List<RootCauses> rootCauses = new ArrayList<>();

        for (Projects project : gsonBuilderHelper.getRoot().getProjects()) {
            rootCauses.addAll(project.getRootCauses());
        }

        return rootCauses;
    }

    public List<String> getRootCauseNames() {
        List<String> names = new ArrayList<>();

        for (RootCauses rootCause : getRootCauses()) {
            names.add(rootCause.getName());
        }

        return names;
    }

    public List<String> getRootCauseDescriptions() {
        List<String> descriptions = new ArrayList<>();

        for (RootCauses rootCause : getRootCauses()) {
            descriptions.add(rootCause.getDescription());
        }

        return descriptions;
    }

    private List<Epics> getEpics() {
        List<Epics> epics = new ArrayList<>();

        for (Projects project : gsonBuilderHelper.getRoot().getProjects()) {
            epics.addAll(project.getEpics());
        }

        return epics;
    }

    public List<String> getEpicNames() {
        List<String> names = new ArrayList<>();

        for (Epics epic : getEpics()) {
            names.add(epic.getName());
        }

        return names;
    }

    public List<String> getEpicDescription() {
        List<String> descriptions = new ArrayList<>();

        for (Epics epic : getEpics()) {
            descriptions.add(epic.getDescription());
        }

        return descriptions;
    }

    public List<Integer> getEpicsSizes() {
        List<Integer> sSizeses = new ArrayList<>();

        for (Epics epic : getEpics()) {
            sSizeses.add(epic.getsSizes());
        }

        return sSizeses;
    }

    public List<Integer> getEpicStartDateOffset() {
        List<Integer> startDateOffset = new ArrayList<>();

        for (Epics epic : getEpics()) {
            startDateOffset.add(epic.getStartDateOffset());
        }

        return startDateOffset;
    }

    public List<String> getEpicReleases(String epicName) {
        List<String> releases = new ArrayList<>();

        for (Epics epic : getEpics()) {
            if (epicName.equals(epic.getName())) {
                releases.addAll(epic.getReleases());
            }
        }

        return releases;
    }
}
