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
        testSimpleVersionParser("Eclipse.html", Conf.eclipseVersionParserConfiguration, "4.4.2");
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

    @Test
    public void testMavenSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Maven.html", Conf.mavenVersionParserConfiguration, "3.3.1");
    }

    @Test
    public void testHibernateSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Hibernate.html", Conf.hibernateVersionParserConfiguration, "4.3.8");
    }

    @Test
    public void testJavascriptSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Javascript.html", Conf.javascriptVersionParserConfiguration, "1.8.5");
    }

    @Test
    public void testUbuntuSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Ubuntu.html", Conf.ubuntuVersionParserConfiguration, "14.10");
    }

    @Test
    public void testNginxSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Nginx.html", Conf.nginxVersionParserConfiguration, "1.7.11");
    }

    @Test
    public void testElasticsearchSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Elasticsearch.html", Conf.elasticsearchVersionParserConfiguration, "1.5.0");
    }

    @Test
    public void testLogstashSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Logstash.html", Conf.logstashVersionParserConfiguration, "1.4.2");
    }

    @Test
    public void testKibanaSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Kibana.html", Conf.kibanaVersionParserConfiguration, "4.0.1");
    }

    @Test
    public void testLogstashForwarderSimpleVersionParser() throws Exception {
        testSimpleVersionParser("LogstashForwarder.html", Conf.logstashForwarderVersionParserConfiguration, "0.4.0");
    }

    @Test
    public void testOpensslSimpleVersionParser() throws Exception {
        testSimpleVersionParser("OpenSSL.html", Conf.opensslVersionParserConfiguration, "1.0.2a");
    }

    @Test
    public void testOpensshSimpleVersionParser() throws Exception {
        testSimpleVersionParser("OpenSSH.html", Conf.opensshVersionParserConfiguration, "6.8");
    }

    @Test
    public void testZabbixSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Zabbix.html", Conf.zabbixVersionParserConfiguration, "2.4");
    }

    @Test
    public void testNagiosSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Nagios.html", Conf.nagiosVersionParserConfiguration, "XI");
    }

    @Test
    public void testCoberturaSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Cobertura.html", Conf.coberturaVersionParserConfiguration, "2.1.1");
    }

    @Test
    public void testGatlingSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Gatling.html", Conf.gatlingVersionParserConfiguration, "2.1.4");
    }

    @Test
    public void testScalaSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Scala.html", Conf.scalaVersionParserConfiguration, "2.11.6");
    }

    @Test
    public void testSeleniumSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Selenium.html", Conf.seleniumVersionParserConfiguration, "2.45.0");
    }

    @Test
    public void testVirtualboxSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Virtualbox.html", Conf.virtualboxVersionParserConfiguration, "4.3.26");
    }

    @Test
    public void testWindowsSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Windows.html", Conf.windowsVersionParserConfiguration, "6.3.9600");
    }

    @Test
    public void testCentosSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Centos.html", Conf.centosVersionParserConfiguration, "7.1503");
    }

    @Test
    public void testFedoraSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Fedora.html", Conf.fedoraVersionParserConfiguration, "21");
    }

    @Test
    public void testProxmoxSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Proxmox.html", Conf.proxmoxVersionParserConfiguration, "3.4-3f2d890e-1");
    }

    @Test
    public void testSqliteSimpleVersionParser() throws Exception {
        testSimpleVersionParser("SQLite.html", Conf.sqliteVersionParserConfiguration, "3.8.9");
    }

    @Test
    public void testGruntSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Grunt.html", Conf.gruntVersionParserConfiguration, "0.4.5");
    }
}
