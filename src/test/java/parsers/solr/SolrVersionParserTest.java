package parsers.solr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolrVersionParserTest {

    @Test
    public void testParseSolrVersion() throws Exception {
        String documentOrigin = getClass().getResource("/parsers/solr/Solr.html").getPath();
        SolrVersionParser solrVersionParser = new FakeSolrVersionParser(documentOrigin);
        assertEquals("5.0.0", solrVersionParser.parseVersion());
    }
}
