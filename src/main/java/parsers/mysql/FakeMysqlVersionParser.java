package parsers.mysql;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class FakeMysqlVersionParser extends MysqlVersionParser {
    private String documentOrigin;

    public FakeMysqlVersionParser(String documentOrigin) {
        this.documentOrigin = documentOrigin;
    }

    @Override
    public Document loadDocument() throws IOException {
        File input = new File(documentOrigin);
        return Jsoup.parse(input, "UTF-8", "https://dev.mysql.com/doc");
    }
}
