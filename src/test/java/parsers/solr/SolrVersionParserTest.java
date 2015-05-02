package parsers.solr;

import org.junit.Test;
import parsers.ExpectedVersions;

import static org.junit.Assert.assertEquals;

public class SolrVersionParserTest {

    @Test
    public void testParseSolrVersion() throws Exception {
        String documentOrigin = getClass().getResource("/parsers/solr/Solr.html").getPath();
        SolrVersionParser solrVersionParser = new FakeSolrVersionParser(documentOrigin);
        assertEquals(ExpectedVersions.solrVersion, solrVersionParser.parseVersion());
    }
}
