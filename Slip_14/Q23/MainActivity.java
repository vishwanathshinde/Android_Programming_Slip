package com.example.voicewithoutdialogbox;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText ed1, ed2;
    Button b1;

    private static final int PICK_FROM_GALLERY = 101;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        b1 = findViewById(R.id.b1);

        registerForContextMenu(b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Long Press Me !", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Choose Operation");
        //add menu items
        menu.add(1,1,1,"Find Power");
        menu.add(1,2,2,"Find Average");
    }

    // menu item select listener
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getTitle() == "Find Power")
        {
            int base = Integer.parseInt(ed1.getText().toString());
            int exponent = Integer.parseInt(ed2.getText().toString());

            int exp = exponent;

            long result = 1;

            while(exp != 0) {
                result *= base;
                --exp;
            }
            String s = String.valueOf(result);
            Intent intent = new Intent(MainActivity.this, New.class);
            intent.putExtra("pow",s);
            startActivity(intent);
        }
        else if (item.getTitle() == "Find Average")
        {
            int base = Integer.parseInt(ed1.getText().toString());
            int exponent = Integer.parseInt(ed2.getText().toString());

            double sum = 0.0;
            double avg = 0.0;

            sum = base + exponent;

            avg = sum / 2;

            String f = String.valueOf(avg);

            Intent intent = new Intent(MainActivity.this, New.class);
            intent.putExtra("avg",f);
            startActivity(intent);
        }


        return true;
    }
}