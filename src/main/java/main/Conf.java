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
            "Stable release (.*) \\("
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
}
