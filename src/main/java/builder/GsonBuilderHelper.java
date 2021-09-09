package builder;

import com.google.gson.Gson;
import jsonModel.Root;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class GsonBuilderHelper {

    private Gson gson;
    private Root root;

    public GsonBuilderHelper() {
        gson = new com.google.gson.GsonBuilder().create();
        try {
            root = gson.fromJson(new FileReader("settings.json"), Root.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Root getRoot() {
        return root;
    }
}
