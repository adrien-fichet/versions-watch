package parsers;

import main.Conf;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestFilesUpdate {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private Path resourcePath;

    public static void main(String[] args) throws Exception {
        TestFilesUpdate testFilesUpdate = new TestFilesUpdate();
        testFilesUpdate.getResourceDirectory();
        testFilesUpdate.updateResourceFiles();
    }

    private void getResourceDirectory() throws IOException {
        resourcePath = Paths.get(getClass().getClassLoader().getResource("").getPath(), "../../src/test/resources/parsers");
    }

    private void updateResourceFiles() throws IOException {
        downloadResourceFile("https://www.jetbrains.com/js2/version.js", "/jetbrains/version.js");
        downloadResourceFile("https://spring.io/project_metadata/spring-framework", "/spring/spring.js");
        new Conf().getConfigurations().forEach((id, conf) -> downloadResourceFile(conf.getUrl(), "/simple/" + id + ".html"));
    }

    private void downloadResourceFile(String url, String dest) {
        logger.info("Downloading " + url + " to " + resourcePath + dest + "...");
        try {
            FileUtils.copyURLToFile(new URL(url), new File(resourcePath + dest));
        } catch (IOException e) {
            logger.error("Could not download " + url + ": " + e.getMessage());
        }
    }
}
