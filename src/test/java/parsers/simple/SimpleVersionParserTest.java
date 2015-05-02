package parsers.simple;

import main.Conf;
import org.junit.Test;
import parsers.ExpectedVersions;
import parsers.VersionParserConfiguration;

import static org.junit.Assert.assertEquals;

public class SimpleVersionParserTest {

    public void testSimpleVersionParser(String testFileName, VersionParserConfiguration conf, String expectedVersion) throws Exception {
        String documentOrigin = getClass().getResource("/parsers/simple/" + testFileName).getPath();
        SimpleVersionParser simpleVersionParser = new FakeSimpleVersionParser(conf, documentOrigin);
        assertEquals(expectedVersion, simpleVersionParser.parseVersion());
    }

    @Test
    public void testApacheSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Apache.html", Conf.apacheVersionParserConfiguration, ExpectedVersions.apacheVersion);
    }

    @Test
    public void testDebianSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Debian.html", Conf.debianVersionParserConfiguration, ExpectedVersions.debianVersion);
    }

    @Test
    public void testEclipseSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Eclipse.html", Conf.eclipseVersionParserConfiguration, ExpectedVersions.eclipseVersion);
    }

    @Test
    public void testGitSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Git.html", Conf.gitVersionParserConfiguration, ExpectedVersions.gitVersion);
    }

    @Test
    public void testJavaSimpleVersionParser() throws Exception {
        testSimpleVersionParser("JavaSE.html", Conf.javaVersionParserConfiguration, ExpectedVersions.javaVersion);
    }

    @Test
    public void testJenkinsSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Jenkins.html", Conf.jenkinsVersionParserConfiguration, ExpectedVersions.jenkinsVersion);
    }

    @Test
    public void testMysqlSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Mysql.html", Conf.mysqlVersionParserConfiguration, ExpectedVersions.mysqlVersion);
    }

    @Test
    public void testNetbeansSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Netbeans.html", Conf.netbeansVersionParserConfiguration, ExpectedVersions.netbeansVersion);
    }

    @Test
    public void testPhpSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Php.html", Conf.phpVersionParserConfiguration, ExpectedVersions.phpVersion);
    }

    @Test
    public void testPuppetSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Puppet.html", Conf.puppetVersionParserConfiguration, ExpectedVersions.puppetVersion);
    }

    @Test
    public void testSublimeTextSimpleVersionParser() throws Exception {
        testSimpleVersionParser("SublimeText.html", Conf.sublimeTextVersionParserConfiguration, ExpectedVersions.sublimeTextVersion);
    }

    @Test
    public void testSubversionSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Subversion.html", Conf.subversionVersionParserConfiguration, ExpectedVersions.subversionVersion);
    }

    @Test
    public void testTomcatSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Tomcat.html", Conf.tomcatVersionParserConfiguration, ExpectedVersions.tomcatVersion);
    }

    @Test
    public void testJunitSimpleVersionParser() throws Exception {
        testSimpleVersionParser("JUnit.html", Conf.junitVersionParserConfiguration, ExpectedVersions.junitVersion);
    }

    @Test
    public void testVagrantSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Vagrant.html", Conf.vagrantVersionParserConfiguration, ExpectedVersions.vagrantVersion);
    }

    @Test
    public void testExtjsSimpleVersionParser() throws Exception {
        testSimpleVersionParser("ExtJS.html", Conf.extjsVersionParserConfiguration, ExpectedVersions.extjsVersion);
    }

    @Test
    public void testMavenSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Maven.html", Conf.mavenVersionParserConfiguration, ExpectedVersions.mavenVersion);
    }

    @Test
    public void testHibernateSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Hibernate.html", Conf.hibernateVersionParserConfiguration, ExpectedVersions.hibernateVersion);
    }

    @Test
    public void testJavascriptSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Javascript.html", Conf.javascriptVersionParserConfiguration, ExpectedVersions.javascriptVersion);
    }

    @Test
    public void testUbuntuSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Ubuntu.html", Conf.ubuntuVersionParserConfiguration, ExpectedVersions.ubuntuVersion);
    }

    @Test
    public void testNginxSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Nginx.html", Conf.nginxVersionParserConfiguration, ExpectedVersions.nginxVersion);
    }

    @Test
    public void testElasticsearchSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Elasticsearch.html", Conf.elasticsearchVersionParserConfiguration, ExpectedVersions.elasticsearchVersion);
    }

    @Test
    public void testLogstashSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Logstash.html", Conf.logstashVersionParserConfiguration, ExpectedVersions.logstashVersion);
    }

    @Test
    public void testKibanaSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Kibana.html", Conf.kibanaVersionParserConfiguration, ExpectedVersions.kibanaVersion);
    }

    @Test
    public void testLogstashForwarderSimpleVersionParser() throws Exception {
        testSimpleVersionParser("LogstashForwarder.html", Conf.logstashForwarderVersionParserConfiguration, ExpectedVersions.logstashforwarderVersion);
    }

    @Test
    public void testOpensslSimpleVersionParser() throws Exception {
        testSimpleVersionParser("OpenSSL.html", Conf.opensslVersionParserConfiguration, ExpectedVersions.opensslVersion);
    }

    @Test
    public void testOpensshSimpleVersionParser() throws Exception {
        testSimpleVersionParser("OpenSSH.html", Conf.opensshVersionParserConfiguration, ExpectedVersions.opensshVersion);
    }

    @Test
    public void testZabbixSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Zabbix.html", Conf.zabbixVersionParserConfiguration, ExpectedVersions.zabbixVersion);
    }

    @Test
    public void testNagiosSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Nagios.html", Conf.nagiosVersionParserConfiguration, ExpectedVersions.nagiosVersion);
    }

    @Test
    public void testCoberturaSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Cobertura.html", Conf.coberturaVersionParserConfiguration, ExpectedVersions.coberturaVersion);
    }

    @Test
    public void testGatlingSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Gatling.html", Conf.gatlingVersionParserConfiguration, ExpectedVersions.gatlingVersion);
    }

    @Test
    public void testScalaSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Scala.html", Conf.scalaVersionParserConfiguration, ExpectedVersions.scalaVersion);
    }

    @Test
    public void testSeleniumSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Selenium.html", Conf.seleniumVersionParserConfiguration, ExpectedVersions.seleniumVersion);
    }

    @Test
    public void testVirtualboxSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Virtualbox.html", Conf.virtualboxVersionParserConfiguration, ExpectedVersions.virtualboxVersion);
    }

    @Test
    public void testWindowsSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Windows.html", Conf.windowsVersionParserConfiguration, ExpectedVersions.windowsVersion);
    }

    @Test
    public void testCentosSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Centos.html", Conf.centosVersionParserConfiguration, ExpectedVersions.centosVersion);
    }

    @Test
    public void testFedoraSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Fedora.html", Conf.fedoraVersionParserConfiguration, ExpectedVersions.fedoraVersion);
    }

    @Test
    public void testProxmoxSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Proxmox.html", Conf.proxmoxVersionParserConfiguration, ExpectedVersions.proxmoxVersion);
    }

    @Test
    public void testSqliteSimpleVersionParser() throws Exception {
        testSimpleVersionParser("SQLite.html", Conf.sqliteVersionParserConfiguration, ExpectedVersions.sqliteVersion);
    }

    @Test
    public void testGruntSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Grunt.html", Conf.gruntVersionParserConfiguration, ExpectedVersions.gruntVersion);
    }

    @Test
    public void testEmacsSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Emacs.html", Conf.emacsVersionParserConfiguration, ExpectedVersions.emacsVersion);
    }

    @Test
    public void testPythonSimpleVersionParser() throws Exception {
        testSimpleVersionParser("Python.html", Conf.pythonVersionParserConfiguration, ExpectedVersions.pythonVersion);
    }
}
