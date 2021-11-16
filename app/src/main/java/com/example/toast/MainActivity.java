package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[]labels;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= findViewById(R.id.textView2);
        Resources res= getResources();
        labels= res.getStringArray(R.array.headings);
        textView.setText(labels[1]);
    }

    public void Toast(View v){
        Toast toast = Toast.makeText(this, "Hi! I'm toast", Toast.LENGTH_SHORT);
        toast.show();
        AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Best Laptop in the world");
        builder.setTitle("Alert!!");
        builder.setCancelable(true);
        builder.setPositiveButton("Close",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog= builder.create();
        alertDialog.show();
//        LayoutInflater layoutInflater= getLayoutInflater();
//        View myLayout=layoutInflater.inflate(R.layout.customlayout,(ViewGroup)findViewById(R.id.layout));
//        Toast myToast=new Toast(getApplicationContext());
//
//        myToast.setDuration(Toast.LENGTH_LONG);
//
//        myToast.setView(myLayout);
//
//        myToast.show();
    }
}