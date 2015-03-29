package parsers.spring;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.io.IOUtils;
import parsers.VersionParser;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class SpringVersionParser extends VersionParser {

    public String loadDocument() throws IOException {
        InputStream in = new URL("https://spring.io/project_metadata/spring-framework").openStream();
        String versionScriptContent = IOUtils.toString(in);
        IOUtils.closeQuietly(in);
        return versionScriptContent;
    }

    public String parseVersion() {
        String result = VersionParser.UNKNOWN_VERSION;

        try {
            String doc = loadDocument();
            JsonObject docJson = new JsonParser().parse(doc).getAsJsonObject();
            return docJson.get("projectReleases").getAsJsonArray().get(1).getAsJsonObject().get("versionDisplayName")
                    .getAsString();
        } catch (IOException e) {}

        return result;
    }
}
