package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity2 extends AppCompatActivity {
    ArrayList<String> arrayList;
    ListView listView;
    MyAdapterList adapter;
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
        arrayList.add("Babar");
        Collections.sort(arrayList);
        adapter= new MyAdapterList(this,arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity2.this, arrayList.get(position), Toast.LENGTH_SHORT).show();

            }
        });
    }
    public void onClick5(View v){
        if(!editText.getText().toString().equals("")){
            arrayList.add(editText.getText().toString());
            adapter.notifyDataSetChanged();
        }
    }

}