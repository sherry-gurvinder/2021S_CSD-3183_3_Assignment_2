package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String ProductNames[]={"Apple AirPods Bluetooth Headphones","Bose SoundLink Around Ear Wireless Headphones II - Black","JBL Tune 220TWS Bluetooth V5.0 Earphones Wireless Earbuds In-ear With Stereo","Skullcandy Sesh True Wireless Earbuds, Blue"};
    ArrayList <Product> products_list = new ArrayList<>();
    public static Product p_obj;
    public static double final_price=0;
    TextView product_price;
    ImageView product_img;
    Spinner sp;
    Button more,placeorder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        filldata();
        product_price = findViewById(R.id.txt_price);
        sp = findViewById(R.id.sp_productname);
        product_img = findViewById(R.id.Product_Img);
        more = findViewById(R.id.show_more);
        placeorder = findViewById(R.id.placeorder);
        //Create an array adapter and fill it from the array

        ArrayAdapter aa = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,ProductNames);
        sp.setAdapter(aa);

        //implement the spinner
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                product_price.setText("$"+products_list.get(position).getPrice()+".00");
                product_img.setImageResource(products_list.get(position).getProduct_img());

                p_obj=products_list.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getBaseContext(),ProductDetailsActivity.class);
                startActivity(intent);
            }
        });

        placeorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getBaseContext(),PlaceorderActivity.class);
                startActivity(intent);
            }
        });
    }

    public void filldata()
    {
        products_list.add(new Product(170,R.mipmap.apple,"Apple","White","Wireless","Apple AirPods with Charging Case"));
        products_list.add(new Product(269,R.mipmap.bose,"BOSE","Black","Wireless","SOUNDLINK AE WIRELESS HP II"));
        products_list.add(new Product(17,R.mipmap.jbl,"JBL","White","Wireless","Tune 225TWS"));
        products_list.add(new Product(39,R.mipmap.skull,"Skullcandy","White","Wireless","Sesh"));

    }
}