package com.example.evaluacion3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button supportButton;
    private RecyclerView recyclerView;
    private ProductoAdapter productoAdapter;
    private ArrayList<ProductoModel> productoModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();

        supportButton = findViewById(R.id.support_button);
        recyclerView = findViewById(R.id.producto_recycler_view);
        productoAdapter = new ProductoAdapter(productoModel);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(productoAdapter);

        supportButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SupportActivity.class);
            startActivity(intent);
        });
    }

    private void getData(){
        productoModel = new ArrayList<>();
        productoModel.add(new ProductoModel("Cereales", "https://cdn-icons-png.flaticon.com/512/2829/2829840.png"));
        productoModel.add(new ProductoModel("Cervezas", "https://cdn-icons-png.flaticon.com/512/931/931949.png"));
        productoModel.add(new ProductoModel("Bebidas", "https://cdn-icons-png.flaticon.com/512/2405/2405479.png"));
        productoModel.add(new ProductoModel("Frutas", "https://cdn-icons-png.flaticon.com/512/3082/3082025.png"));
        productoModel.add(new ProductoModel("Lacteos", "https://cdn-icons-png.flaticon.com/512/2674/2674486.png"));
        productoModel.add(new ProductoModel("Pescados y Mariscos", "https://cdn-icons.flaticon.com/png/512/3707/premium/3707723.png?token=exp=1658984693~hmac=d0b12fb3ef127231f4e69cd67be9fff1"));
        productoModel.add(new ProductoModel("Menestras", "https://cdn-icons-png.flaticon.com/512/755/755254.png"));
    }
}