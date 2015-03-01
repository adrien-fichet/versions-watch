package parsers.git;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class GitVersionParser {

    public Document loadDocument() throws IOException {
        return Jsoup.connect("http://git-scm.com/").get();
    }

    public String parseVersion() {
        try {
            return loadDocument().select("span.version").first().text();
        } catch (IOException e) {
            return "Unknown";
        }
    }
}
