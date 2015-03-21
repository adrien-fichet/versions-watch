package parsers.eclipse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class FakeEclipseVersionParser extends EclipseVersionParser {
    private String documentOrigin;

    public FakeEclipseVersionParser(String documentOrigin) {
        this.documentOrigin = documentOrigin;
    }

    @Override
    public Document loadDocument() throws IOException {
        File input = new File(documentOrigin);
        return Jsoup.parse(input, "UTF-8", "http://www.eclipse.org/downloads");
    }
}
