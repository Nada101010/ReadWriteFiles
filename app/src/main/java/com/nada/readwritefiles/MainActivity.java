package com.nada.readwritefiles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       // WriteFile.writeString(Path.internalStoragePath, "text.txt", "nada");

        //WriteFile.writeByteArray(WriteFile.internalStoragePath, "byte.txt", "nada".getBytes(StandardCharsets.UTF_8));

        // WriteFolder.writeFolder(Path.ExternalStoragePath + "Nada/New");
    }
}