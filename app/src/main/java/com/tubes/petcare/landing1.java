package com.tubes.petcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class landing1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing1);

        Button btn_next = (Button) findViewById(R.id.button2);
        btn_next.setOnClickListener(v -> openLanding2());
    }

    public void openLanding2(){
        Intent intent = new Intent(this, landing2.class);
        startActivity(intent);
    }
}