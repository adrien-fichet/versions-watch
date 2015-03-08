package parsers.apache;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class FakeApacheVersionParser extends ApacheVersionParser {
    private String documentOrigin;

    public FakeApacheVersionParser(String documentOrigin) {
        this.documentOrigin = documentOrigin;
    }

    @Override
    public Document loadDocument() throws IOException {
        File input = new File(documentOrigin);
        return Jsoup.parse(input, "UTF-8", "https://httpd.apache.org/");
    }
}
