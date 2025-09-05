package com.example.moviesapp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.moviesapp.R;

public class LoginActivity2 extends AppCompatActivity {

    private EditText userEdt,passEdt;
    private AppCompatButton loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login2);

        initView();

    }

    private  void  initView() {
        userEdt = findViewById(R.id.edit_text_id_user);
        passEdt = findViewById(R.id.edit_text_id_password);
        loginBtn = findViewById(R.id.btn2);
        loginBtn.setOnClickListener(v -> {
            if (userEdt.getText().toString().isEmpty() || passEdt.getText().toString().isEmpty()) {
                Toast.makeText(LoginActivity2.this, "Please Fill Your user and password", Toast.LENGTH_SHORT).show();
            } else if (userEdt.getText().toString().equals("vasu") && passEdt.getText().toString().equals("123")) {
                Intent intent = new Intent(LoginActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}