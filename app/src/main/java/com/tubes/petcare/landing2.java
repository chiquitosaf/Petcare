package com.tubes.petcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class landing2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing2);

        Button btn_next = (Button) findViewById(R.id.btn_next);
        btn_next.setOnClickListener(v -> openLanding3());
    }

    public void openLanding3(){
        Intent intent = new Intent(this, landing3.class);
        startActivity(intent);
    }
}