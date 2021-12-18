package com.yama.resisterforactivitysample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SubActivity extends AppCompatActivity {
    EditText edt_result;
    Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_sub);

         edt_result = findViewById (R.id.edt_result);
         btn_back = findViewById (R.id.btn_back);

         btn_back.setOnClickListener (view -> {
             Intent intent = new Intent ();
             String result = edt_result.getText ().toString ();
             intent.putExtra ("result", result);
             setResult (RESULT_OK, intent);
             finish ();

         });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed ();
    }
}