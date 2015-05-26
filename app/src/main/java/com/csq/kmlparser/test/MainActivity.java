package com.csq.kmlparser.test;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;

import com.csq.kmlparser.Kml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Kml kml = new Kml();
        try {
            kml.parser(new FileInputStream(Environment.getExternalStorageDirectory().getAbsoluteFile() + "/lolaage/kmls/a.kml"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if(kml.getFeature() != null){

        }
    }

}
