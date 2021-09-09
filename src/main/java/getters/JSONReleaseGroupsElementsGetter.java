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

    private List<Releases> getReleases() {
        List<Releases> releases = new ArrayList<>();

        for (ReleaseGroups relGroup : gsonBuilderHelper.getRoot().getReleaseGroups()) {
            releases.addAll(relGroup.getReleases());
        }

        return releases;
    }

    public List<String> getReleasesNames() {
        List<String> names = new ArrayList<>();

        for (Releases release : getReleases()) {
            names.add(release.getName());
        }

        return names;
    }

    public List<Integer> getReleasesLength() {
        List<Integer> lengths = new ArrayList<>();

        for (Releases release : getReleases()) {
            lengths.add(release.getLength());
        }

        return lengths;
    }

    public List<Integer> getReleasesStartDateOffset() {
        List<Integer> lengths = new ArrayList<>();

        for (Releases release : getReleases()) {
            lengths.add(release.getLength());
        }

        return lengths;
    }

    private List<Sprints> getSprints(String releaseName) {
        List<Sprints> sprints = new ArrayList<>();

        for (Releases release : getReleases()) {
            if (releaseName.equals(release.getName())) {
                sprints.addAll(release.getSprints());
            }
        }

        return sprints;
    }

    public List<String> getSprintNames(String releaseName) {
        List<String> names = new ArrayList<>();

        for (Sprints sprint : getSprints(releaseName)) {
            names.add(sprint.getName());
        }

        return names;
    }

    public List<Integer> getSprintLength(String releaseName) {
        List<Integer> length = new ArrayList<>();

        for (Sprints sprint : getSprints(releaseName)) {
            length.add(sprint.getLength());
        }

        return length;
    }

    public List<Integer> getSprintStartDateOffset(String releaseName) {
        List<Integer> startDateOffset = new ArrayList<>();

        for (Sprints sprint : getSprints(releaseName)) {
            startDateOffset.add(sprint.getStartDateOffset());
        }

        return startDateOffset;
    }
}
