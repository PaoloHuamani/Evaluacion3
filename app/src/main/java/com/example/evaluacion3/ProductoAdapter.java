package com.example.evaluacion3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ProductoAdapter extends RecyclerView.Adapter<ProductoAdapter.ViewHolder> {

    private ArrayList<ProductoModel> productoModel;

    public ProductoAdapter(ArrayList<ProductoModel> productoModel) { this.productoModel = productoModel; }

    @NonNull
    @Override
    public ProductoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.producto_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.productoName.setText(productoModel.get(position).getProductoName());
        Glide.with(holder.itemView.getContext()).load(productoModel.get(position).getProductoPhoto()).into(holder.productoPhoto);

    }



    @Override
    public int getItemCount() { return productoModel.size();}

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView productoName;
        ImageView productoPhoto;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            productoName = itemView.findViewById(R.id.producto_name);
            productoPhoto = itemView.findViewById(R.id.producto_photo);
        }
    }

}
