package com.meirusfandi.ecosmartphone;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {

    private ArrayList<Models> listdata;
    private Context context;

    private ArrayList<Models> getListdata() {
        return listdata;
    }

    public void setListdata(ArrayList<Models> listdata) {
        this.listdata = listdata;
    }

    public GridAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public GridAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid, parent, false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull GridAdapter.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return getListdata().size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView productimage;
        TextView price, maininfo, title;
        CircleImageView sellerimage;

        ViewHolder(@NonNull View itemView) {
            super(itemView);

            productimage = itemView.findViewById(R.id.productimage);
            price = itemView.findViewById(R.id.price);
            title = itemView.findViewById(R.id.productname);
            maininfo = itemView.findViewById(R.id.productdetail);
            sellerimage = itemView.findViewById(R.id.sellerimage);
        }
    }
}
