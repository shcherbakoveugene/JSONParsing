import getters.JSONProjectElementsGetter;
import getters.JSONReleaseGroupsElementsGetter;

import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        JSONReleaseGroupsElementsGetter get = new JSONReleaseGroupsElementsGetter();
        JSONProjectElementsGetter proj = new JSONProjectElementsGetter();


    }
}
