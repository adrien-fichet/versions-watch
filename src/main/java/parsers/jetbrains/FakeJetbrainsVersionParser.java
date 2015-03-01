package parsers.jetbrains;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FakeJetbrainsVersionParser extends JetbrainsVersionsParser {
    private String documentOrigin;

    public FakeJetbrainsVersionParser(String documentOrigin) {
        this.documentOrigin = documentOrigin;
    }

    @Override
    public String loadDocument() throws IOException {
        return new String(Files.readAllBytes(Paths.get(documentOrigin)), StandardCharsets.UTF_8);
    }
}
