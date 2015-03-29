package parsers;

public class VersionParserConfiguration {
    private String url;
    private String cssSelector;
    private String[][] replacements;
    private String extractorRegex;

    public VersionParserConfiguration(String url, String cssSelector, String[][] replacements, String extractorRegex) {
        this.url = url;
        this.cssSelector = cssSelector;
        this.replacements = replacements;
        this.extractorRegex = extractorRegex;
    }

    public String getUrl() {
        return url;
    }

    public String getCssSelector() {
        return cssSelector;
    }

    public String[][] getReplacements() {
        return replacements;
    }

    public String getExtractorRegex() {
        return extractorRegex;
    }
}
