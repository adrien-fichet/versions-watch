package main;

import parsers.jetbrains.JetbrainsVersionsParser;
import parsers.jetbrains.idea.IdeaVersionParser;
import parsers.jetbrains.youtrack.YoutrackVersionParser;
import parsers.simple.SimpleVersionParser;
import parsers.solr.SolrVersionParser;
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
        new Route("solr", new SolrVersionParser()).setup();
        new Route("junit", new SimpleVersionParser(Conf.junitVersionParserConfiguration)).setup();
        new Route("vagrant", new SimpleVersionParser(Conf.vagrantVersionParserConfiguration)).setup();
        new Route("extjs", new SimpleVersionParser(Conf.extjsVersionParserConfiguration)).setup();
        new Route("maven", new SimpleVersionParser(Conf.mavenVersionParserConfiguration)).setup();
        new Route("hibernate", new SimpleVersionParser(Conf.hibernateVersionParserConfiguration)).setup();
        new Route("javascript", new SimpleVersionParser(Conf.javascriptVersionParserConfiguration)).setup();
        new Route("ubuntu", new SimpleVersionParser(Conf.ubuntuVersionParserConfiguration)).setup();
        new Route("nginx", new SimpleVersionParser(Conf.nginxVersionParserConfiguration)).setup();
        new Route("elasticsearch", new SimpleVersionParser(Conf.elasticsearchVersionParserConfiguration)).setup();
        new Route("kibana", new SimpleVersionParser(Conf.kibanaVersionParserConfiguration)).setup();
        new Route("logstash", new SimpleVersionParser(Conf.logstashVersionParserConfiguration)).setup();
        new Route("logstashforwarder", new SimpleVersionParser(Conf.logstashForwarderVersionParserConfiguration)).setup();
        new Route("openssl", new SimpleVersionParser(Conf.opensslVersionParserConfiguration)).setup();
        new Route("openssh", new SimpleVersionParser(Conf.opensshVersionParserConfiguration)).setup();
        new Route("zabbix", new SimpleVersionParser(Conf.zabbixVersionParserConfiguration)).setup();
        new Route("nagios", new SimpleVersionParser(Conf.nagiosVersionParserConfiguration)).setup();
        new Route("cobertura", new SimpleVersionParser(Conf.coberturaVersionParserConfiguration)).setup();
        new Route("gatling", new SimpleVersionParser(Conf.gatlingVersionParserConfiguration)).setup();
        new Route("scala", new SimpleVersionParser(Conf.scalaVersionParserConfiguration)).setup();
        new Route("selenium", new SimpleVersionParser(Conf.seleniumVersionParserConfiguration)).setup();
        new Route("virtualbox", new SimpleVersionParser(Conf.virtualboxVersionParserConfiguration)).setup();
        new Route("windows", new SimpleVersionParser(Conf.windowsVersionParserConfiguration)).setup();
        new Route("centos", new SimpleVersionParser(Conf.centosVersionParserConfiguration)).setup();
        get("/", (request, response) -> new MustacheTemplateEngine().render(new ModelAndView(null, "index.mustache")));
    }
}
