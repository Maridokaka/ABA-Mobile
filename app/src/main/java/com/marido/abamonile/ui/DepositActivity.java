package com.marido.abamonile.ui;

import android.os.Bundle;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.marido.abamonile.R;
import com.marido.abamonile.adapter.DepositAdapter;
import com.marido.abamonile.modedl.DepositMenuitem;

import java.util.ArrayList;
import java.util.List;

public class DepositActivity extends AppCompatActivity {

    private List<DepositMenuitem> list; // Data
    private RecyclerView recyclerView;
    private DepositAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposit);

        recyclerView = findViewById(R.id.recycler_view);

        list = new ArrayList<>();

        list.add(new DepositMenuitem("Mobile Fixed Deposit",
                "Choose the term deposit and get high return on "
                        +"your saving with our attractive interest rates "
                        +"in both USD and KHR currencies.",
                "MAKE NEW DEPOSIT >",
                getResources().getDrawable(R.drawable.fixed)));
        list.add(new DepositMenuitem("Mobile Savings Account",
                "Our most popular bank account that helps you " +
                        "reach saving goal with competitive interest "
                        +"rate and other great features.",
                "OPEN NEW ACCOUNT >",
                getResources().getDrawable(R.drawable.savv)));
        list.add(new DepositMenuitem("Mobile Flexi Account",
                "With ABA Flexi Account in KHR you can deposit or/  "
                        + "and with draw funds any time and keep earning "
                        + "high interest on your ongoing balance.",
                "OPEN NEW ACCOUNT >",
                getResources().getDrawable(R.drawable.flex)));

        adapter = new DepositAdapter(list, DepositActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(adapter);
    }
}
