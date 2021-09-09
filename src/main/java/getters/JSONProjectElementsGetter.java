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

    private List<ReportFiles> getReportFiles(String projectName) {
        List<ReportFiles> reportFiles = new ArrayList<>();

        for (Projects project : gsonBuilderHelper.getRoot().getProjects()) {
            if (projectName.equals(project.getName())) {
                reportFiles.addAll(project.getReportFiles());
            }
        }

        return reportFiles;
    }

    public List<String> getReportFilesFileLocation(String projectName) {
        List<String> fileLocations = new ArrayList<>();

        for (ReportFiles reportFile : getReportFiles(projectName)) {
            fileLocations.add(reportFile.getFileLocation());
        }

        return fileLocations;
    }

    public List<Integer> getReportFilesStartDateOffset(String projectName) {
        List<Integer> startDateOffsets = new ArrayList<>();

        for (ReportFiles reportFile : getReportFiles(projectName)) {
            startDateOffsets.add(reportFile.getStartDateOffset());
        }

        return startDateOffsets;
    }

    private List<ChildProjects> getChildProjects(String projectName) {
        List<ChildProjects> childProjects = new ArrayList<>();

        for (Projects project : gsonBuilderHelper.getRoot().getProjects()) {
            if (projectName.equals(project.getName())) {
                childProjects.addAll(project.getChildProjects());
            }
        }

        return childProjects;
    }

    public List<String> getChildProjectName(String projectName) {
        List<String> names = new ArrayList<>();

        for (ChildProjects childProject: getChildProjects(projectName)) {
            names.add(childProject.getName());
        }

        return names;
    }

    public List<String> getChildProjectReleaseGroup(String projectName) {
        List<String> releaseGroups = new ArrayList<>();

        for (ChildProjects childProject: getChildProjects(projectName)) {
            releaseGroups.add(childProject.getReleaseGroup());
        }

        return releaseGroups;
    }

    private List<ReportFiles> getChildProjectReportFiles(String projectName, String childProjectName) {
        List<ReportFiles> reportFiles = new ArrayList<>();

        for (ChildProjects childProject: getChildProjects(projectName)) {
            if (childProjectName.equals(childProject.getName())) {
                reportFiles.addAll(childProject.getReportFiles());
            }
        }

        return reportFiles;
    }

    public List<String> getChildProjectReportFilesFileLocation(String projectName, String childProjectName) {
        List<String> fileLocations = new ArrayList<>();

        for (ReportFiles reportFile: getChildProjectReportFiles(projectName, childProjectName)) {
            fileLocations.add(reportFile.getFileLocation());
        }

        return fileLocations;
    }

    public List<Integer> getChildProjectReportFilesStartDateOffset(String projectName, String childProjectName) {
        List<Integer> startDateOffsets = new ArrayList<>();

        for (ReportFiles reportFile: getChildProjectReportFiles(projectName, childProjectName)) {
            startDateOffsets.add(reportFile.getStartDateOffset());
        }

        return startDateOffsets;
    }

    public List<ChildProjects> getInnerChildProjects(String projectName) {
        List<ChildProjects> innerChildProjects = new ArrayList<>();

        for (ChildProjects innerChild: getChildProjects(projectName)) {
            innerChildProjects.addAll(innerChild.getChildProjects());
        }

        return innerChildProjects;
    }

    private List<RootCauses> getRootCauses(String projectName) {
        List<RootCauses> rootCauses = new ArrayList<>();

        for (Projects project : gsonBuilderHelper.getRoot().getProjects()) {
            if (projectName.equals(project.getName())) {
                rootCauses.addAll(project.getRootCauses());
            }
        }

        return rootCauses;
    }

    public List<String> getRootCauseNames(String projectName) {
        List<String> names = new ArrayList<>();

        for (RootCauses rootCause : getRootCauses(projectName)) {
            names.add(rootCause.getName());
        }

        return names;
    }

    public List<String> getRootCauseDescriptions(String projectName) {
        List<String> descriptions = new ArrayList<>();

        for (RootCauses rootCause : getRootCauses(projectName)) {
            descriptions.add(rootCause.getDescription());
        }

        return descriptions;
    }

    private List<Epics> getEpics(String projectName) {
        List<Epics> epics = new ArrayList<>();

        for (Projects project : gsonBuilderHelper.getRoot().getProjects()) {
            if (projectName.equals(project.getName())) {
                epics.addAll(project.getEpics());
            }
        }

        return epics;
    }

    public List<String> getEpicNames(String projectName) {
        List<String> names = new ArrayList<>();

        for (Epics epic : getEpics(projectName)) {
            names.add(epic.getName());
        }

        return names;
    }

    public List<String> getEpicDescription(String projectName) {
        List<String> descriptions = new ArrayList<>();

        for (Epics epic : getEpics(projectName)) {
            descriptions.add(epic.getDescription());
        }

        return descriptions;
    }

    public List<Integer> getEpicsSizes(String projectName) {
        List<Integer> sSizeses = new ArrayList<>();

        for (Epics epic : getEpics(projectName)) {
            sSizeses.add(epic.getsSizes());
        }

        return sSizeses;
    }

    public List<Integer> getEpicStartDateOffset(String projectName) {
        List<Integer> startDateOffset = new ArrayList<>();

        for (Epics epic : getEpics(projectName)) {
            startDateOffset.add(epic.getStartDateOffset());
        }

        return startDateOffset;
    }

    public List<String> getEpicReleases(String epicName, String projectName) {
        List<String> releases = new ArrayList<>();

        for (Epics epic : getEpics(projectName)) {
            if (epicName.equals(epic.getName())) {
                releases.addAll(epic.getReleases());
            }
        }

        return releases;
    }
}
