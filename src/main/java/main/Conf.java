package main;

import parsers.VersionParserConfiguration;

public class Conf {
    public static VersionParserConfiguration gitVersionParserConfiguration = new VersionParserConfiguration(
            "http://git-scm.com/",
            "span.version",
            null
    );
    public static VersionParserConfiguration apacheVersionParserConfiguration = new VersionParserConfiguration(
            "https://httpd.apache.org/download.cgi",
            "#apcontents ul:eq(5)",
            "(.*?) \\(released"
    );
    public static VersionParserConfiguration debianVersionParserConfiguration = new VersionParserConfiguration(
            "https://www.debian.org/releases/",
            "#content dl dd:eq(1) p:eq(2)",
            "its latest update, version (.*), was released"
    );
    public static VersionParserConfiguration subversionVersionParserConfiguration = new VersionParserConfiguration(
            "https://en.wikipedia.org/wiki/Apache_Subversion",
            ".infobox tr:eq(4)",
            "Stable release (.*?) \\("
    );
    public static VersionParserConfiguration eclipseVersionParserConfiguration = new VersionParserConfiguration(
            "http://www.eclipse.org/downloads",
            "#descriptionText",
            "Eclipse .* \\((.*?)\\) Release"
    );
    public static VersionParserConfiguration mysqlVersionParserConfiguration = new VersionParserConfiguration(
            "https://dev.mysql.com/doc",
            "#rowid-0 > td:nth-child(2)",
            null
    );
    public static VersionParserConfiguration jenkinsVersionParserConfiguration = new VersionParserConfiguration(
            "https://jenkins-ci.org",
            "#release > dl > dd:nth-child(2) > div:nth-child(1) > a > strong",
            "Latest and greatest \\((.*)\\)"
    );
    public static VersionParserConfiguration puppetVersionParserConfiguration = new VersionParserConfiguration(
            "http://docs.puppetlabs.com/references/stable/",
            "#content > div > div > div h1",
            "(.*?) References"
    );
    public static VersionParserConfiguration netbeansVersionParserConfiguration = new VersionParserConfiguration(
            "https://netbeans.org/community/releases/roadmap.html",
            "#middle > table > tbody > tr > td:nth-child(1) > div.f-page-auto-cell > center > table > tbody > tr:nth-child(4) > td:nth-child(1)",
            null
    );
    public static VersionParserConfiguration phpVersionParserConfiguration = new VersionParserConfiguration(
            "https://php.net/downloads.php",
            "#layout-content",
            "Current Stable PHP (.*?) \\(Changelog\\)"
    );
    public static VersionParserConfiguration tomcatVersionParserConfiguration = new VersionParserConfiguration(
            "https://tomcat.apache.org/whichversion.html",
            "#content > div:nth-child(3) > table > tbody > tr:nth-child(3) > td:nth-child(6)",
            null
    );
    public static VersionParserConfiguration sublimeTextVersionParserConfiguration = new VersionParserConfiguration(
            "https://www.sublimetext.com/",
            "#download-container > p",
            "Version (.*?), "
    );
    public static VersionParserConfiguration javaVersionParserConfiguration = new VersionParserConfiguration(
            "http://www.oracle.com/technetwork/java/javase/downloads/index.html",
            "#javasejdk > a",
            "Java SE (.*)"
    );
    public static VersionParserConfiguration junitVersionParserConfiguration = new VersionParserConfiguration(
            "http://junit.org/",
            "#projectVersion",
            "Version: (.*)"
    );
    public static VersionParserConfiguration vagrantVersionParserConfiguration = new VersionParserConfiguration(
            "https://www.vagrantup.com/downloads.html",
            ".description > p",
            "the latest version of Vagrant \\((.*?)\\)."
    );
    public static VersionParserConfiguration extjsVersionParserConfiguration = new VersionParserConfiguration(
            "https://en.wikipedia.org/wiki/Ext_JS",
            "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(3) > td",
            "(.*?) / "
    );
    public static VersionParserConfiguration mavenVersionParserConfiguration = new VersionParserConfiguration(
            "https://maven.apache.org/download.cgi",
            "#contentBox > div > h2",
            "Download Apache Maven (.*)"
    );
    public static VersionParserConfiguration hibernateVersionParserConfiguration = new VersionParserConfiguration(
            "http://hibernate.org/orm/downloads/",
            "#content > div.row-fluid > div.span10 > div:nth-child(4) > div > dl:nth-child(2) > dt",
            "(.*?)\\.Final"
    );
    public static VersionParserConfiguration javascriptVersionParserConfiguration = new VersionParserConfiguration(
            "https://en.wikipedia.org/wiki/JavaScript",
            "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(6) > td",
            "(.*?)(\\[[0-9]*\\])? / "
    );
    public static VersionParserConfiguration ubuntuVersionParserConfiguration = new VersionParserConfiguration(
            "http://www.ubuntu.com/download/desktop",
            "#main-content > div.row.row-grey > div > div > div.eight-col.no-margin-bottom > h2",
            "Ubuntu (.*)"
    );
    public static VersionParserConfiguration nginxVersionParserConfiguration = new VersionParserConfiguration(
            "http://nginx.org/en/download.html",
            "#content > table:nth-child(3) > tbody > tr > td:nth-child(2) > a:nth-child(1)",
            "nginx-(.*)"
    );
    public static VersionParserConfiguration elasticsearchVersionParserConfiguration = new VersionParserConfiguration(
            "https://www.elastic.co/downloads/elasticsearch",
            "#main-wrapper > div > div > div > header:nth-child(1) > h2",
            "Elasticsearch (.*)"
    );
    public static VersionParserConfiguration logstashVersionParserConfiguration = new VersionParserConfiguration(
            "https://www.elastic.co/downloads/logstash",
            "#main-wrapper > div > div > div:nth-child(1) > header:nth-child(1) > h2",
            "Logstash (.*)"
    );
    public static VersionParserConfiguration kibanaVersionParserConfiguration = new VersionParserConfiguration(
            "https://www.elastic.co/downloads/kibana",
            "#main-wrapper > div > div > div > header:nth-child(1) > h2",
            "Kibana (.*)"
    );
    public static VersionParserConfiguration logstashForwarderVersionParserConfiguration = new VersionParserConfiguration(
            "https://github.com/elastic/logstash-forwarder/releases",
            "#js-repo-pjax-container > div.release-timeline > ul > li > .main",
            "v(.*?) "
    );
    public static VersionParserConfiguration opensslVersionParserConfiguration = new VersionParserConfiguration(
            "https://www.openssl.org/source/",
            "body > table > tbody > tr:nth-child(3) > td:nth-child(3) > pre",
            "openssl-(.*?).tar.gz \\(MD5\\) \\(SHA1\\) \\(PGP sign\\)  \\[LATEST\\]"
    );
    public static VersionParserConfiguration opensshVersionParserConfiguration = new VersionParserConfiguration(
            "http://www.openssh.com/",
            "body > table > tbody > tr:nth-child(1) > td:nth-child(3) > center:nth-child(3) > font > a",
            "OpenSSH (.*)"
    );
    public static VersionParserConfiguration zabbixVersionParserConfiguration = new VersionParserConfiguration(
            "http://www.zabbix.com/download.php",
            "#content > div > table:nth-child(2) > tbody > tr:nth-child(2) > td:nth-child(1)",
            "Zabbix (.*)"
    );
    public static VersionParserConfiguration nagiosVersionParserConfiguration = new VersionParserConfiguration(
            "http://www.nagios.com/products/",
            "#component > div > div > table:nth-child(2) > tbody > tr > td > h2:nth-child(5)",
            "Nagios (.*)"
    );
    public static VersionParserConfiguration coberturaVersionParserConfiguration = new VersionParserConfiguration(
            "https://cobertura.github.io/cobertura/",
            "#main_content > h3",
            "Cobertura (.*)"
    );
    public static VersionParserConfiguration gatlingVersionParserConfiguration = new VersionParserConfiguration(
            "http://gatling.io/views/docs.html",
            "h1",
            "Latest release : Gatling (.*)"
    );
    public static VersionParserConfiguration scalaVersionParserConfiguration = new VersionParserConfiguration(
            "http://www.scala-lang.org/",
            "body > div.container.central > div.central-btn.scala-version",
            "Scala (.*)"
    );
    public static VersionParserConfiguration seleniumVersionParserConfiguration = new VersionParserConfiguration(
            "http://www.seleniumhq.org/download/",
            "#mainContent > p:nth-child(5) > a",
            null
    );
    public static VersionParserConfiguration virtualboxVersionParserConfiguration = new VersionParserConfiguration(
            "https://www.virtualbox.org/wiki/Downloads",
            "#wikipage > ul:nth-child(5) > li > ul > li:nth-child(3) > strong > a",
            "VirtualBox (.*?) for Linux hosts"
    );
    public static VersionParserConfiguration windowsVersionParserConfiguration = new VersionParserConfiguration(
            "https://en.wikipedia.org/wiki/Microsoft_Windows",
            "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(8) > td",
            "(.*?) \\("
    );
    public static VersionParserConfiguration centosVersionParserConfiguration = new VersionParserConfiguration(
            "http://wiki.centos.org/Download",
            "#content > div:nth-child(14) > table > tbody > tr:nth-child(2) > td:nth-child(2)",
            null,
            new String[][]{{" \\(", "."}, {"\\)", ""}}
    );
}
