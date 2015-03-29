package parsers.simple;

import main.Conf;
import org.junit.Test;
import parsers.VersionParserConfiguration;

import static org.junit.Assert.assertEquals;

public class SimpleVersionParserTest {

    @Test
    public void testSimpleVersionParsers() throws Exception {
        testSimpleVersionParser("/parsers/apache/Apache.html", Conf.apacheVersionParserConfiguration, "2.4.12");
        testSimpleVersionParser("/parsers/debian/Debian.html", Conf.debianVersionParserConfiguration, "7.8");
        testSimpleVersionParser("/parsers/eclipse/Eclipse.html", Conf.eclipseVersionParserConfiguration, "Luna SR2 (4.4.2)");
        testSimpleVersionParser("/parsers/git/Git.html", Conf.gitVersionParserConfiguration, "2.3.1");
        testSimpleVersionParser("/parsers/mysql/Mysql.html", Conf.mysqlVersionParserConfiguration, "5.6");
        testSimpleVersionParser("/parsers/subversion/Subversion.html", Conf.subversionVersionParserConfiguration, "1.8.11");
        testSimpleVersionParser("/parsers/jenkins/Jenkins.html", Conf.jenkinsVersionParserConfiguration, "1.606");
        testSimpleVersionParser("/parsers/puppet/Puppet.html", Conf.puppetVersionParserConfiguration, "3.7.5");
        testSimpleVersionParser("/parsers/netbeans/Netbeans.html", Conf.netbeansVersionParserConfiguration, "8.0.2");
        testSimpleVersionParser("/parsers/php/Php.html", Conf.phpVersionParserConfiguration, "5.6.7");
        testSimpleVersionParser("/parsers/tomcat/Tomcat.html", Conf.tomcatVersionParserConfiguration, "8.0.21");
    }

    public void testSimpleVersionParser(String documentOriginPath, VersionParserConfiguration conf,
                                        String expectedVersion) throws Exception {
        String documentOrigin = getClass().getResource(documentOriginPath).getPath();
        SimpleVersionParser apacheVersionParser = new FakeSimpleVersionParser(conf, documentOrigin);
        assertEquals(expectedVersion, apacheVersionParser.parseVersion());
    }
}
