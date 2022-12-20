package com.nada.files;

import android.os.Environment;

public class Path {
    //       /storage/emulated/0/
    public static String internalStoragePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/";
}
