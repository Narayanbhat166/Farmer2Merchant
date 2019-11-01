package com.example.hckathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MerchantActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.merchant_layout);


        Button MerchantSell = findViewById(R.id.Merchant);
        MerchantSell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MerchantSellActivity = new Intent(MerchantActivity.this, MerchantSellerActivity.class);
                startActivity(MerchantSellActivity);

            }
        });
    }
}
