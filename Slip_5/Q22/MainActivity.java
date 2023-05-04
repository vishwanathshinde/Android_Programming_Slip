package com.example.voicewithoutdialogbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    ListView listView;
    String banks[] = {"BOI", "SBI", "PNB", "OBC", "HDFC","BOI", "SBI", "PNB", "OBC", "HDFC",
                        "BOI", "SBI", "PNB", "OBC", "HDFC","BOI", "SBI", "PNB", "OBC", "HDFC","BOI",
                        "SBI", "PNB", "OBC", "HDFC","BOI", "SBI", "PNB", "OBC", "HDFC",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.listview_one,R.id.tv1, banks);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, banks[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}