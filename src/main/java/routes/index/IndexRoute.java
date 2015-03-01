package routes.index;

import parsers.git.GitVersionParser;
import routes.Route;
import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;

public class IndexRoute implements Route {

    public void setup() {
        get("/", (request, response) -> {
            Map<String, String> map = new HashMap<String, String>();
            map.put("git_version", new GitVersionParser().parseVersion());
            return new MustacheTemplateEngine().render(new ModelAndView(map, "index.mustache"));
        });
    }
}
