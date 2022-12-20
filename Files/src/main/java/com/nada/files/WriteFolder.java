package com.nada.files;

import java.io.File;

public class WriteFolder {

    public static void writeFolder(String path) {
        File root = new File(path);
        if (!root.exists()) {
            root.mkdirs();
        }
    }
}
