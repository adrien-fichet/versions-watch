package routes.debian;

import com.google.gson.Gson;
import parsers.debian.DebianVersionParser;
import routes.Route;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;

public class DebianRoute implements Route {

    @Override
    public void setup() {
        get("/debian", (request, response) -> {
            response.type("application/json");
            Map<String, String> result = new HashMap<String, String>();
            result.put("version", new DebianVersionParser().parseVersion());
            return new Gson().toJson(result);
        });
    }
}
