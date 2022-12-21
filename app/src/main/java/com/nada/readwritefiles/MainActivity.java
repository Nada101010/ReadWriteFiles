package com.nada.readwritefiles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.Bundle;
import android.os.Environment;

import java.io.File;
import java.util.HashMap;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //WriteFile.writeString(Path.internalStoragePath, "text.txt", "nada");

        //WriteFile.writeByteArray(WriteFile.internalStoragePath, "byte.txt", "nada".getBytes(StandardCharsets.UTF_8));

        // WriteFolder.writeFolder(Path.ExternalStoragePath + "Nada/New");

        /*File[] f = ContextCompat.getExternalFilesDirs(getApplicationContext(),null);

        File ss= Environment.getRootDirectory();
        File[] dd= ss.listFiles();

        File mnt = new File("/root");
        File[] mountFiles = mnt.listFiles();

        File storage = new File("/storage");
        File[] storageFiles = storage.listFiles();

        UsbManager manager = (UsbManager) getSystemService(Context.USB_SERVICE);

        HashMap<String, UsbDevice> deviceList = manager.getDeviceList();
        UsbDevice device = deviceList.get("/dev/bus/usb/001/015");

        String s = device.getDeviceName();

        int i = 0;*/
    }
}