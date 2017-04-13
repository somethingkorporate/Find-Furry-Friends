package com.tamsinedwards.findfurryfriends;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.common.SignInButton;

public class Login extends AppCompatActivity {

    FirebaseWrapper firebaseWrapper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        firebaseWrapper = new FirebaseWrapper(this);

        FloatingActionButton bypass = (FloatingActionButton) findViewById(R.id.bypass);
        bypass.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toSearch = new Intent(Login.this, MainActivity.class);
                startActivity(toSearch);
            }
        });

        final SignInButton signIn = (SignInButton) findViewById(R.id.sign_in_button);
        signIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                firebaseWrapper.signIn();
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(firebaseWrapper.onActivityResult(requestCode,resultCode,data)) {
            Intent toSearch = new Intent(Login.this, MainActivity.class);
            startActivity(toSearch);
        }
    }
}
