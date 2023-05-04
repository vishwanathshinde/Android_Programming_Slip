package com.example.voicewithoutdialogbox;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class New extends Activity {

    TextView tv1;

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv1 = findViewById(R.id.tv1);

        Intent intent = getIntent();

        String msg = intent.getStringExtra("msg");

        tv1.setText(msg);
    }
}
