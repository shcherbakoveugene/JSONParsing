
import getters.JSONReleaseGroupsElementsGetter;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        JSONReleaseGroupsElementsGetter get = new JSONReleaseGroupsElementsGetter();
        System.out.println(get.getSprintStartDateOffset(get.getReleasesNames().get(0)));
//        Gson g = new GsonBuilder().create();
//        JSONParser jsonParser = new JSONParser();
//        JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("settings.json"));
//
//        JSONArray releases = (JSONArray) jsonObject.get("releaseGroups");
//        String[] arr = String.valueOf(releases.get(0)).split("\\[");
////        for (int i =0; i< arr.length; i++) {
////            System.out.println(arr[i]);
////        }
//        JSon json = g.fromJson(new FileReader("settings.json"), JSon.class);

//        for (jsonModel.releaseGroups.ReleaseGroups el: new builder.GsonBuilderHelper().getSettings().releaseGroups) {
//            for (jsonModel.releaseGroups.Releases releases1: el.releases) {
//                for (jsonModel.releaseGroups.Sprints sprints: releases1.sprints) {
//                    System.out.println(sprints.name);
//                }
//            }
//        }
    }
}
