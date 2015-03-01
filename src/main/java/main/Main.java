package main;

import routes.git.GitRoute;
import routes.index.IndexRoute;
import routes.jetbrains.JetbrainsRoute;

import java.io.FileNotFoundException;

import static spark.Spark.setPort;
import static spark.Spark.staticFileLocation;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        setPort(8080);
        staticFileLocation("/static_files");
        new GitRoute().setup();
        new JetbrainsRoute().setup();
        new IndexRoute().setup();
    }
}
