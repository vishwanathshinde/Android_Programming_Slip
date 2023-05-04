package com.example.voicewithoutdialogbox;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText ed1, ed2;
    Button b1;
    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        b1 = findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first = Integer.parseInt(ed1.getText().toString());
                int second = Integer.parseInt(ed2.getText().toString());

                if(first <= 10 || second<=10) {
                    tv1.setText("First No: " + first);
                    tv2.setText("Second No: " + second);
                }
                else {
                    ed1.setText("");
                    ed2.setText("");
                    tv2.setText("");
                    tv1.setText("Enter no again..");
                }


//                if(first <= 10)
//                    tv1.setText("First No: "+first);
//                else
//                    tv1.setText("Enter no again..");
//
//                if(second <= 10)
//                    tv2.setText("First No: "+first);
//                else
//                    tv2.setText("Enter no again..");
            }
        });

    }
}