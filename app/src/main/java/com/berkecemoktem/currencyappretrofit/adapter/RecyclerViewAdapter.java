package com.berkecemoktem.currencyappretrofit.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.berkecemoktem.currencyappretrofit.R;
import com.berkecemoktem.currencyappretrofit.model.CryptoModel;

import java.util.ArrayList;
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RowHolder> {
    private ArrayList<CryptoModel> cryptoList;
    private String[] colors = {"#98546f","#62797a","#eca781","#fc3631","#d0c4ef","#ff5abb","#e5c135","#3bbad5"};
    public RecyclerViewAdapter(ArrayList<CryptoModel> cryptoList){
        this.cryptoList = cryptoList;
    }

    @NonNull
    @Override
    public RowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_layout, parent, false);
        return new RowHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RowHolder holder, int position) {
        holder.bind(cryptoList.get(position),colors,position);
    }

    @Override
    public int getItemCount() {
        return cryptoList.size();
    }

    public class RowHolder extends RecyclerView.ViewHolder {
        TextView text_name;
        TextView text_price;
        public RowHolder(@NonNull View itemView) {

            super(itemView);

        }
        public void bind(CryptoModel cryptoModel, String[] colors, int position){
            itemView.setBackgroundColor(Color.parseColor(colors[position % 8]));
            text_name = itemView.findViewById(R.id.text_name);
            text_price = itemView.findViewById(R.id.text_price);
            text_name.setText(cryptoModel.currency);
            text_price.setText(cryptoModel.price);
        }
    }
}
