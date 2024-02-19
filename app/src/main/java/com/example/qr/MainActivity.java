package com.example.qr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Validations validations = new Validations();
    private EditText etNumber1, etNumber2;
    private Button btnGoToNextAct;
    private TextView txtResults;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber1 = findViewById(R.id.et_Number1);
        etNumber2 = findViewById(R.id.et_Number2);
        btnGoToNextAct = findViewById(R.id.btn_NextActivity);
        txtResults = findViewById(R.id.txt_result);

        Toast.makeText(this, "Kangkong", Toast.LENGTH_SHORT).show();

        btnGoToNextAct.setOnClickListener(v ->{
            Intent intent = new Intent(this,activity2.class);
            validations.isEmptyEditText(this,etNumber1);
            validations.isEmptyEditText(this,etNumber2);
        });
    }
}