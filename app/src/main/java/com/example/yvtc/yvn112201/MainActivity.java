package com.example.yvtc.yvn112201;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        File f1 = getFilesDir();
        Log.d("FILE", f1.toString());
        File f2 = getCacheDir();
        Log.d("FILE", f2.toString());
        File f3 = getExternalCacheDir();
        Log.d("FILE", f3.toString());
        File f4 = Environment.getExternalStorageDirectory();
        Log.d("FILE", f4.toString());
    }

    public void click1(View v)
    {
        File f1 = getFilesDir();
        File writeFile = new File(f1, "mydata2.txt");
        try {
            // FileOutputStream fos = openFileOutput(writeFile.getAbsolutePath(), MODE_PRIVATE);

            FileWriter fw = new FileWriter(writeFile.getAbsoluteFile());
            fw.write("Hello This is data2");
            fw.flush();
            fw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
