package com.example.hckathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Farmer =  findViewById(R.id.Farmers);
        Farmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent FarmerActivity = new Intent(MainActivity.this,FarmerActivity.class);
                startActivity(FarmerActivity);
            }
        });

        Button Merchant =  findViewById(R.id.Merchant);
        Merchant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MerchantActivity = new Intent(MainActivity.this,MerchantActivity.class);
                startActivity(MerchantActivity);
            }
        });


    }
}
