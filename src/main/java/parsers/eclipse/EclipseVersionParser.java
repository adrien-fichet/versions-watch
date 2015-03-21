package parsers.eclipse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import parsers.VersionParser;

import java.io.IOException;

public class EclipseVersionParser extends VersionParser {

    public Document loadDocument() throws IOException {
        return Jsoup.connect("http://www.eclipse.org/downloads").get();
    }

    @Override
    public String parseVersion() {
        try {
            return loadDocument().select("#descriptionText").first().text().replaceAll(" Release", "").replaceAll("Eclipse ", "");
        } catch (IOException e) {
            return UNKNOWN_VERSION;
        }
    }
}
