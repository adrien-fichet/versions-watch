package parsers;

import main.Conf;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
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

    private void downloadResourceFile(String urlString, String dest) {
        logger.info("Downloading " + urlString + " to " + resourcePath + dest + "...");
        try {
            URL url=new URL(urlString);
            URLConnection conn = url.openConnection();
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:31.0) Gecko/20100101 Firefox/31.0");
            conn.connect();
            FileUtils.copyInputStreamToFile(conn.getInputStream(), new File(resourcePath + dest));
        } catch (IOException e) {
            logger.error("Could not download " + urlString + ": " + e.getMessage());
        }
    }
}
