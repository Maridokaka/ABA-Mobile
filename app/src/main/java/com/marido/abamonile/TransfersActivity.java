package com.marido.abamonile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.marido.abamonile.adapter.TransferMenuAdapter;
import com.marido.abamonile.modedl.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class TransfersActivity extends AppCompatActivity {
    private List<MenuItem> list; // Data
    private TransferMenuAdapter adapter; // line for connnect from list to activity (recyclerview)
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfers);

        recyclerView = findViewById(R.id.recycler_view);

        list = new ArrayList<>();

        list.add(new MenuItem(getResources().getDrawable(R.drawable.choo),
                "Choose From Template"));
        list.add(new MenuItem(getResources().getDrawable(R.drawable.ownaccount),
                "Transfer to Own Account"));
        list.add(new MenuItem(getResources().getDrawable(R.drawable.any),
                "Transfer to Any ABA Account"));
        list.add(new MenuItem(getResources().getDrawable(R.drawable.swift),
                "SWIFT International Transfer"));
        list.add(new MenuItem(getResources().getDrawable(R.drawable.cash),
                "Cash to ATM"));
        list.add(new MenuItem(getResources().getDrawable(R.drawable.trues),
                "Transfer to TrueMoney App"));
        list.add(new MenuItem(getResources().getDrawable(R.drawable.wing),
                "Transfer to WING"));
        list.add(new MenuItem(getResources().getDrawable(R.drawable.pipay),
                "Transfer to Pi Pay Wallet"));
        list.add(new MenuItem(getResources().getDrawable(R.drawable.speed),
                "Transfer to SpeedPay Wallet"));
        list.add(new MenuItem(getResources().getDrawable(R.drawable.other),
                "Transfer to Other Bank"));
        list.add(new MenuItem(getResources().getDrawable(R.drawable.lyhour),
                "Transfer to Ly Hour Veluy"));
        list.add(new MenuItem(getResources().getDrawable(R.drawable.emoney),
                "Transfer to e-money "));
        list.add(new MenuItem(getResources().getDrawable(R.drawable.bakong),
                "Bakong"));
        adapter = new TransferMenuAdapter(list,TransfersActivity.this); //
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
