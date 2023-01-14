package com.zheliev.annotations.HW4_2;

import java.io.FileWriter;
import java.io.IOException;

@SaveTo(path = "c:\\temp\\file.txt")
public class TextContainer {
    String string = "This is a saving text";

    @Saver
    public void save (String path) throws IOException{
        try (FileWriter file = new FileWriter(path)) {
            file.write(string);
        }
    }
}
