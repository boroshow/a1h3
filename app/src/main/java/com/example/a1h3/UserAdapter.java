package com.example.a1h3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.viewHolder> {

    private ArrayList<country> listName = new ArrayList<>();

    public void setListName(ArrayList<country> listName) {
        this.listName = listName;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_users, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.onBind(listName.get(position));

    }

    @Override
    public int getItemCount() {
        return listName.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        private TextView countryTv, cityTv;
        private ImageView flag;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            countryTv = itemView.findViewById(R.id.tv_country);
            cityTv = itemView.findViewById(R.id.tv_city);
            flag = itemView.findViewById(R.id.iv_flag);
        }

        public void onBind(country country) {
            countryTv.setText(country.getCountry());
            cityTv.setText(country.getCity());
            flag.setImageResource(country.getImage());
        }
    }
}