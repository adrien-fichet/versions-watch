package routes.jetbrains;

import com.google.gson.Gson;
import parsers.jetbrains.JetbrainsVersionsParser;
import routes.Route;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;

public class JetbrainsRoute implements Route {

    @Override
    public void setup() {
        get("/jetbrains", (request, response) -> {
            response.type("application/json");
            Map<String, String> result = new HashMap<String, String>();
            result.put("youtrack", new JetbrainsVersionsParser().parseYoutrackVersion());
            result.put("idea", new JetbrainsVersionsParser().parseIdeaVersion());
            return new Gson().toJson(result);
        });
    }
}
