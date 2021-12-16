package com.yusuftalhaklc.retrofitjava.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yusuftalhaklc.retrofitjava.R;
import com.yusuftalhaklc.retrofitjava.model.CryptoModel;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RowHolder> {

    private ArrayList<CryptoModel> cryptoLists;
    private String[] colors = {"#6495ED","#9FE2BF","#DE3163","#FF7F50","#000080","#808000"};

    public RecyclerViewAdapter(ArrayList<CryptoModel> cryptoLists) {
        this.cryptoLists = cryptoLists;
    }

    @NonNull
    @Override
    public RowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { // layout ile recyclerview bağlama işlemi
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_layout, parent, false);
        return new RowHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RowHolder holder, int position) { // görünümleri view holderda tanımlayıp bağlama
        holder.bind(cryptoLists.get(position), colors, position);
    }

    @Override
    public int getItemCount() {// kaç tane row oluşturulacak
        return cryptoLists.size();
    }

    public class RowHolder extends RecyclerView.ViewHolder {
       TextView textName;
       TextView textPrice;

        public RowHolder(@NonNull View itemView) {
            super(itemView);



        }
        public void bind(CryptoModel cryptoModel, String[] colors, Integer position){
            itemView.setBackgroundColor(Color.parseColor(colors[position % 6]));
            textName = itemView.findViewById(R.id.textName);
            textPrice = itemView.findViewById(R.id.textPrice);
            textName.setText(cryptoModel.currency);
            textPrice.setText(cryptoModel.price);
        }
    }
}
