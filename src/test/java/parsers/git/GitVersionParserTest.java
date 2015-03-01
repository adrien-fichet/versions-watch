package parsers.git;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitVersionParserTest {

    @Test
    public void testParseVersion() throws Exception {
        String documentOrigin = getClass().getResource("/parsers/git/Git.html").getPath();
        GitVersionParser gitVersionParser = new FakeGitVersionParser(documentOrigin);
        assertEquals("2.3.1", gitVersionParser.parseVersion());
    }
}
