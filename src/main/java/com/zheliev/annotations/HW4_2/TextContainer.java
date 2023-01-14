package com.zheliev.annotations.HW4_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@SaveTo(path = "c:/temp/file.txt")
public class Container {
    String string = "This is saving text";

    public void save (String path) throws IOException{
        FileWriter file = new FileWriter(path);
        try {
            file.write(string);
        }finally {
            file.close();
        }
    }
}
