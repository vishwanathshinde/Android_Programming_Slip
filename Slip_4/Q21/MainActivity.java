package com.example.voicewithoutdialogbox;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends Activity {
    Button b1, b2;
    EditText ed1;
    Spinner spinner;
    String banks[] = {"BOI", "SBI","HDFC","PNB"};
    ArrayList list = new ArrayList(Arrays.asList(banks));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        ed1 = findViewById(R.id.ed1);
        spinner = findViewById(R.id.spinner);
        ArrayAdapter arrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, list);

        spinner.setAdapter(arrayAdapter);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = ed1.getText().toString();
                list.add(s);
                Toast.makeText(MainActivity.this, "Item added to spinner!", Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = ed1.getText().toString();
                list.remove(s);
                Toast.makeText(MainActivity.this, "Item removed from spinner!", Toast.LENGTH_SHORT).show();
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, banks[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}