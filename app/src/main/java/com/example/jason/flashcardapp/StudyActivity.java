package com.example.jason.flashcardapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);

        Button exitButton = (Button) findViewById(R.id.exit);
        exitButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent startIntent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(startIntent);
            }
        });
    }

    public void changeIndexCardDisplay(View v){
        Button change = (Button) v;
        Button card = (Button) findViewById(R.id.indexCard);
        if (change.getText().toString().equals(getResources().getString(R.string.show_definition))){
            card.setText(getResources().getString(R.string.definition));
            change.setText(getResources().getString(R.string.show_term));
        }
        else{
            card.setText(getResources().getString(R.string.term));
            change.setText(getResources().getString(R.string.show_definition));
        }
    }
}
