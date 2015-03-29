package parsers.simple;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import parsers.VersionParserConfiguration;

import java.io.File;
import java.io.IOException;

public class FakeSimpleVersionParser extends SimpleVersionParser {
    private String documentOrigin;

    public FakeSimpleVersionParser(VersionParserConfiguration conf, String documentOrigin) {
        super(conf);
        this.documentOrigin = documentOrigin;
    }

    @Override
    public Document loadDocument() throws IOException {
        File input = new File(documentOrigin);
        return Jsoup.parse(input, "UTF-8", url);
    }
}
