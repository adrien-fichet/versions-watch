package parsers.git;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import parsers.VersionParser;

import java.io.IOException;

public class GitVersionParser extends VersionParser {

    public Document loadDocument() throws IOException {
        return Jsoup.connect("http://git-scm.com/").get();
    }

    @Override
    public String parseVersion() {
        try {
            return loadDocument().select("span.version").first().text();
        } catch (IOException e) {
            return UNKNOWN_VERSION;
        }
    }
}
