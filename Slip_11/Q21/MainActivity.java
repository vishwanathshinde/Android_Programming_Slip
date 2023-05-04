package com.example.voicewithoutdialogbox;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText ed_name, ed_surname, ed_class, ed_gender, ed_hobbies, ed_marks;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed_name = findViewById(R.id.ed_name);
        ed_surname = findViewById(R.id.ed_surname);
        ed_class = findViewById(R.id.ed_class);
        ed_gender = findViewById(R.id.ed_gender);
        ed_hobbies = findViewById(R.id.ed_hobbies);
        ed_marks = findViewById(R.id.ed_marks);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = ed_name.getText().toString().trim();
                String Surname = ed_surname.getText().toString().trim();
                String Class = ed_class.getText().toString().trim();
                String Gender = ed_gender.getText().toString().trim();
                String Hobbies = ed_hobbies.getText().toString().trim();
                String Marks = ed_marks.getText().toString().trim();

                Intent intent = new Intent(MainActivity.this,New.class);
                intent.putExtra("Name",Name);
                intent.putExtra("Surname",Surname);
                intent.putExtra("Class",Class);
                intent.putExtra("Gender",Gender);
                intent.putExtra("Hobbies",Hobbies);
                intent.putExtra("Marks",Marks);

                startActivity(intent);
            }
        });
    }
}