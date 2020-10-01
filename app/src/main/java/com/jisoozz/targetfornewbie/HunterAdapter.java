package com.jisoozz.targetfornewbie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HunterAdapter extends RecyclerView.Adapter<HunterAdapter.ViewHolder> implements OnHunterItemClickListener, Filterable {

    ArrayList<Hunter> items = new ArrayList<Hunter>();
    OnHunterItemClickListener listener;


    public void addItem(Hunter item){
        items.add(item);
    }

    public void setItems(ArrayList<Hunter> items){
        this.items = items;
    }

    public Hunter getItem(int position){
        return items.get(position);
    }

    public void setItem(int position, Hunter item){
        items.set(position, item);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.hunter_item,parent,false);

        return new ViewHolder(itemView,this);
    }

    public void setOnItemClickListener(OnHunterItemClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Hunter item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onItemClick(ViewHolder holder, View view, int position) {
        if(listener != null){
            listener.onItemClick(holder,view,position);
        }
    }

    @Override
    public Filter getFilter() {
        return null;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        TextView textView2;
        TextView nameTv;
        ImageView icon;

        public ViewHolder(View itemView, final OnHunterItemClickListener listener){
            super(itemView);

            textView = itemView.findViewById(R.id.tv1);
            textView2 = itemView.findViewById(R.id.tv2);
            nameTv = itemView.findViewById(R.id.nameTv);
            icon = itemView.findViewById(R.id.icon);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if(listener != null){
                        listener.onItemClick(ViewHolder.this,view,position);
                    }
                }
            });
        }

        public void setItem(Hunter item){
            textView.setText(item.getTier());
            textView2.setText(item.getJob());
            nameTv.setText(item.getName());
            icon.setImageResource(item.getProfile());

        }


    }
}
