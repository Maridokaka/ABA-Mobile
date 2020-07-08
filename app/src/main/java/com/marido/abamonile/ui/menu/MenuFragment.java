package com.marido.abamonile.ui.menu;

import android.content.Intent;
import android.database.DatabaseUtils;
import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.marido.abamonile.AccountActivity;
import com.marido.abamonile.CashtoATMActivity;
import com.marido.abamonile.PaymentActivity;
import com.marido.abamonile.QuickPaymentActivity;
import com.marido.abamonile.QuickTransferActivity;
import com.marido.abamonile.R;
import com.marido.abamonile.TransfersActivity;
import com.marido.abamonile.VirtualCardActivity;
import com.marido.abamonile.databinding.FragmentMenuBinding;
import com.marido.abamonile.ui.DepositActivity;

public class MenuFragment extends Fragment {
    private FragmentMenuBinding binding;
    public MenuFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_menu, container, false);
        binding.lnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), AccountActivity.class));
            }
        });
        binding.lnTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), TransfersActivity.class));
            }
        });
        binding.lnPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), PaymentActivity.class));
            }
        });
        binding.lnDeposit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), DepositActivity.class));
            }
        });
        binding.lnCashATM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), CashtoATMActivity.class));
            }
        });
        binding.lnVirtualCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), VirtualCardActivity.class));
            }
        });
        binding.lnQuickTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), QuickTransferActivity.class));
            }
        });
        binding.lnQuickPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), QuickPaymentActivity.class));
            }
        });
        return binding.getRoot();
    }
}
