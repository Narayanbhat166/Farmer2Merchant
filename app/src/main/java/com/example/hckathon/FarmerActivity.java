package com.example.hckathon;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class FarmerActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.farmer_layout);

        Button FarmerSell =  findViewById(R.id.FarmersSell);
        FarmerSell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent FarmerSellActivity = new Intent(FarmerActivity.this,FarmerSellActivity.class);
                startActivity(FarmerSellActivity);

            }
        });
    }






}
