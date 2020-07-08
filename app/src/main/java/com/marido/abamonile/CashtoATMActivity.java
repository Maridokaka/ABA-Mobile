package com.marido.abamonile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class CashtoATMActivity extends AppCompatActivity {
    private EditText eddollar;
    private TextView tvdollar,tvfee,tvtotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cashto_atm);
        eddollar = findViewById(R.id.ed_dollar);
        tvdollar = findViewById(R.id.tv_dollar);
        tvfee = findViewById(R.id.tv_dollar_fee);
        tvtotal = findViewById(R.id.tv_dollar_total);

        eddollar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                tvdollar.setText(eddollar.getText().toString() +".00 USD");
                double amount = Double.valueOf(eddollar.getText().toString());
                double fee = amount/1000; //// 10%
                double total = amount + fee;
                tvfee.setText(fee+"0 USD");
                tvtotal.setText(total+"0 USD");
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }


}
