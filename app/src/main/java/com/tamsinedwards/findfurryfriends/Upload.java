package com.tamsinedwards.findfurryfriends;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Upload extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.search);
        fab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toSearch = new Intent(Upload.this, MainActivity.class);
                startActivity(toSearch);
            }
        });

        Button submit = (Button) findViewById(R.id.upload);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //this will take all information entered and put it in database
                //need a method to take all information -> how do the guys want it stored?
                TextView tester = (TextView) findViewById(R.id.textView);
                tester.setText("submitted");
            }
        });
    }

}
