package com.trustedoffer.mvvmdesignpattern.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.trustedoffer.mvvmdesignpattern.Model.ModelClass;
import com.trustedoffer.mvvmdesignpattern.Model.MostWicket;
import com.trustedoffer.mvvmdesignpattern.R;

import java.util.ArrayList;
import java.util.List;

public class BestBowlingAdapter extends RecyclerView.Adapter<BestBowlingAdapter.BestBowlingViewHolder> {
    Context context;
    List<MostWicket> listitem;

    public class BestBowlingViewHolder extends RecyclerView.ViewHolder {
        TextView tvname;
        TextView tvteam;
        TextView tvwicket;

        public BestBowlingViewHolder(@NonNull View itemView) {
            super(itemView);
            tvname = (TextView) itemView.findViewById(R.id.tvbbnameid);
            tvteam = (TextView) itemView.findViewById(R.id.tvbbteamid);
            tvwicket = (TextView) itemView.findViewById(R.id.tvbbwicketid);
        }
    }

    public BestBowlingAdapter(Context context, List<MostWicket> listitem) {
        this.context = context;
        this.listitem = listitem;
    }

    @NonNull
    public BestBowlingViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new BestBowlingViewHolder(LayoutInflater.from(context).inflate(R.layout.best_bowling_layout, viewGroup, false));
    }

    public void onBindViewHolder(@NonNull BestBowlingViewHolder holder, int i) {
        MostWicket ModelClass =  listitem.get(i);
        holder.tvname.setText(ModelClass.getPlayer());
        holder.tvteam.setText(ModelClass.getTeam());
        holder.tvwicket.setText(ModelClass.getWickets());
    }

    public int getItemCount() {
        return this.listitem.size();
    }
}

