package main;

import routes.debian.DebianRoute;
import routes.git.GitRoute;
import routes.index.IndexRoute;
import routes.jetbrains.JetbrainsRoute;
import routes.subversion.SubversionRoute;

import java.io.FileNotFoundException;

import static spark.Spark.setPort;
import static spark.Spark.staticFileLocation;

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
        new GitRoute().setup();
        new JetbrainsRoute().setup();
        new DebianRoute().setup();
        new SubversionRoute().setup();
        new IndexRoute().setup();
    }
}
