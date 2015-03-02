package parsers.debian;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import parsers.VersionParser;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DebianVersionParser extends VersionParser {

    public Document loadDocument() throws IOException {
        return Jsoup.connect("https://www.debian.org/releases/").get();
    }

    @Override
    public String parseVersion() {
        String stableVersionText;

        try {
            stableVersionText = loadDocument().select("#content dl dd:eq(1) p:eq(2)").first().text();
        } catch (IOException e) {
            return UNKNOWN_VERSION;
        }

        Pattern stableVersionPattern = Pattern.compile("its latest update, version (.*), was released");
        Matcher matcher = stableVersionPattern.matcher(stableVersionText);

        if (matcher.find()) {
            return matcher.group(1);
        }

        return UNKNOWN_VERSION;
    }
}
