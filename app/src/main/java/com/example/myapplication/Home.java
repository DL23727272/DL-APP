package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void Add(View view) {
        EditText et1 = findViewById(R.id.etNum1);
        EditText et2 = findViewById(R.id.etNum2);
        TextView ans = findViewById(R.id.answer);

        float n1 = Float.parseFloat(et1.getText().toString());
        float n2 = Float.parseFloat(et2.getText().toString());

        float result = n1 + n2;

        ans.setText(String.valueOf(result));
    }

    public void Subtract(View view) {
        EditText et1 = findViewById(R.id.etNum1);
        EditText et2 = findViewById(R.id.etNum2);
        TextView ans = findViewById(R.id.answer);

        float n1 = Float.parseFloat(et1.getText().toString());
        float n2 = Float.parseFloat(et2.getText().toString());

        float result = n1 - n2;

        ans.setText(String.valueOf(result));
    }

    public void Divide(View view) {
        EditText et1 = findViewById(R.id.etNum1);
        EditText et2 = findViewById(R.id.etNum2);
        TextView ans = findViewById(R.id.answer);

        float n1 = Float.parseFloat(et1.getText().toString());
        float n2 = Float.parseFloat(et2.getText().toString());

        float result = n1 / n2;

        ans.setText(String.valueOf(result));
    }

    public void Multiply(View view) {
        EditText et1 = findViewById(R.id.etNum1);
        EditText et2 = findViewById(R.id.etNum2);
        TextView ans = findViewById(R.id.answer);

        float n1 = Float.parseFloat(et1.getText().toString());
        float n2 = Float.parseFloat(et2.getText().toString());

        float result = n1 * n2;

        ans.setText(String.valueOf(result));
    }
}
