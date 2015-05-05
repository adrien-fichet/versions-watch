package main;

import parsers.VersionParserConfiguration;

import java.util.HashMap;
import java.util.Map;

public class Conf {
    private Map<String, VersionParserConfiguration> configurations;
    
    public Conf() {
        configurations = new HashMap<String, VersionParserConfiguration>();
        configurations.put("git", new VersionParserConfiguration(
                "http://git-scm.com/",
                "span.version"
        ));
        configurations.put("apache", new VersionParserConfiguration(
                "https://httpd.apache.org/download.cgi",
                "#apcontents ul:eq(5)",
                "(.*?) \\(released"
        ));
        configurations.put("debian", new VersionParserConfiguration(
                "https://www.debian.org/releases/",
                "#content dl dd:eq(1) p:eq(2)",
                "its latest update, version (.*), was released"
        ));
        configurations.put("subversion", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/Apache_Subversion",
                ".infobox tr:eq(4)",
                "Stable release (.*?) \\("
        ));
        configurations.put("eclipse", new VersionParserConfiguration(
                "http://www.eclipse.org/downloads",
                "#descriptionText",
                "Eclipse .* \\((.*?)\\) Release"
        ));
        configurations.put("mysql", new VersionParserConfiguration(
                "https://dev.mysql.com/doc/",
                "#rowid-0 > td:nth-child(2)"
        ));
        configurations.put("jenkins", new VersionParserConfiguration(
                "https://jenkins-ci.org",
                "#release > dl > dd:nth-child(2) > div:nth-child(1) > a > strong",
                "Latest and greatest \\((.*)\\)"
        ));
        configurations.put("puppet", new VersionParserConfiguration(
                "http://docs.puppetlabs.com/references/stable/",
                "#content > div > div > div h1",
                "(.*?) References"
        ));
        configurations.put("netbeans", new VersionParserConfiguration(
                "https://netbeans.org/community/releases/roadmap.html",
                "#middle > table > tbody > tr > td:nth-child(1) > div.f-page-auto-cell > center > table > tbody > tr:nth-child(4) > td:nth-child(1)"
        ));
        configurations.put("php", new VersionParserConfiguration(
                "https://php.net/downloads.php",
                "#layout-content",
                "Current Stable PHP (.*?) \\(Changelog\\)"
        ));
        configurations.put("tomcat", new VersionParserConfiguration(
                "https://tomcat.apache.org/whichversion.html",
                "#content > div:nth-child(3) > table > tbody > tr:nth-child(3) > td:nth-child(6)"
        ));
        configurations.put("sublimetext", new VersionParserConfiguration(
                "https://www.sublimetext.com/",
                "#download-container > p",
                "Version (.*?), "
        ));
        configurations.put("javase", new VersionParserConfiguration(
                "http://www.oracle.com/technetwork/java/javase/downloads/index.html",
                "#javasejdk > a",
                "Java SE (.*)"
        ));
        configurations.put("junit", new VersionParserConfiguration(
                "http://junit.org/",
                "#projectVersion",
                "Version: (.*)"
        ));
        configurations.put("vagrant", new VersionParserConfiguration(
                "https://www.vagrantup.com/downloads.html",
                ".description > p",
                "the latest version of Vagrant \\((.*?)\\)."
        ));
        configurations.put("extjs", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/Ext_JS",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(3) > td",
                "(.*?) / "
        ));
        configurations.put("maven", new VersionParserConfiguration(
                "https://maven.apache.org/download.cgi",
                "#contentBox > div > h2",
                "Download Apache Maven (.*)"
        ));
        configurations.put("hibernate", new VersionParserConfiguration(
                "http://hibernate.org/orm/downloads/",
                "#content > div.row-fluid > div.span10 > div.release-bottons.visible-desktop > div > a.btn.btn-large.btn-success",
                "stable (.*?)\\.Final"
        ));
        configurations.put("javascript", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/JavaScript",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(6) > td",
                "(.*?)(\\[[0-9]*\\])? / "
        ));
        configurations.put("ubuntu", new VersionParserConfiguration(
                "http://www.ubuntu.com/download/desktop",
                "#main-content > div.row.row-grey > div > div > div.eight-col.no-margin-bottom > h2",
                "Ubuntu (.*)"
        ));
        configurations.put("nginx", new VersionParserConfiguration(
                "http://nginx.org/en/download.html",
                "#content > table:nth-child(3) > tbody > tr > td:nth-child(2) > a:nth-child(1)",
                "nginx-(.*)"
        ));
        configurations.put("elasticsearch", new VersionParserConfiguration(
                "https://www.elastic.co/downloads/elasticsearch",
                "#main-wrapper > div > div > div > header:nth-child(1) > h2",
                "Elasticsearch (.*)"
        ));
        configurations.put("logstash", new VersionParserConfiguration(
                "https://www.elastic.co/downloads/logstash",
                "#main-wrapper > div > div > div:nth-child(1) > header:nth-child(1) > h2",
                "Logstash (.*)"
        ));
        configurations.put("kibana", new VersionParserConfiguration(
                "https://www.elastic.co/downloads/kibana",
                "#main-wrapper > div > div > div > header:nth-child(1) > h2",
                "Kibana (.*)"
        ));
        configurations.put("logstashforwarder", new VersionParserConfiguration(
                "https://github.com/elastic/logstash-forwarder/releases",
                "#js-repo-pjax-container > div.release-timeline > ul > li > .main",
                "v(.*?) "
        ));
        configurations.put("openssl", new VersionParserConfiguration(
                "https://www.openssl.org/source/",
                "body > table > tbody > tr:nth-child(3) > td:nth-child(3) > pre",
                "openssl-(.*?).tar.gz \\(MD5\\) \\(SHA1\\) \\(PGP sign\\)  \\[LATEST\\]"
        ));
        configurations.put("openssh", new VersionParserConfiguration(
                "http://www.openssh.com/",
                "body > table > tbody > tr:nth-child(1) > td:nth-child(3) > center:nth-child(3) > font > a",
                "OpenSSH (.*)"
        ));
        configurations.put("zabbix", new VersionParserConfiguration(
                "http://www.zabbix.com/download.php",
                "#content > div > table:nth-child(2) > tbody > tr:nth-child(2) > td:nth-child(1)",
                "Zabbix (.*)"
        ));
        configurations.put("nagios", new VersionParserConfiguration(
                "http://www.nagios.com/products/",
                "#component > div > div > table:nth-child(2) > tbody > tr > td > h2:nth-child(5)",
                "Nagios (.*)"
        ));
        configurations.put("cobertura", new VersionParserConfiguration(
                "https://cobertura.github.io/cobertura/",
                "#main_content > h3",
                "Cobertura (.*)"
        ));
        configurations.put("gatling", new VersionParserConfiguration(
                "http://gatling.io/views/docs.html",
                "h1",
                "Latest release : Gatling (.*)"
        ));
        configurations.put("scala", new VersionParserConfiguration(
                "http://www.scala-lang.org/",
                "body > div.container.central > div.central-btn.scala-version",
                "Scala (.*)"
        ));
        configurations.put("selenium", new VersionParserConfiguration(
                "http://www.seleniumhq.org/download/",
                "#mainContent > p:nth-child(5) > a"
        ));
        configurations.put("virtualbox", new VersionParserConfiguration(
                "https://www.virtualbox.org/wiki/Downloads",
                "#wikipage > ul:nth-child(5) > li > ul > li:nth-child(3) > strong > a",
                "VirtualBox (.*?) for Linux hosts"
        ));
        configurations.put("windows", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/Microsoft_Windows",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(8) > td",
                "(.*?) \\("
        ));
        configurations.put("centos", new VersionParserConfiguration(
                "http://wiki.centos.org/Download",
                "#content > div:nth-child(14) > table > tbody > tr:nth-child(2) > td:nth-child(2)",
                null,
                new String[][]{{" \\(", "."}, {"\\)", ""}}
        ));
        configurations.put("fedora", new VersionParserConfiguration(
                "https://getfedora.org/en/workstation/download/",
                "#head > div > div > div > h2",
                "Download Fedora (.*?) Workstation"
        ));
        configurations.put("proxmox", new VersionParserConfiguration(
                "http://www.proxmox.com/en/downloads/category/iso-images-pve",
                "#yoo-zoo > div.items > div.row.first-row > div.width50.first-cell > div > ul > li",
                "Version: (.*)"
        ));
        configurations.put("sqlite", new VersionParserConfiguration(
                "https://www.sqlite.org/",
                "body > div > table:nth-child(6) > tbody > tr > td:nth-child(5) > ul:nth-child(3) > li > a",
                "Version (.*)"
        ));
        configurations.put("grunt", new VersionParserConfiguration(
                "http://gruntjs.com/",
                "body > div.content > div > div > div.span3 > div > div.latest-version > ul > li:nth-child(1) > a",
                "v(.*)"
        ));
        configurations.put("emacs", new VersionParserConfiguration(
                "https://www.gnu.org/software/emacs/",
                "#content > p:nth-child(7) > b",
                "The current stable release is (.*)"
        ));
        configurations.put("python", new VersionParserConfiguration(
                "https://www.python.org/downloads/",
                "#touchnav-wrapper > header > div > div.header-banner > div > div.download-os-source > p > a:nth-child(1)",
                "Download Python (.*)"
        ));
        configurations.put("vim", new VersionParserConfiguration(
                "http://www.vim.org/",
                "body > table:nth-child(2) > tbody > tr > td:nth-child(3) > table > tbody > tr > td > table:nth-child(1) > tbody > tr > td:nth-child(2) > small",
                "Vim (.*?) is the current version"
        ));
        configurations.put("awesome", new VersionParserConfiguration(
                "http://awesome.naquadah.org/download/",
                "#left > p:nth-child(3)",
                "Latest stable version of awesome is version (.*?) "
        ));
        configurations.put("i3", new VersionParserConfiguration(
                "https://i3wm.org/",
                "#download > a",
                "Download the latest version (.*)"
        ));
        configurations.put("linux", new VersionParserConfiguration(
                "https://www.kernel.org/",
                "#latest_link > a"
        ));
        configurations.put("xfce", new VersionParserConfiguration(
                "http://www.xfce.org/download",
                "#stable",
                "Stable release (.*)"
        ));
        configurations.put("elasticdump", new VersionParserConfiguration(
                "https://www.npmjs.com/package/elasticdump",
                "body > div.container.content > div.sidebar > ul:nth-child(2) > li:nth-child(2) > strong"
        ));
        configurations.put("solr", new VersionParserConfiguration(
                "https://lucene.apache.org/index.html",
                "#sidebar > div:nth-child(5)",
                "Apache Solr (.*)"
        ));
    }

    public Map<String, VersionParserConfiguration> getConfigurations() {
        return configurations;
    }
}
