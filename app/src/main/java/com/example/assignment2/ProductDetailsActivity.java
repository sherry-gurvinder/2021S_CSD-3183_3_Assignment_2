package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductDetailsActivity extends AppCompatActivity {

    TextView brand,technology,p_name,color,modelname,price,txt_quantity;
    ImageView p_img;
    Button addcart,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        brand=findViewById(R.id.brand_name);
        technology = findViewById(R.id.Conn_Tech);
        color = findViewById(R.id.brand_color);

        p_img = findViewById(R.id.Product_Img);
        addcart = findViewById(R.id.cart);
        p_name = findViewById(R.id.p_name);
        back = findViewById(R.id.back);
        price =findViewById(R.id.p_price);
        int prodcut_price=MainActivity.p_obj.getPrice();
        price.setText("$"+String.valueOf(prodcut_price)+".00");
        p_name.setText(MainActivity.p_obj.getModel_name());
        brand.setText(MainActivity.p_obj.getBrand());
        technology.setText(MainActivity.p_obj.getConnectivity_technology());
        color.setText(MainActivity.p_obj.getColour());
        txt_quantity= findViewById(R.id.quantity);



        addcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("&&&&&&&&&&&**********"+txt_quantity.getText().length());
                if (txt_quantity.getText().length()>0)
                {
                    int quantity= Integer.parseInt( txt_quantity.getText().toString());
                    txt_quantity.setText(null);
                    MainActivity.final_price=prodcut_price*quantity;
                    Intent intent =new Intent(getBaseContext(),MainActivity.class);
                    startActivity(intent);
                }

            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getBaseContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}