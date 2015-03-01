package parsers.jetbrains;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JetbrainsVersionsParser {
    private String document = null;

    public String loadDocument() throws IOException {
        if (document == null) {
            InputStream in = new URL("https://www.jetbrains.com/js2/version.js").openStream();
            String versionScriptContent = IOUtils.toString(in);
            IOUtils.closeQuietly(in);
            return versionScriptContent;
        } else {
            return document;
        }
    }

    private String parseVersion(Pattern pattern) {
        String doc;

        try {
            doc = loadDocument();
        } catch (IOException e) {
            return "Unknown";
        }

        Matcher matcher = pattern.matcher(doc);

        if (matcher.find()) {
            return matcher.group(1);
        } else {
            return "Unknown";
        }
    }

    public String parseYoutrackVersion() {
        return parseVersion(Pattern.compile("var versionYTLong = \"(.*)\";"));
    }

    public String parseIdeaVersion() {
        return parseVersion(Pattern.compile("var versionIDEALong = \"(.*)\";"));
    }
}
