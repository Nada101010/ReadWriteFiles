package com.nada.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class WriteFile {

    public static void writeString(String path, String fileName, String data) {
        try {
            File file = new File(path, fileName);
            FileWriter writer = new FileWriter(file);
            writer.append(data);
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeByteArray(String path, String fileName, byte[] data) {
        File file = new File(path, fileName);
        try {
            FileOutputStream out = new FileOutputStream(file);
            out.write(data);
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
