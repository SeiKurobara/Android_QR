package com.example.qr;

import android.app.Activity;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Validations extends AppCompatActivity {

    public String isEmptyEditText(Activity activity, EditText editText){
        String result = editText.getText().toString();

        if (result.equals("")){
            Toast.makeText(activity, "The String Is Empty", Toast.LENGTH_SHORT).show();
            return "";
        }else{
            Toast.makeText(activity, result, Toast.LENGTH_SHORT).show();
            return result;}
    }
}
