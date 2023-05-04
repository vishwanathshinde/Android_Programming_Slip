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
                int base = Integer.parseInt(ed1.getText().toString());
                int exponent = Integer.parseInt(ed2.getText().toString());

                int exp = exponent;

                long result = 1;
                double sum = 0.0;
                double avg = 0.0;

                while(exp != 0) {
                    result *= base;
                    --exp;
                }
                String s = String.valueOf(result);

                sum = base + exponent;

                avg = sum / 2;

                String f = String.valueOf(avg);

                tv1.setText("Power : " + s);
                tv2.setText("Average : " + f);

//                Intent intent = new Intent(MainActivity.this, New.class);
//                intent.putExtra("pow",s);
//                intent.putExtra("avg",f);
//                startActivity(intent);
            }
        });
    }
}