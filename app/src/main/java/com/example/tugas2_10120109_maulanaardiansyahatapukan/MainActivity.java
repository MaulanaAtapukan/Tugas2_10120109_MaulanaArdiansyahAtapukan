package com.example.tugas2_10120109_maulanaardiansyahatapukan;

//Nama  : Maulana Ardiansyah Atapukan
//NIM   : 10120109
//Kelas : IF-3

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), home.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }
}