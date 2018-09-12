package com.solai.dealsplant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageView ivMobile = (ImageView) findViewById(R.id.ivMobile);
        ivMobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent iMobile = new Intent(MenuActivity.this, MobileActivity.class);
                startActivity(iMobile);
            }
        });

        ImageView ivEarPhone = (ImageView) findViewById(R.id.ivEarPhone);
        ivEarPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iEarPhone = new Intent(MenuActivity.this,EarPhoneActivity.class);
                startActivity(iEarPhone);
            }
        });

        ImageView ivPendrive = (ImageView) findViewById(R.id.ivPendrive);
        ivPendrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPendrive =  new Intent(MenuActivity.this, PendriveActivity.class);
                startActivity(iPendrive);
            }
        });

        ImageView ivHeadPhone = (ImageView) findViewById(R.id.ivHeadPhone);
        ivHeadPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iHeadPhone = new Intent(MenuActivity.this,HeadPhoneActivity.class);
                startActivity(iHeadPhone);
            }
        });

        ImageView ivLaptop = (ImageView) findViewById(R.id.ivLaptop);
        ivHeadPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iLaptop = new Intent(MenuActivity.this,LaptopActivity.class);
                startActivity(iLaptop);
            }
        });
    }
}
