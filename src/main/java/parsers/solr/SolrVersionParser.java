package parsers.solr;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import parsers.VersionParser;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolrVersionParser extends VersionParser {
    protected final String url = "https://lucene.apache.org/solr/resources.html";

    public Document loadDocument() throws IOException {
        return Jsoup.connect(url).get();
    }

    @Override
    public String parseVersion() {
        String versionUrl;
        String versionText = UNKNOWN_VERSION;

        try {
            versionUrl = loadDocument().select("body > div.container > div:nth-child(3) > div > ul:nth-child(8) > li > a").first().attr("href");
        } catch (IOException e) {
            return UNKNOWN_VERSION;
        }

        Pattern versionPattern = Pattern.compile("solr/(.*?)/index.html");
        Matcher matcher = versionPattern.matcher(versionUrl);

        if (matcher.find()) {
            versionText = matcher.group(1).replaceAll("_", ".");
        }

        return versionText;
    }
}
