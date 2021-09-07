
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Gson g = new GsonBuilder().create();
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("settings.json"));

        JSONArray releases = (JSONArray) jsonObject.get("releaseGroups");
        String[] arr = String.valueOf(releases.get(0)).split("\\[");
//        for (int i =0; i< arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        JSon json = g.fromJson(new FileReader("settings.json"), JSon.class);

        for (ReleaseGroups el: json.releaseGroups) {
            for (Releases releases1: el.releases) {
                for (Sprints sprints: releases1.sprints) {
                    System.out.println(sprints.name);
                }
            }
        }
    }
}
