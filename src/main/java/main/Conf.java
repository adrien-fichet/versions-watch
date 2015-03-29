package main;

import parsers.VersionParserConfiguration;

public class Conf {
    public static VersionParserConfiguration gitVersionParserConfiguration = new VersionParserConfiguration(
            "http://git-scm.com/",
            "span.version",
            null,
            null
    );
    public static VersionParserConfiguration apacheVersionParserConfiguration = new VersionParserConfiguration(
            "https://httpd.apache.org/download.cgi",
            "#apcontents ul:eq(5)",
            new String[][]{{" (.*)", ""}},
            null
    );
    public static VersionParserConfiguration debianVersionParserConfiguration = new VersionParserConfiguration(
            "https://www.debian.org/releases/",
            "#content dl dd:eq(1) p:eq(2)",
            null,
            "its latest update, version (.*), was released"
    );
    public static VersionParserConfiguration subversionVersionParserConfiguration = new VersionParserConfiguration(
            "https://en.wikipedia.org/wiki/Apache_Subversion",
            ".infobox tr:eq(4)",
            null,
            "Stable release (.*?) \\("
    );
    public static VersionParserConfiguration eclipseVersionParserConfiguration = new VersionParserConfiguration(
            "http://www.eclipse.org/downloads",
            "#descriptionText",
            new String[][]{{" Release", ""}, {"Eclipse ", ""}},
            null
    );
    public static VersionParserConfiguration mysqlVersionParserConfiguration = new VersionParserConfiguration(
            "https://dev.mysql.com/doc",
            "#rowid-0 > td:nth-child(2)",
            null,
            null
    );
    public static VersionParserConfiguration jenkinsVersionParserConfiguration = new VersionParserConfiguration(
            "https://jenkins-ci.org",
            "#release > dl > dd:nth-child(2) > div:nth-child(1) > a > strong",
            new String[][]{{"Latest and greatest \\(", ""}, {"\\)", ""}},
            null
    );
    public static VersionParserConfiguration puppetVersionParserConfiguration = new VersionParserConfiguration(
            "http://docs.puppetlabs.com/references/stable/",
            "#content > div > div > div h1",
            new String[][]{{" References", ""}},
            null
    );
    public static VersionParserConfiguration netbeansVersionParserConfiguration = new VersionParserConfiguration(
            "https://netbeans.org/community/releases/roadmap.html",
            "#middle > table > tbody > tr > td:nth-child(1) > div.f-page-auto-cell > center > table > tbody > tr:nth-child(4) > td:nth-child(1)",
            null,
            null
    );
    public static VersionParserConfiguration phpVersionParserConfiguration = new VersionParserConfiguration(
            "https://php.net/downloads.php",
            "#layout-content",
            null,
            "Current Stable PHP (.*?) \\(Changelog\\)"
    );
    public static VersionParserConfiguration tomcatVersionParserConfiguration = new VersionParserConfiguration(
            "https://tomcat.apache.org/whichversion.html",
            "#content > div:nth-child(3) > table > tbody > tr:nth-child(3) > td:nth-child(6)",
            null,
            null
    );
}
