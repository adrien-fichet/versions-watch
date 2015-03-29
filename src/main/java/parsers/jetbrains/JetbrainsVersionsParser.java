package parsers.jetbrains;

import org.apache.commons.io.IOUtils;
import parsers.VersionParser;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JetbrainsVersionsParser {

    public String loadDocument() throws IOException {
        InputStream in = new URL("https://www.jetbrains.com/js2/version.js").openStream();
        String versionScriptContent = IOUtils.toString(in);
        IOUtils.closeQuietly(in);
        return versionScriptContent;
    }

    public String parseVersion(Pattern pattern) {
        String result = VersionParser.UNKNOWN_VERSION;

        try {
            String doc = loadDocument();
            Matcher matcher = pattern.matcher(doc);

            if (matcher.find()) {
                result = matcher.group(1);
            }
        } catch (IOException e) {}

        return result;
    }
}
