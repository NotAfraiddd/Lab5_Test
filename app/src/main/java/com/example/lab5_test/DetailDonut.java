package com.example.lab5_test;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailDonut extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.detail_donut);
        Donut donuts = (Donut) getIntent().getSerializableExtra("donut");

        ImageView avatarDetail = findViewById(R.id.avatarDetail);
        TextView txtName = findViewById(R.id.titleDetail);
        TextView txtDescription = findViewById(R.id.descriptionDetail);
        TextView txtMoney = findViewById(R.id.moneyDetail);

        avatarDetail.setImageResource(donuts.getImgURL());
        txtName.setText(donuts.getTitle());
        txtDescription.setText(donuts.getDescription());
        txtMoney.setText(donuts.getMoney());

    }
}

