package parsers.simple;

import main.Conf;
import org.junit.Test;
import parsers.VersionParserConfiguration;

import static org.junit.Assert.assertEquals;

public class SimpleVersionParserTest {

    public void testSimpleVersionParser(String documentOriginPath, VersionParserConfiguration conf,
                                        String expectedVersion) throws Exception {
        String documentOrigin = getClass().getResource(documentOriginPath).getPath();
        SimpleVersionParser apacheVersionParser = new FakeSimpleVersionParser(conf, documentOrigin);
        assertEquals(expectedVersion, apacheVersionParser.parseVersion());
    }

    @Test
    public void testApacheSimpleVersionParser() throws Exception {
        testSimpleVersionParser("/parsers/apache/Apache.html", Conf.apacheVersionParserConfiguration, "2.4.12");
    }

    @Test
    public void testDebianSimpleVersionParser() throws Exception {
        testSimpleVersionParser("/parsers/debian/Debian.html", Conf.debianVersionParserConfiguration, "7.8");
    }

    @Test
    public void testEclipseSimpleVersionParser() throws Exception {
        testSimpleVersionParser("/parsers/eclipse/Eclipse.html", Conf.eclipseVersionParserConfiguration, "Luna SR2 (4.4.2)");
    }

    @Test
    public void testGitSimpleVersionParser() throws Exception {
        testSimpleVersionParser("/parsers/git/Git.html", Conf.gitVersionParserConfiguration, "2.3.1");
    }

    @Test
    public void testJavaSimpleVersionParser() throws Exception {
        testSimpleVersionParser("/parsers/java/JavaSE.html", Conf.javaVersionParserConfiguration, "8u40");
    }

    @Test
    public void testJenkinsSimpleVersionParser() throws Exception {
        testSimpleVersionParser("/parsers/jenkins/Jenkins.html", Conf.jenkinsVersionParserConfiguration, "1.606");
    }

    @Test
    public void testMysqlSimpleVersionParser() throws Exception {
        testSimpleVersionParser("/parsers/mysql/Mysql.html", Conf.mysqlVersionParserConfiguration, "5.6");
    }

    @Test
    public void testNetbeansSimpleVersionParser() throws Exception {
        testSimpleVersionParser("/parsers/netbeans/Netbeans.html", Conf.netbeansVersionParserConfiguration, "8.0.2");
    }

    @Test
    public void testPhpSimpleVersionParser() throws Exception {
        testSimpleVersionParser("/parsers/php/Php.html", Conf.phpVersionParserConfiguration, "5.6.7");
    }

    @Test
    public void testPuppetSimpleVersionParser() throws Exception {
        testSimpleVersionParser("/parsers/puppet/Puppet.html", Conf.puppetVersionParserConfiguration, "3.7.5");
    }

    @Test
    public void testSublimeTextSimpleVersionParser() throws Exception {
        testSimpleVersionParser("/parsers/sublime_text/SublimeText.html", Conf.sublimeTextVersionParserConfiguration, "2.0.2");
    }

    @Test
    public void testSubversionSimpleVersionParser() throws Exception {
        testSimpleVersionParser("/parsers/subversion/Subversion.html", Conf.subversionVersionParserConfiguration, "1.8.11");
    }

    @Test
    public void testTomcatSimpleVersionParser() throws Exception {
        testSimpleVersionParser("/parsers/tomcat/Tomcat.html", Conf.tomcatVersionParserConfiguration, "8.0.21");
    }
}
