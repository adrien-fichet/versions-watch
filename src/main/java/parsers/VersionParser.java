package parsers;

public abstract class VersionParser {
    public final static String UNKNOWN_VERSION = "Unknown";
    public abstract String parseVersion();
}
