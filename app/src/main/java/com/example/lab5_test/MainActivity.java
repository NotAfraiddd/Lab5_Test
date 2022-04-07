package com.example.lab5_test;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button[] btn =new Button[3];
    private Button btn_unfocus;
    private int[] btn_id={R.id.buttonDonut, R.id.buttonPinkDonut, R.id.buttonFloating};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Donut> donuts = new ArrayList<>();
        donuts.add(new Donut(R.drawable.donut_yellow_1,"Tasty Donut","Spicy tasty donut family","$10.00"));
        donuts.add(new Donut(R.drawable.tasty_donut_1,"Pink Donut","Spicy tasty donut family","$20.00"));
        donuts.add(new Donut(R.drawable.green_donut_1,"Floating Donut","Spicy tasty donut family","$30.00"));
        donuts.add(new Donut(R.drawable.donut_red_1,"Red Donut","Spicy tasty donut family","$15.00"));
        ListView listView = findViewById(R.id.myListView);
        ListViewDonutAdapter adapter = new ListViewDonutAdapter(this,donuts,R.layout.activity_list_view_donut_adapter);
        listView.setAdapter(adapter);
        btn[0] =findViewById(btn_id[0]);
        btn[0].setBackgroundColor(Color.rgb(3,106,150));
        btn[0].setOnClickListener(this);

        btn[1] =findViewById(btn_id[1]);
        btn[1].setBackgroundColor(Color.rgb(207,207,207));
        btn[1].setOnClickListener(this);

        btn[2] =findViewById(btn_id[2]);
        btn[2].setBackgroundColor(Color.rgb(207,207,207));
        btn[2].setOnClickListener(this);

        btn_unfocus = btn[0];

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonDonut:{
                setFocus(btn_unfocus,btn[0]);
                break;
            }
            case R.id.buttonPinkDonut:{
                setFocus(btn_unfocus,btn[1]);
                break;
            }
            case R.id.buttonFloating:{
                setFocus(btn_unfocus,btn[2]);
                break;
            }
        }
    }
    private void setFocus(Button btn_focus, Button btn_unfocus){
        btn_unfocus.setTextColor(Color.rgb(49  ,50,51));
        btn_unfocus.setBackgroundColor(Color.rgb(207,207,207));

        btn_focus.setTextColor(Color.rgb(255,255,255));
        btn_focus.setBackgroundColor(Color.rgb(3,106,150));

        this.btn_unfocus = btn_focus;
    }
}