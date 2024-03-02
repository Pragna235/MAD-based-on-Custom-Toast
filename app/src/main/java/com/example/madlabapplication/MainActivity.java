package com.example.madlabapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    View cv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayoutInflater li = getLayoutInflater();
        cv = li.inflate(R.layout.layout1,findViewById(R.id.ll1));
    }

    public void showToast(View v){
        Toast.makeText(this, "Normal Toast", Toast.LENGTH_SHORT).show();
    }

    public void ChangeTV(View v){
        TextView tv=this.findViewById(R.id.textView);
        tv.setText("Android Project");
    }

    public void showCustomToast(View v){
        Toast tv = new Toast(this);
        tv.setDuration(Toast.LENGTH_LONG);
        tv.setView(cv);
        tv.show();
    }
}