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
    private String id;
    private VersionParserConfiguration conf;
    private String expectedVersion;

    @Parameters
    public static Collection<Object[]> data() {
        Map<String, VersionParserConfiguration> configurations = new Conf().getConfigurations();
        Map<String, String> expectedVersions = new ExpectedVersions().getExpectedVersions();
        Collection<Object[]> data = new ArrayList<Object[]>();
        configurations.forEach((id, conf) -> data.add(new Object[]{id, configurations.get(id), expectedVersions.get(id)}));
        return data;
    }

    public SimpleVersionParserTest (String id, VersionParserConfiguration conf, String expectedVersion) {
        this.id = id;
        this.conf = conf;
        this.expectedVersion = expectedVersion;
    }

    @Test
    public void testSimpleVersionParser() throws Exception {
        String documentOrigin = getClass().getResource("/parsers/simple/" + id + ".html").getPath();
        SimpleVersionParser simpleVersionParser = new FakeSimpleVersionParser(conf, documentOrigin);
        logger.info(id + " version should be " + expectedVersion);
        assertEquals(expectedVersion, simpleVersionParser.parseVersion());
    }
}
