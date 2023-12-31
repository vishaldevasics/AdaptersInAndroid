package com.maverickallies.adaptersinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        1-> Adapter view
        listView = findViewById(R.id.listViewID);

//        2->DataSource
        String[] DataSource = {"India","America","Russia","Israel","Africa","Australia"};

//        3-> Adapter: Acts as a bridge between the data source and the adapterView.

//        ArrayAdapter<String> adapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_list_item_1,
//                DataSource
//        );
////        Link Listview with Adapter
//        listView.setAdapter(adapter);

        MyCustomAdapter adapter = new MyCustomAdapter(this,DataSource);
        listView.setAdapter(adapter);
    }
}