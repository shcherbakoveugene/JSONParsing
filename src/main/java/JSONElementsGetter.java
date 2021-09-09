import java.util.ArrayList;
import java.util.List;

public class JSONElementsGetter {

    private GsonBuilderHelper gsonBuilderHelper;

    public JSONElementsGetter() {
        gsonBuilderHelper = new GsonBuilderHelper();
    }

    public List<String> getReleaseGroupsNames() {
        List<String> names = new ArrayList<>();

        for (ReleaseGroups name: gsonBuilderHelper.getRoot().getReleaseGroups()) {
            names.add(name.getName());
        }

        return names;
    }

    public List<Releases> getReleases() {
        List<Releases> releases = new ArrayList<>();

        for (ReleaseGroups relGroup: gsonBuilderHelper.getRoot().getReleaseGroups()) {
            releases.addAll(relGroup.getReleases());
        }

        return releases;
    }

    public List<String> getReleasesNames() {
        List<String> names = new ArrayList<>();

        for (Releases release: getReleases()) {
            names.add(release.getName());
        }

        return names;
    }

    public List<Integer> getReleasesLength() {
        List<Integer> lengths = new ArrayList<>();

        for (Releases release: getReleases()) {
            lengths.add(release.getLength());
        }

        return lengths;
    }

    public List<Integer> getReleasesStartDateOffset() {
        List<Integer> lengths = new ArrayList<>();

        for (Releases release: getReleases()) {
            lengths.add(release.getLength());
        }

        return lengths;
    }

    public List<Sprints> getSprints() {
        List<Sprints> sprints = new ArrayList<>();

        for (Releases release: getReleases()) {
            sprints.addAll(release.getSprints());
        }

        return sprints;
    }

    public List<String> getSprintNames() {
        List<String> names = new ArrayList<>();

        for (Sprints sprint: getSprints()) {
            names.add(sprint.getName());
        }

        return names;
    }

    public List<Integer> getSprintLength() {
        List<Integer> length = new ArrayList<>();

        for (Sprints sprint: getSprints()) {
            length.add(sprint.getLength());
        }

        return length;
    }

    public List<Integer> getSprintStartDateOffset() {
        List<Integer> startDateOffset = new ArrayList<>();

        for (Sprints sprint: getSprints()) {
            startDateOffset.add(sprint.getStartDateOffset());
        }

        return startDateOffset;
    }
}
