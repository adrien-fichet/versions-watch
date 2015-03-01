package parsers.subversion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubversionVersionParserTest {

    @Test
    public void testParseVersion() throws Exception {
        String documentOrigin = getClass().getResource("/parsers/subversion/Subversion.html").getPath();
        SubversionVersionParser subversionVersionParser = new FakeSubversionVersionParser(documentOrigin);
        assertEquals("1.8.11", subversionVersionParser.parseVersion());
    }
}
