package parsers.apache;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApacheVersionParserTest {

    @Test
    public void testParseVersion() throws Exception {
        String documentOrigin = getClass().getResource("/parsers/apache/Apache.html").getPath();
        ApacheVersionParser apacheVersionParser = new FakeApacheVersionParser(documentOrigin);
        assertEquals("2.4.12", apacheVersionParser.parseVersion());
    }
}
