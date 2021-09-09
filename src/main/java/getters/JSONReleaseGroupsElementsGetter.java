package getters;

import builder.GsonBuilderHelper;
import jsonModel.releaseGroups.ReleaseGroups;
import jsonModel.releaseGroups.Releases;
import jsonModel.releaseGroups.Sprints;

import java.util.ArrayList;
import java.util.List;

public class JSONReleaseGroupsElementsGetter {

    private GsonBuilderHelper gsonBuilderHelper;

    public JSONReleaseGroupsElementsGetter() {
        gsonBuilderHelper = new GsonBuilderHelper();
    }

    public List<String> getReleaseGroupsNames() {
        List<String> names = new ArrayList<>();

        for (ReleaseGroups relGroup : gsonBuilderHelper.getRoot().getReleaseGroups()) {
            names.add(relGroup.getName());
        }

        return names;
    }

    private List<Releases> getReleases(String releaseGroupName) {
        List<Releases> releases = new ArrayList<>();

        for (ReleaseGroups relGroup : gsonBuilderHelper.getRoot().getReleaseGroups()) {
            if (releaseGroupName.equals(relGroup.getName())) {
                releases.addAll(relGroup.getReleases());
            }
        }

        return releases;
    }

    public List<String> getReleasesNames(String releaseGroupName) {
        List<String> names = new ArrayList<>();

        for (Releases release : getReleases(releaseGroupName)) {
            names.add(release.getName());
        }

        return names;
    }

    public List<Integer> getReleasesLength(String releaseGroupName) {
        List<Integer> lengths = new ArrayList<>();

        for (Releases release : getReleases(releaseGroupName)) {
            lengths.add(release.getLength());
        }

        return lengths;
    }

    public List<Integer> getReleasesStartDateOffset(String releaseGroupName) {
        List<Integer> lengths = new ArrayList<>();

        for (Releases release : getReleases(releaseGroupName)) {
            lengths.add(release.getLength());
        }

        return lengths;
    }

    private List<Sprints> getSprints(String releaseName, String releaseGroupName) {
        List<Sprints> sprints = new ArrayList<>();

        for (Releases release : getReleases(releaseGroupName)) {
            if (releaseName.equals(release.getName())) {
                sprints.addAll(release.getSprints());
            }
        }

        return sprints;
    }

    public List<String> getSprintNames(String releaseName, String releaseGroupName) {
        List<String> names = new ArrayList<>();

        for (Sprints sprint : getSprints(releaseName, releaseGroupName)) {
            names.add(sprint.getName());
        }

        return names;
    }

    public List<Integer> getSprintLength(String releaseName, String releaseGroupName) {
        List<Integer> length = new ArrayList<>();

        for (Sprints sprint : getSprints(releaseName, releaseGroupName)) {
            length.add(sprint.getLength());
        }

        return length;
    }

    public List<Integer> getSprintStartDateOffset(String releaseName, String releaseGroupName) {
        List<Integer> startDateOffset = new ArrayList<>();

        for (Sprints sprint : getSprints(releaseName, releaseGroupName)) {
            startDateOffset.add(sprint.getStartDateOffset());
        }

        return startDateOffset;
    }
}
