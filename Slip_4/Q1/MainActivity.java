package com.example.voicewithoutdialogbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText ed1;
    Button b1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.ed1);
        b1 = findViewById(R.id.b1);
        tv1 = findViewById(R.id.tv1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(ed1.getText().toString());

                num = num % 2;

                if(num == 0)
                    tv1.setText("Even Number !");
                else
                    tv1.setText("Odd Number !");
            }
        });
    }
}
