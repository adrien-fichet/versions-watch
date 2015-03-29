package main;

import parsers.jetbrains.JetbrainsVersionsParser;
import parsers.jetbrains.idea.IdeaVersionParser;
import parsers.jetbrains.youtrack.YoutrackVersionParser;
import parsers.simple.SimpleVersionParser;
import parsers.spring.SpringVersionParser;
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
        new Route("git", new SimpleVersionParser(Conf.gitVersionParserConfiguration)).setup();
        new Route("debian", new SimpleVersionParser(Conf.debianVersionParserConfiguration)).setup();
        new Route("subversion", new SimpleVersionParser(Conf.subversionVersionParserConfiguration)).setup();
        new Route("apache", new SimpleVersionParser(Conf.apacheVersionParserConfiguration)).setup();
        new Route("youtrack", new YoutrackVersionParser(jetbrainsVersionsParser)).setup();
        new Route("idea", new IdeaVersionParser(jetbrainsVersionsParser)).setup();
        new Route("mysql", new SimpleVersionParser(Conf.mysqlVersionParserConfiguration)).setup();
        new Route("eclipse", new SimpleVersionParser(Conf.eclipseVersionParserConfiguration)).setup();
        new Route("jenkins", new SimpleVersionParser(Conf.jenkinsVersionParserConfiguration)).setup();
        new Route("puppet", new SimpleVersionParser(Conf.puppetVersionParserConfiguration)).setup();
        new Route("spring", new SpringVersionParser()).setup();
        new Route("netbeans", new SimpleVersionParser(Conf.netbeansVersionParserConfiguration)).setup();
        new Route("php", new SimpleVersionParser(Conf.phpVersionParserConfiguration)).setup();
        new Route("tomcat", new SimpleVersionParser(Conf.tomcatVersionParserConfiguration)).setup();
        new Route("sublime_text", new SimpleVersionParser(Conf.sublimeTextVersionParserConfiguration)).setup();
        new Route("java", new SimpleVersionParser(Conf.javaVersionParserConfiguration)).setup();
        get("/", (request, response) -> new MustacheTemplateEngine().render(new ModelAndView(null, "index.mustache")));
    }
}
