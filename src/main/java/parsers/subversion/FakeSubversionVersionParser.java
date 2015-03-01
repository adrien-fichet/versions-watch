package parsers.subversion;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class FakeSubversionVersionParser extends SubversionVersionParser {
    private String documentOrigin;

    public FakeSubversionVersionParser(String documentOrigin) {
        this.documentOrigin = documentOrigin;
    }

    @Override
    public Document loadDocument() throws IOException {
        File input = new File(documentOrigin);
        return Jsoup.parse(input, "UTF-8", "https://en.wikipedia.org/wiki/Apache_Subversion");
    }
}
