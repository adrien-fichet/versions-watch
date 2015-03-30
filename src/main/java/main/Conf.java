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
            "Eclipse (.*?) Release"
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
}
