package com.tubes.petcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class landing3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing3);
        Button btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(v -> openLogin());

        Button btn_register = (Button) findViewById(R.id.btn_register);
        btn_register.setOnClickListener(v -> openRegister());
    }
    public void openLogin(){
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }

    public void openRegister(){
        Intent intent = new Intent(this, register.class);
        startActivity(intent);
    }
}