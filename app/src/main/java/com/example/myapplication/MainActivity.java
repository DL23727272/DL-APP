package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView message;
    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = findViewById(R.id.message);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btnLogin);



        String newMess = message.getText().toString();
        Toast.makeText(getApplicationContext(), newMess, Toast.LENGTH_SHORT).show();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String un = username.getText().toString();
                String pw = password.getText().toString();

                if (un.equals("admin") && pw.equals("admin")) {
                    Toast.makeText(getApplicationContext(), "Login successful", Toast.LENGTH_SHORT).show();

                    // Start the home page activity or navigate to it
                    Intent intent = new Intent(MainActivity.this, Home.class);
                    startActivity(intent);
                    finish(); // Optional: Finish the current activity to prevent going back to it
                } else {
                    Toast.makeText(getApplicationContext(), "Mali nilagay mo bonak!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
