package com.example.manish.oldbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Mic extends AppCompatActivity {

    ImageView mic_back_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mic);



        mic_back_home = (ImageView) findViewById(R.id.mic_back_home);

        mic_back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Mic.this,Home.class));
            }
        });
    }
}