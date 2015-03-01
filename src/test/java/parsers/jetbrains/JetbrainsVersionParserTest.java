package parsers.jetbrains;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JetbrainsVersionParserTest {
    private JetbrainsVersionsParser jetbrainsVersionParser;

    @Before
    public void setup() throws Exception {
        String documentOrigin = this.getClass().getResource("/parsers/jetbrains/version.js").getPath();
        jetbrainsVersionParser = new FakeJetbrainsVersionParser(documentOrigin);
    }

    @Test
    public void testParseYoutrackVersion() throws Exception {
        assertEquals("6.0.12619", jetbrainsVersionParser.parseYoutrackVersion());
    }

    @Test
    public void testParseIdeaVersion() throws Exception {
        assertEquals("14.0.3", jetbrainsVersionParser.parseIdeaVersion());
    }
}
