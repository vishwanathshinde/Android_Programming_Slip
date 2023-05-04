package com.example.voicewithoutdialogbox;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class New extends Activity {
    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        tv7 = findViewById(R.id.tv7);

        String fname = getIntent().getStringExtra("fnme");
        String mname = getIntent().getStringExtra("mnme");
        String lname = getIntent().getStringExtra("lnme");
        String dob = getIntent().getStringExtra("hbd");
        String address = getIntent().getStringExtra("addrs");
        String phno = getIntent().getStringExtra("pno");
        String special = getIntent().getStringExtra("spl");

        tv1.setText(fname);
        tv2.setText(mname);
        tv3.setText(lname);
        tv4.setText(dob);
        tv5.setText(address);
        tv6.setText(phno);
        tv7.setText(special);
    }
}
