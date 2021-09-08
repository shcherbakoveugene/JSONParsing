import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class GsonBuilderHelper {

    private Gson g;
    private Settings settings;

    public GsonBuilderHelper() {
        g = new com.google.gson.GsonBuilder().create();
        try {
            settings = g.fromJson(new FileReader("settings.json"), Settings.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Settings getSettings() {
        return settings;
    }
}
