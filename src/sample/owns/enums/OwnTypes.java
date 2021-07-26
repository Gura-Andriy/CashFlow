package sample.owns.enums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public enum OwnTypes {
//    CAR(1);
;

    private String getName(int lineNumber) throws IOException {
        return Files.lines(Paths.get("sample/languages/ukrainian/OwnTypes")).skip(lineNumber).findFirst().get();
    }
    private String name;
    private OwnTypes(int nameIndex) throws IOException {
        this.name = getName(nameIndex);
    }
}
