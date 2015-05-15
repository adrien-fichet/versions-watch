package parsers.simple;

import main.Conf;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import parsers.ExpectedVersions;
import parsers.VersionParserConfiguration;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SimpleVersionParserTest {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private String versionId;
    private VersionParserConfiguration versionParserConfiguration;
    private String expectedVersion;

    @Parameters
    public static Collection<Object[]> data() {
        Map<String, VersionParserConfiguration> configurations = new Conf().getConfigurations();
        Map<String, String> expectedVersions = new ExpectedVersions().getExpectedVersions();
        Collection<Object[]> data = new ArrayList<Object[]>();
        configurations.forEach((id, conf) -> data.add(new Object[]{id, configurations.get(id), expectedVersions.get(id)}));
        return data;
    }

    public SimpleVersionParserTest (String versionId, VersionParserConfiguration versionParserConfiguration, String expectedVersion) {
        this.versionId = versionId;
        this.versionParserConfiguration = versionParserConfiguration;
        this.expectedVersion = expectedVersion;
    }

    @Test
    public void testSimpleVersionParser() throws Exception {
        String documentOrigin = getClass().getResource("/parsers/simple/" + versionId + ".html").getPath();
        SimpleVersionParser simpleVersionParser = new FakeSimpleVersionParser(versionParserConfiguration, documentOrigin);
        logger.info(versionId + " version should be " + expectedVersion);
        assertEquals(expectedVersion, simpleVersionParser.parseVersion());
    }
}
