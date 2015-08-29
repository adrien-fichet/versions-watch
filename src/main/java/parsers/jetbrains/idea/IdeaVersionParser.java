package parsers.jetbrains.idea;

import parsers.VersionParser;
import parsers.jetbrains.JetbrainsVersionsParser;

import java.util.regex.Pattern;

public class IdeaVersionParser extends VersionParser {
    private JetbrainsVersionsParser jetbrainsVersionsParser;

    public IdeaVersionParser(JetbrainsVersionsParser jetbrainsVersionsParser) {
        this.jetbrainsVersionsParser = jetbrainsVersionsParser;
    }

    public String parseVersion() {
        return jetbrainsVersionsParser.parseVersion(Pattern.compile("var versionIDEALong = \"(([0-9]+\\.){2}[0-9]+)\";"));
    }
}
