package com.solai.dealsplant;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DisplayActivity extends AppCompatActivity {
    MediaPlayer myAudio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        myAudio = MediaPlayer.create(DisplayActivity.this, R.raw.dp_ad_an_mp);
        myAudio.start();

        Button btnDP = (Button) findViewById(R.id.btnDP);
        btnDP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iwvDP = new Intent(DisplayActivity.this, DealsPlantActivity.class);
                startActivity(iwvDP);
            }
        });


        ImageView ivmenu = (ImageView) findViewById(R.id.ivmenu);
        ivmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iMenu = new Intent(DisplayActivity.this, MenuActivity.class);
                startActivity(iMenu);
            }
        });

        ImageView ivtemp = (ImageView) findViewById(R.id.ivtemp);
        ivmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itemp = new Intent(DisplayActivity.this, SplashScreen.class);
                startActivity(itemp);
            }
        });

    }
}
