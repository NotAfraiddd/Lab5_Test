package com.example.lab5_test;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewDonutAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Donut> listDonuts;
    private int idLayout;

    public ListViewDonutAdapter(Context context) {
        this.context = context;
    }

    public ListViewDonutAdapter(Context context, ArrayList<Donut> listDonuts, int idLayout) {
        this.context = context;
        this.listDonuts = listDonuts;
        this.idLayout = idLayout;
    }

    @Override
    public int getCount() {
        return listDonuts.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null)
            view = LayoutInflater.from(viewGroup.getContext()).inflate(idLayout,viewGroup,false);
        TextView title = view.findViewById(R.id.title);
        TextView description = view.findViewById(R.id.description);
        TextView money = view.findViewById(R.id.money);
        ImageView avatar = view.findViewById(R.id.imageView);

        title.setText(listDonuts.get(i).getTitle());
        description.setText(listDonuts.get(i).getDescription());
        money.setText(listDonuts.get(i).getMoney());
        avatar.setImageResource(listDonuts.get(i).getImgURL());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Donut d = listDonuts.get(i);
                Intent intent = new Intent(context,DetailDonut.class);
                intent.putExtra("donut",d);
                context.startActivity(intent);
            }
        });
        return view;
    }
}