package com.example.wprowadzenie1p;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void dobrze(View view) {

        Toast.makeText(MainActivity.this,"R.string.dobrze",Toast.LENGTH_SHORT).show();
    }
    public void zle(View view) {
        view.setVisibility(View.INVISIBLE);
        Toast.makeText(MainActivity.this,"R.string.zle",Toast.LENGTH_SHORT).show();
    }
}