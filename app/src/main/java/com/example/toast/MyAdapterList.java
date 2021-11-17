package com.example.toast;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapterList extends ArrayAdapter {
    private final Activity context;
    private final ArrayList<String> name;

    public MyAdapterList(Activity context, ArrayList<String> name){
        super(context,R.layout.customlayout,name);
        this.context=context;
        this.name=name;
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View singleEntityView=inflater.inflate(

                R.layout.customlayout, null,true);
        TextView titleHeading = singleEntityView.findViewById(R.id.textView3);
        titleHeading.setText(name.get(position));
        Log.d("t1", "getView: done");
//        imageView.setImageResource(imgid[position]);
//        titleDetails.setText(subtitle[position]);
        return singleEntityView;
    };
}
