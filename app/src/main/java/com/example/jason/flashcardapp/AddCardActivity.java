package com.example.jason.flashcardapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddCardActivity extends AppCompatActivity {

    public static final String EXTRA_TERM = "extraTerm";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

    }

    public void getTerm(View v){
        Button t = (Button) v;
        EditText inputTerm = (EditText) findViewById(R.id.enterTerm);
        String input = inputTerm.getText().toString();


    }
}
