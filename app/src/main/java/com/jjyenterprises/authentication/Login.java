package com.jjyenterprises.authentication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

import com.jjyenterprises.Home_page;
import com.jjyenterprises.R;

public class Login extends AppCompatActivity {

    AppCompatButton login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login_btn = findViewById(R.id.login_btn);
        login_btn.setOnClickListener(view -> {
            startActivity(new Intent(this, Home_page.class));
        });


    }
}