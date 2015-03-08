package parsers.apache;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import parsers.VersionParser;

import java.io.IOException;

public class ApacheVersionParser extends VersionParser {

    public Document loadDocument() throws IOException {
        return Jsoup.connect("https://httpd.apache.org/download.cgi").get();
    }

    @Override
    public String parseVersion() {
        try {
            return loadDocument().select("#apcontents ul:eq(5)").first().text().replaceAll(" (.*)", "");
        } catch (IOException e) {
            return UNKNOWN_VERSION;
        }
    }
}
