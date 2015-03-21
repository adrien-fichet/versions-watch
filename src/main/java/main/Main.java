package main;

import parsers.apache.ApacheVersionParser;
import parsers.debian.DebianVersionParser;
import parsers.eclipse.EclipseVersionParser;
import parsers.git.GitVersionParser;
import parsers.jetbrains.JetbrainsVersionsParser;
import parsers.jetbrains.idea.IdeaVersionParser;
import parsers.jetbrains.youtrack.YoutrackVersionParser;
import parsers.mysql.MysqlVersionParser;
import parsers.subversion.SubversionVersionParser;
import routes.Route;
import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;

import java.io.FileNotFoundException;

import static spark.Spark.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        staticFileLocation("/static_files");
        setupPort();
        setupRoutes();
    }

    public static void setupPort() {
        String port = System.getenv("PORT");
        if(port == null || port.isEmpty()) {
            port = "8080";
        }
        setPort(Integer.valueOf(port));
    }

    private static void setupRoutes() {
        JetbrainsVersionsParser jetbrainsVersionsParser = new JetbrainsVersionsParser();
        new Route("git", new GitVersionParser()).setup();
        new Route("debian", new DebianVersionParser()).setup();
        new Route("subversion", new SubversionVersionParser()).setup();
        new Route("apache", new ApacheVersionParser()).setup();
        new Route("youtrack", new YoutrackVersionParser(jetbrainsVersionsParser)).setup();
        new Route("idea", new IdeaVersionParser(jetbrainsVersionsParser)).setup();
        new Route("mysql", new MysqlVersionParser()).setup();
        new Route("eclipse", new EclipseVersionParser()).setup();
        get("/", (request, response) -> new MustacheTemplateEngine().render(new ModelAndView(null, "index.mustache")));
    }
}
