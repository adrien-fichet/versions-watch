package parsers.jetbrains.idea;

import org.junit.Test;
import parsers.ExpectedVersions;
import parsers.jetbrains.FakeJetbrainsVersionParser;
import parsers.jetbrains.JetbrainsVersionsParser;

import static org.junit.Assert.assertEquals;

public class IdeaVersionParserTest {

    @Test
    public void testParseYoutrackVersion() throws Exception {
        String documentOrigin = getClass().getResource("/parsers/jetbrains/version.js").getPath();
        JetbrainsVersionsParser jbParser = new FakeJetbrainsVersionParser(documentOrigin);
        IdeaVersionParser parser = new IdeaVersionParser(jbParser);
        assertEquals(new ExpectedVersions().getExpectedVersions().get("idea"), parser.parseVersion());
    }
}
