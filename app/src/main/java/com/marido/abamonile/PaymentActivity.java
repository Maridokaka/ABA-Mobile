package com.marido.abamonile;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.marido.abamonile.adapter.TransferMenuAdapter;
import com.marido.abamonile.modedl.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class PaymentActivity extends AppCompatActivity {
    private List<MenuItem> list; // Data
    private TransferMenuAdapter adapter; // line for connnect from list to activity (recyclerview)
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfers);

        recyclerView = findViewById(R.id.recycler_view);

        list = new ArrayList<>();

        list.add(new MenuItem(getResources().getDrawable(R.drawable.electricity),
                "Electricity"));
        list.add(new MenuItem(getResources().getDrawable(R.drawable.water),
                "Water Supply" ));
        list.add(new MenuItem(getResources().getDrawable(R.drawable.waste),
                "Waste"));
        list.add(new MenuItem(getResources().getDrawable(R.drawable.internet),
                "Internet "));
        list.add(new MenuItem(getResources().getDrawable(R.drawable.education),
                "Education"));
        list.add(new MenuItem(getResources().getDrawable(R.drawable.insur),
                "Insurance"));
        list.add(new MenuItem(getResources().getDrawable(R.drawable.tradings),
                "Trading"));
        adapter = new TransferMenuAdapter(list,PaymentActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}

