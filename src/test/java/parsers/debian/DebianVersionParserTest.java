package parsers.debian;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebianVersionParserTest {

    @Test
    public void testParseVersion() throws Exception {
        String documentOrigin = this.getClass().getResource("/parsers/debian/Debian.html").getPath();
        DebianVersionParser debianVersionParser = new FakeDebianVersionParser(documentOrigin);
        assertEquals("7.8", debianVersionParser.parseVersion());
    }
}
