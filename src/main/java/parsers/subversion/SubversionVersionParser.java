package parsers.subversion;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubversionVersionParser {

    public Document loadDocument() throws IOException {
        return Jsoup.connect("https://en.wikipedia.org/wiki/Apache_Subversion").get();
    }

    public String parseVersion() {
        String subversionStableVersionText;

        try {
            subversionStableVersionText = loadDocument().select(".infobox tr:eq(4)").first().text();
        } catch (IOException e) {
            return "Unknown";
        }

        Pattern subversionStableVersionPattern = Pattern.compile("Stable release (.*) \\(");
        Matcher matcher = subversionStableVersionPattern.matcher(subversionStableVersionText);

        if (matcher.find()) {
            return matcher.group(1);
        } else {
            return "Unknown";
        }
    }
}
