package com.example.voicewithoutdialogbox;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText ed1, ed2, ed3, ed4, ed5, ed6, ed7;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        ed3 = findViewById(R.id.ed3);
        ed4 = findViewById(R.id.ed4);
        ed5 = findViewById(R.id.ed5);
        ed6 = findViewById(R.id.ed6);
        ed7 = findViewById(R.id.ed7);
        b1 = findViewById(R.id.b1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = ed1.getText().toString();
                String mname = ed2.getText().toString();
                String lname = ed3.getText().toString();
                String dob = ed4.getText().toString();
                String address = ed5.getText().toString();
                String phno = ed6.getText().toString();
                String special = ed7.getText().toString();

                Intent i = new Intent(MainActivity.this, New.class);
                i.putExtra("fnme",fname);
                i.putExtra("mnme",mname);
                i.putExtra("lnme",lname);
                i.putExtra("hbd",dob);
                i.putExtra("addrs",address);
                i.putExtra("pno",phno);
                i.putExtra("spl",special);

                startActivity(i);
            }
        });
    }
}