package com.meirusfandi.ecosmartphone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailActivity extends AppCompatActivity {

    TextView price, title, stock, main_content, body_content, display_content, battery_content, seller_name;
    ImageView backdrop;
    CircleImageView sellerimage;
    Button chat, chart, buy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        price = findViewById(R.id.price);
        title = findViewById(R.id.title);
        stock = findViewById(R.id.stock);
        main_content = findViewById(R.id.maincontent);
        body_content = findViewById(R.id.body_content);
        display_content = findViewById(R.id.display_content);
        battery_content = findViewById(R.id.battery_content);
        seller_name= findViewById(R.id.sellername);

        backdrop = findViewById(R.id.image);
        sellerimage = findViewById(R.id.sellerimage);
        chat = findViewById(R.id.chat);
        chart = findViewById(R.id.cart);
        buy = findViewById(R.id.buy);

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "", Toast.LENGTH_LONG).show();
            }
        });

        chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "", Toast.LENGTH_LONG).show();
            }
        });

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "", Toast.LENGTH_LONG).show();
            }
        });
    }
}
