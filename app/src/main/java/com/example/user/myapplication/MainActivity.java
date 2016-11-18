package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.ksoap2.serialization.SoapObject;

public class MainActivity extends AppCompatActivity {

    private static String NAMESPACE = "http://tempuri.org/";
    private static String METHOD_NAME = "HelloWorld";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SoapObject request = new SoapObject();

    }
}
