package parsers.simple;

import main.Conf;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import parsers.ExpectedVersions;
import parsers.VersionParserConfiguration;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SimpleVersionParserTest {
    private Map<String, VersionParserConfiguration> configurations = new Conf().getConfigurations();
    private Map<String, String> expectedVersions = new ExpectedVersions().getExpectedVersions();
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testSimpleVersionParsers() throws Exception {
        configurations.forEach((id, conf) -> {
            String documentOrigin = getClass().getResource("/parsers/simple/" + id + ".html").getPath();
            SimpleVersionParser simpleVersionParser = new FakeSimpleVersionParser(conf, documentOrigin);
            logger.info(id + " version should be " + expectedVersions.get(id));
            assertEquals(expectedVersions.get(id), simpleVersionParser.parseVersion());
        });
    }
}
