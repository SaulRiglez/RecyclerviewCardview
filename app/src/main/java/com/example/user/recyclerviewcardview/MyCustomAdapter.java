package com.example.user.recyclerviewcardview;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by User on 12/15/2016.
 */

public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.MyViewHolder>{

    Context context;
    ArrayList<Information> data;

    LayoutInflater inflater;



    public MyCustomAdapter(Context context, ArrayList<Information> data) {
        this.context = context;
        this.data = data;

        inflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int position) {
        View view = inflater.inflate(R.layout.list_item_row,parent,false);

        MyViewHolder holder = new MyViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.textView.setText(data.get(position).title);
        holder.imageView.setImageResource(data.get(position).imageId);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = ((TextView) itemView.findViewById(R.id.txv_row));
            imageView = ((ImageView) itemView.findViewById(R.id.img_row));

        }
    }
}
