import java.util.ArrayList;
import java.util.List;

public class JSONElementsGetter {
    private GsonBuilderHelper gsonBuilderHelper;

    public JSONElementsGetter() {
        gsonBuilderHelper = new GsonBuilderHelper();
    }

    public List<String> getReleaseGroupsNames() {
        List<String> names = new ArrayList<>();

        for (ReleaseGroups name: gsonBuilderHelper.getSettings().getReleaseGroups()) {
            names.add(name.getName());
        }

        return names;
    }

    public List<Releases> getReleases() {
        List<Releases> releases = new ArrayList<>();

        for (ReleaseGroups relGroup: gsonBuilderHelper.getSettings().getReleaseGroups()) {
            releases.addAll(relGroup.getReleases());
        }

        return releases;
    }

    public List<String> getReleasesNames() {
        List<String> names = new ArrayList<>();

        for (Releases name: getReleases()) {
            names.add(name.getName());
        }

        return names;
    }

    public List<Sprints> getSprints() {
        List<Sprints> sprints = new ArrayList<>();

        for (Releases release: getReleases()) {
            sprints.addAll(release.getSprints());
        }

        return sprints;
    }
}
