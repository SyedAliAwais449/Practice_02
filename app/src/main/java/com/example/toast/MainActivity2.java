package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ArrayList<String> arrayList;
    ListView listView;
    ArrayAdapter<String> adapter;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText= findViewById(R.id.editTextTextPersonName);
        listView= findViewById(R.id.listView);
        arrayList= new ArrayList<String>();
        arrayList.add("Ali");
        arrayList.add("Saad");
        arrayList.add("Haseeb");
        arrayList.add("Ahmad");
        adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);
    }
    public void onClick5(View v){
        if(editText.getText().toString()!= null){
            arrayList.add(editText.getText().toString());
            adapter.notifyDataSetChanged();
        }
    }
}