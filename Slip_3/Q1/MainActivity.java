package com.example.voicewithoutdialogbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity {
    CheckBox pizza,coffe,burger;
    Button buttonOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizza=(CheckBox)findViewById(R.id.checkBox);
        coffe=(CheckBox)findViewById(R.id.checkBox2);
        burger=(CheckBox)findViewById(R.id.checkBox3);
        buttonOrder=(Button)findViewById(R.id.button);

        buttonOrder.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                StringBuilder result=new StringBuilder();
                result.append("Selected : ");
                if(pizza.isChecked()){
                    result.append("Pizza ");
                }
                if(coffe.isChecked()){
                    result.append("Coffe ");
                }
                if(burger.isChecked()){
                    result.append("Burgir");
                }
                //Displaying the message on the toast
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
            }

        });

    }
}