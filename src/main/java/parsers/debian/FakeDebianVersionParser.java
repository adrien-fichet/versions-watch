package parsers.debian;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class FakeDebianVersionParser extends DebianVersionParser {
    private String documentOrigin;

    public FakeDebianVersionParser(String documentOrigin) {
        this.documentOrigin = documentOrigin;
    }

    @Override
    public Document loadDocument() throws IOException {
        File input = new File(documentOrigin);
        return Jsoup.parse(input, "UTF-8", "https://www.debian.org/releases/");
    }
}
