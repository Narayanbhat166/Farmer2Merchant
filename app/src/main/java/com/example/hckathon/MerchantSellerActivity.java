package com.example.hckathon;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MerchantSellerActivity extends AppCompatActivity {

    String Fertilizers = new String();
    int Quantity[] = new int[3];
    double Price[] = new double[3];
    int j;


    public void getCrops(View view){
        EditText Crop =  findViewById(R.id.Fertilizers);
        Fertilizers = Crop.getText().toString();
        String FertilizersArr[] = Fertilizers.split("\n");
        Log.v("Entered Fertilizers are",FertilizersArr[0]);

        LinearLayout ParentLayout =  findViewById(R.id.parent);



        for(int i=0;i<FertilizersArr.length;i++){

            TextView crop = new TextView(this);
            crop.setText(FertilizersArr[i]);
            crop.setTextSize(25);
            crop.setPadding(16,4,8,4);

            final EditText quantity = new EditText(this);
            quantity.setHint("Kg of "+FertilizersArr[i]);
            final EditText price = new EditText(this);
            price.setHint("Amount per kg");

            Button submitButton = new Button(this);
            submitButton.setText("Submit");
            submitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Quantity[j] = Integer.parseInt(quantity.getText().toString());
                    Price[j] = Double.parseDouble(price.getText().toString());

                    Log.v(j+" Quantity : ",quantity.getText().toString());
                    Log.v(j+" Price : ",price.getText().toString());
                    j++;
                }
            });


            LinearLayout.LayoutParams child = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );



            ParentLayout.addView(crop,child);
            ParentLayout.addView(quantity,child);
            ParentLayout.addView(price,child);
            ParentLayout.addView(submitButton,child);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.merchantsell_layout);

        Log.v("Farmersellactivity","Entered");
    }

}
