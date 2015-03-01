package routes.git;

import com.google.gson.Gson;
import parsers.git.GitVersionParser;
import routes.Route;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;

public class GitRoute implements Route {

    public void setup() {
        get("/git", (request, response) -> {
            response.type("application/json");
            Map<String, String> result = new HashMap<String, String>();
            result.put("git", new GitVersionParser().parseVersion());
            return new Gson().toJson(result);
        });
    }
}
