package parsers;

public class VersionParserConfiguration {
    private String url;
    private String cssSelector;
    private String extractorRegex;
    private String[][] replacements = null;

    public VersionParserConfiguration(String url, String cssSelector, String extractorRegex) {
        this.url = url;
        this.cssSelector = cssSelector;
        this.extractorRegex = extractorRegex;
    }

    public VersionParserConfiguration(String url, String cssSelector, String extractorRegex, String[][] replacements) {
        this.url = url;
        this.cssSelector = cssSelector;
        this.extractorRegex = extractorRegex;
        this.replacements = replacements;
    }

    public String getUrl() {
        return url;
    }

    public String getCssSelector() {
        return cssSelector;
    }

    public String getExtractorRegex() {
        return extractorRegex;
    }

    public String[][] getReplacements() {
        return replacements;
    }
}
