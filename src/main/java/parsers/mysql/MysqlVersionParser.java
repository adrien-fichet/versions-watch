package parsers.mysql;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import parsers.VersionParser;

import java.io.IOException;

public class MysqlVersionParser extends VersionParser {

    public Document loadDocument() throws IOException {
        return Jsoup.connect("https://dev.mysql.com/doc").get();
    }

    @Override
    public String parseVersion() {
        try {
            return loadDocument().select("#rowid-0 > td:nth-child(2)").first().text();
        } catch (IOException e) {
            return UNKNOWN_VERSION;
        }
    }
}
