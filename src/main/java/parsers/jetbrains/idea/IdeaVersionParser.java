package parsers.jetbrains.idea;

import parsers.VersionParser;
import parsers.jetbrains.JetbrainsVersionsParser;

import java.util.regex.Pattern;

public class IdeaVersionParser extends VersionParser {
    private JetbrainsVersionsParser jetbrainsVersionsParser;

    public IdeaVersionParser(JetbrainsVersionsParser jetbrainsVersionsParser) {
        this.jetbrainsVersionsParser = jetbrainsVersionsParser;
    }

    @Override
    public String parseVersion() {
        return jetbrainsVersionsParser.parseVersion(Pattern.compile("var versionIDEALong = \"(.*)\";"));
    }
}
