package com.example.admin.contentproviderproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.InvocationTargetException;

public class MainActivity extends AppCompatActivity {

    LocalDataSource<DataModel> dataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DataModelContentProvider contentProvider = getContentResolver().query()

    }
}