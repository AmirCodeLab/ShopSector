package com.example.shopsector;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ViewHolder> {

    List<ChildModelClass> childModelClassList;
    Context context;

    public ChildAdapter(List<ChildModelClass> childModelClassList, Context context) {
        this.childModelClassList = childModelClassList;
        this.context = context;
    }

    @NonNull
    @Override
    public ChildAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(context).inflate(R.layout.recycler_view_child, null, false);
        return new ViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull ChildAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.itemImage.setImageResource(childModelClassList.get(position).image);
        holder.itemAbout.setText(childModelClassList.get(position).itemAbout);
        holder.itemPrice.setText(childModelClassList.get(position).itemPrice);
        holder.itemOrder.setText(childModelClassList.get(position).itemOrder);


//        switch (position){
//            case 0:
                holder.itemOrder.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(context, ItemsDetailsActivity.class);
                        intent.putExtra("image", childModelClassList.get(position).image);
                        intent.putExtra("about", childModelClassList.get(position).itemAbout);
                        intent.putExtra("price", childModelClassList.get(position).itemPrice);
                        context.startActivity(intent);
                    }
                });
//        }

    }

    @Override
    public int getItemCount() {
        return childModelClassList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage;
        TextView itemAbout, itemPrice, itemOrder;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.iv_item_image);
            itemAbout = itemView.findViewById(R.id.tv_item_about);
            itemPrice = itemView.findViewById(R.id.tv_item_price);
            itemOrder = itemView.findViewById(R.id.tv_item_order);
        }
    }
}
