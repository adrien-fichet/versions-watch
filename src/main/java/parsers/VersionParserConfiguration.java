package parsers;

public class VersionParserConfiguration {
    private String url;
    private String cssSelector;
    private String extractorRegex;

    public VersionParserConfiguration(String url, String cssSelector, String extractorRegex) {
        this.url = url;
        this.cssSelector = cssSelector;
        this.extractorRegex = extractorRegex;
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
}
