package parsers.simple;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import parsers.VersionParser;
import parsers.VersionParserConfiguration;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleVersionParser extends VersionParser {
    protected String url;
    private String versionCssSelector;
    private String extractorRegex;

    public SimpleVersionParser(VersionParserConfiguration conf) {
        this.url = conf.getUrl();
        this.versionCssSelector = conf.getCssSelector();
        this.extractorRegex = conf.getExtractorRegex();
    }

    public Document loadDocument() throws IOException {
        return Jsoup.connect(url).get();
    }

    @Override
    public String parseVersion() {
        String versionText;

        try {
            versionText = loadDocument().select(versionCssSelector).first().text();
        } catch (IOException e) {
            return UNKNOWN_VERSION;
        }

        if (extractorRegex != null) {
            Pattern versionPattern = Pattern.compile(extractorRegex);
            Matcher matcher = versionPattern.matcher(versionText);

            if (matcher.find()) {
                versionText = matcher.group(1);
            }
        }

        return versionText;
    }
}
