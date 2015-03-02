package parsers.jetbrains.youtrack;

import parsers.VersionParser;
import parsers.jetbrains.JetbrainsVersionsParser;

import java.util.regex.Pattern;

public class YoutrackVersionParser extends VersionParser {
    JetbrainsVersionsParser jetbrainsVersionsParser;

    public YoutrackVersionParser(JetbrainsVersionsParser jetbrainsVersionsParser) {
        this.jetbrainsVersionsParser = jetbrainsVersionsParser;
    }

    @Override
    public String parseVersion() {
        return jetbrainsVersionsParser.parseVersion(Pattern.compile("var versionYTLong = \"(.*)\";"));
    }
}
