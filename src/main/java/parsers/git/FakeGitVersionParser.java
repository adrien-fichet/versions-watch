package parsers.git;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class FakeGitVersionParser extends GitVersionParser {
    private String documentOrigin;

    public FakeGitVersionParser(String documentOrigin) {
        this.documentOrigin = documentOrigin;
    }

    @Override
    public Document loadDocument() throws IOException {
        File input = new File(documentOrigin);
        return Jsoup.parse(input, "UTF-8", "http://git-scm.com/");
    }
}
