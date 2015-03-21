package parsers.eclipse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EclipseVersionParserTest {

    @Test
    public void testParseVersion() throws Exception {
        String documentOrigin = getClass().getResource("/parsers/eclipse/Eclipse.html").getPath();
        EclipseVersionParser eclipseVersionParser = new FakeEclipseVersionParser(documentOrigin);
        assertEquals("Luna SR2 (4.4.2)", eclipseVersionParser.parseVersion());
    }
}
