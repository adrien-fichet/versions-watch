package parsers.simple;

import main.Conf;
import org.junit.Test;
import parsers.VersionParserConfiguration;

import static org.junit.Assert.assertEquals;

public class SimpleVersionParserTest {

    public void testSimpleVersionParser(String testFileName, VersionParserConfiguration conf, String expectedVersion) throws Exception {
        String documentOrigin = getClass().getResource("/parsers/simple/" + testFileName).getPath();
        SimpleVersionParser apacheVersionParser = new FakeSimpleVersionParser(conf, documentOrigin);
        assertEquals(expectedVersion, apacheVersionParser.parseVersion());
    }

    @Test
    public void testApacheSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Apache.html", Conf.apacheVersionParserConfiguration, "2.4.12");
    }

    @Test
    public void testDebianSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Debian.html", Conf.debianVersionParserConfiguration, "7.8");
    }

    @Test
    public void testEclipseSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Eclipse.html", Conf.eclipseVersionParserConfiguration, "Luna SR2 (4.4.2)");
    }

    @Test
    public void testGitSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Git.html", Conf.gitVersionParserConfiguration, "2.3.1");
    }

    @Test
    public void testJavaSimpleVersionParser() throws Exception {
        testSimpleVersionParser("JavaSE.html", Conf.javaVersionParserConfiguration, "8u40");
    }

    @Test
    public void testJenkinsSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Jenkins.html", Conf.jenkinsVersionParserConfiguration, "1.606");
    }

    @Test
    public void testMysqlSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Mysql.html", Conf.mysqlVersionParserConfiguration, "5.6");
    }

    @Test
    public void testNetbeansSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Netbeans.html", Conf.netbeansVersionParserConfiguration, "8.0.2");
    }

    @Test
    public void testPhpSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Php.html", Conf.phpVersionParserConfiguration, "5.6.7");
    }

    @Test
    public void testPuppetSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Puppet.html", Conf.puppetVersionParserConfiguration, "3.7.5");
    }

    @Test
    public void testSublimeTextSimpleVersionParser() throws Exception {
        testSimpleVersionParser("SublimeText.html", Conf.sublimeTextVersionParserConfiguration, "2.0.2");
    }

    @Test
    public void testSubversionSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Subversion.html", Conf.subversionVersionParserConfiguration, "1.8.11");
    }

    @Test
    public void testTomcatSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Tomcat.html", Conf.tomcatVersionParserConfiguration, "8.0.21");
    }

    @Test
    public void testJunitSimpleVersionParser() throws Exception {
        testSimpleVersionParser("JUnit.html", Conf.junitVersionParserConfiguration, "4.12");
    }

    @Test
    public void testVagrantSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Vagrant.html", Conf.vagrantVersionParserConfiguration, "1.7.2");
    }

    @Test
    public void testExtjsSimpleVersionParser() throws Exception {
        testSimpleVersionParser("ExtJS.html", Conf.extjsVersionParserConfiguration, "5.1.0");
    }
}
