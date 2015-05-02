package parsers;

import main.Conf;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestFilesUpdate {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private Path resourcePath;

    public static void main(String[] args) throws Exception {
        TestFilesUpdate testFilesUpdate = new TestFilesUpdate();
        testFilesUpdate.getResourceDirectory();
        testFilesUpdate.updateResourceFiles();
    }

    private void getResourceDirectory() throws IOException {
        resourcePath = Paths.get(getClass().getClassLoader().getResource("").getPath(), "../../src/test/resources/parsers");
    }

    private void updateResourceFiles() throws IOException {
        downloadResourceFile("https://www.jetbrains.com/js2/version.js", "/jetbrains/version.js");
        downloadResourceFile("https://lucene.apache.org/solr/resources.html", "/solr/Solr.html");
        downloadResourceFile("https://spring.io/project_metadata/spring-framework", "/spring/spring.js");
        downloadResourceFile(Conf.apacheVersionParserConfiguration.getUrl(), "/simple/Apache.html");
        downloadResourceFile(Conf.centosVersionParserConfiguration.getUrl(), "/simple/Centos.html");
        downloadResourceFile(Conf.coberturaVersionParserConfiguration.getUrl(), "/simple/Cobertura.html");
        downloadResourceFile(Conf.debianVersionParserConfiguration.getUrl(), "/simple/Debian.html");
        downloadResourceFile(Conf.eclipseVersionParserConfiguration.getUrl(), "/simple/Eclipse.html");
        downloadResourceFile(Conf.elasticsearchVersionParserConfiguration.getUrl(), "/simple/Elasticsearch.html");
        downloadResourceFile(Conf.emacsVersionParserConfiguration.getUrl(), "/simple/Emacs.html");
        downloadResourceFile(Conf.extjsVersionParserConfiguration.getUrl(), "/simple/ExtJS.html");
        downloadResourceFile(Conf.fedoraVersionParserConfiguration.getUrl(), "/simple/Fedora.html");
        downloadResourceFile(Conf.gatlingVersionParserConfiguration.getUrl(), "/simple/Gatling.html");
        downloadResourceFile(Conf.gitVersionParserConfiguration.getUrl(), "/simple/Git.html");
        downloadResourceFile(Conf.gruntVersionParserConfiguration.getUrl(), "/simple/Grunt.html");
        downloadResourceFile(Conf.hibernateVersionParserConfiguration.getUrl(), "/simple/Hibernate.html");
        downloadResourceFile(Conf.javascriptVersionParserConfiguration.getUrl(), "/simple/Javascript.html");
        downloadResourceFile(Conf.javaVersionParserConfiguration.getUrl(), "/simple/JavaSE.html");
        downloadResourceFile(Conf.jenkinsVersionParserConfiguration.getUrl(), "/simple/Jenkins.html");
        downloadResourceFile(Conf.junitVersionParserConfiguration.getUrl(), "/simple/JUnit.html");
        downloadResourceFile(Conf.kibanaVersionParserConfiguration.getUrl(), "/simple/Kibana.html");
        downloadResourceFile(Conf.logstashVersionParserConfiguration.getUrl(), "/simple/Logstash.html");
        downloadResourceFile(Conf.logstashForwarderVersionParserConfiguration.getUrl(), "/simple/LogstashForwarder.html");
        downloadResourceFile(Conf.mavenVersionParserConfiguration.getUrl(), "/simple/Maven.html");
        downloadResourceFile(Conf.mysqlVersionParserConfiguration.getUrl(), "/simple/Mysql.html");
        downloadResourceFile(Conf.nagiosVersionParserConfiguration.getUrl(), "/simple/Nagios.html");
        downloadResourceFile(Conf.netbeansVersionParserConfiguration.getUrl(), "/simple/Netbeans.html");
        downloadResourceFile(Conf.nginxVersionParserConfiguration.getUrl(), "/simple/Nginx.html");
        downloadResourceFile(Conf.opensshVersionParserConfiguration.getUrl(), "/simple/OpenSSH.html");
        downloadResourceFile(Conf.opensslVersionParserConfiguration.getUrl(), "/simple/OpenSSL.html");
        downloadResourceFile(Conf.phpVersionParserConfiguration.getUrl(), "/simple/Php.html");
        downloadResourceFile(Conf.proxmoxVersionParserConfiguration.getUrl(), "/simple/Proxmox.html");
        downloadResourceFile(Conf.puppetVersionParserConfiguration.getUrl(), "/simple/Puppet.html");
        downloadResourceFile(Conf.pythonVersionParserConfiguration.getUrl(), "/simple/Python.html");
        downloadResourceFile(Conf.scalaVersionParserConfiguration.getUrl(), "/simple/Scala.html");
        downloadResourceFile(Conf.seleniumVersionParserConfiguration.getUrl(), "/simple/Selenium.html");
        downloadResourceFile(Conf.sqliteVersionParserConfiguration.getUrl(), "/simple/SQLite.html");
        downloadResourceFile(Conf.sublimeTextVersionParserConfiguration.getUrl(), "/simple/SublimeText.html");
        downloadResourceFile(Conf.subversionVersionParserConfiguration.getUrl(), "/simple/Subversion.html");
        downloadResourceFile(Conf.tomcatVersionParserConfiguration.getUrl(), "/simple/Tomcat.html");
        downloadResourceFile(Conf.ubuntuVersionParserConfiguration.getUrl(), "/simple/Ubuntu.html");
        downloadResourceFile(Conf.vagrantVersionParserConfiguration.getUrl(), "/simple/Vagrant.html");
        downloadResourceFile(Conf.virtualboxVersionParserConfiguration.getUrl(), "/simple/Virtualbox.html");
        downloadResourceFile(Conf.windowsVersionParserConfiguration.getUrl(), "/simple/Windows.html");
        downloadResourceFile(Conf.zabbixVersionParserConfiguration.getUrl(), "/simple/Zabbix.html");
    }

    private void downloadResourceFile(String url, String dest) throws IOException {
        logger.info("Downloading " + url + "...");
        FileUtils.copyURLToFile(new URL(url), new File(resourcePath + dest));
    }
}
