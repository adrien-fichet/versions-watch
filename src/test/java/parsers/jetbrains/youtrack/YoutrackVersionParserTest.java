package parsers.jetbrains.youtrack;

import org.junit.Test;
import parsers.jetbrains.FakeJetbrainsVersionParser;
import parsers.jetbrains.JetbrainsVersionsParser;

import static org.junit.Assert.assertEquals;

public class YoutrackVersionParserTest {

    @Test
    public void testParseYoutrackVersion() throws Exception {
        String documentOrigin = getClass().getResource("/parsers/jetbrains/version.js").getPath();
        JetbrainsVersionsParser jbParser = new FakeJetbrainsVersionParser(documentOrigin);
        YoutrackVersionParser parser = new YoutrackVersionParser(jbParser);
        assertEquals("6.0.12619", parser.parseVersion());
    }
}
