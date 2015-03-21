package parsers.mysql;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MysqlVersionParserTest {

    @Test
    public void testParseVersion() throws Exception {
        String documentOrigin = getClass().getResource("/parsers/mysql/Mysql.html").getPath();
        MysqlVersionParser mysqlVersionParser = new FakeMysqlVersionParser(documentOrigin);
        assertEquals("5.6", mysqlVersionParser.parseVersion());
    }
}
