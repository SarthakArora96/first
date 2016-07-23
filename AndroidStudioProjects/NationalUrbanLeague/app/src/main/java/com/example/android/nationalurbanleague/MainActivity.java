package com.example.android.nationalurbanleague;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "xB0z3D6XXWyyOnbEWzWeGswKo";
    private static final String TWITTER_SECRET = "nGBjKpv9h5XyJyXuRpYmbtgI8KfC0I4EJpiILpw7oA1TGng2PH";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signIn(View view) {
        Intent intent = new Intent(MainActivity.this, Screen.class);
        startActivity(intent);
    }

    public void goSignUp(View view){
        Intent intent = new Intent(MainActivity.this, SignUp.class);
        startActivity(intent);
    }
}
