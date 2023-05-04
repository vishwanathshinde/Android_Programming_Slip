package com.example.voicewithoutdialogbox;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class New extends Activity {

    TextView name, surname, clas, gender, hobbies, marks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        clas = findViewById(R.id.clas);
        gender = findViewById(R.id.gender);
        hobbies = findViewById(R.id.hobbies);
        marks = findViewById(R.id.marks);

        String Name = getIntent().getStringExtra("Name");
        String Surname = getIntent().getStringExtra("Surname");
        String Class = getIntent().getStringExtra("Class");
        String Gender = getIntent().getStringExtra("Gender");
        String Hobbies = getIntent().getStringExtra("Hobbies");
        String Marks = getIntent().getStringExtra("Marks");

        name.setText(Name);
        surname.setText(Surname);
        clas.setText(Class);
        gender.setText(Gender);
        hobbies.setText(Hobbies);
        marks.setText(Marks);
    }
}
