package com.jisoozz.targetfornewbie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.ViewHolder> implements OnCharacterItemClickListener {

    ArrayList<Character> items = new ArrayList<Character>();
    OnCharacterItemClickListener listener;

    public void addItem(Character item){
        items.add(item);
    }

    public void setItems(ArrayList<Character> items){
        this.items = items;
    }

    public Character getItem(int position){
        return items.get(position);
    }

    public void setItem(int position, Character item){
        items.set(position, item);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.character_item,parent,false);

        return new ViewHolder(itemView,this);
    }

    public void setOnItemClickListener(OnCharacterItemClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onItemClick(ViewHolder holder, View view, int position) {
        if(listener != null){
            listener.onItemClick(holder,view,position);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Character item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        TextView textView2;
        ImageView icon;
        ImageView a;
        ImageView b;

        public ViewHolder(View itemView, final OnCharacterItemClickListener listener){
            super(itemView);

            textView = itemView.findViewById(R.id.tv1);
            textView2 = itemView.findViewById(R.id.tv2);
            icon = itemView.findViewById(R.id.icon);
            a = itemView.findViewById(R.id.iv1);
            b = itemView.findViewById(R.id.iv2);

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

        public void setItem(Character item){
            textView.setText(item.getJob());
            textView2.setText(item.getName());
            icon.setImageResource(item.getProfile());
            a.setImageResource(item.getA());
            b.setImageResource(item.getB());

        }


    }
}
