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
    private String[][] replacements;

    public SimpleVersionParser(VersionParserConfiguration conf) {
        url = conf.getUrl();
        versionCssSelector = conf.getCssSelector();
        extractorRegex = conf.getExtractorRegex();
        replacements = conf.getReplacements();
    }

    public Document loadDocument() throws IOException {
        return Jsoup.connect(url).userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:31.0) Gecko/20100101 Firefox/31.0").get();
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

        if (replacements != null) {
            for (String[] replacement : replacements) {
                versionText = versionText.replaceAll(replacement[0], replacement[1]);
            }
        }

        return versionText;
    }
}
