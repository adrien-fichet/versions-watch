package routes.subversion;

import com.google.gson.Gson;
import parsers.subversion.SubversionVersionParser;
import routes.Route;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;

public class SubversionRoute implements Route {

    @Override
    public void setup() {
        get("/subversion", (request, response) -> {
            response.type("application/json");
            Map<String, String> result = new HashMap<String, String>();
            result.put("subversion", new SubversionVersionParser().parseVersion());
            return new Gson().toJson(result);
        });
    }
}
