package com.example.voicewithoutdialogbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
    Switch aSwitch;
    ToggleButton toggleButton;

    private static final int PICK_FROM_GALLERY = 101;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aSwitch = findViewById(R.id.aSwitch);
        toggleButton = findViewById(R.id.toggleButton);

        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(aSwitch.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Switch is ON", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Switch is OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // We can make toast message by two ways

//                if(toggleButton.isChecked())
//                {
//                    Toast.makeText(MainActivity.this, "Toggle Button is ON", Toast.LENGTH_SHORT).show();
//                }
//                else
//                {
//                    Toast.makeText(MainActivity.this, "Toggle Button is OFF", Toast.LENGTH_SHORT).show();
//                }

                Toast.makeText(MainActivity.this, "Toggle Button is " + toggleButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}