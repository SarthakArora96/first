package com.example.android.nationalurbanleague;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
    }

    public void whoWeAre(View view){
        Intent intent = new Intent(Screen.this, WhoWeAre.class);
        startActivity(intent);
    }

    public void openTwitter(View view){
        Intent intent = null;
        try {
            // get the Twitter app if possible
            this.getPackageManager().getPackageInfo("com.twitter.android", 0);
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?screen_name=NatUrbanLeague"));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        } catch (Exception e) {
            // no Twitter app, revert to browser
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/NatUrbanLeague"));
        }
        this.startActivity(intent);
    }

    public void openMap(View view){
        Intent intent = new Intent(Screen.this, Map.class);
        startActivity(intent);
    }

    public void openSocial(View view){
        Intent intent = new Intent(Screen.this, SocialMedia.class);
        startActivity(intent);
    }
}
