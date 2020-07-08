package com.marido.abamonile.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import com.marido.abamonile.R;


public class GalleryFragment extends Fragment {

    private EditText ed_dollar;
    private Button btnConvert;
    private TextView tvResult;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


    View root = inflater.inflate(R.layout.fragment_gallery, container, false);

    ed_dollar = root.findViewById(R.id.ed_dollar_money);
    btnConvert = root.findViewById(R.id.btn_convert);
    tvResult = root.findViewById(R.id.tv_khmer_money);

    btnConvert.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            convertToKhmer();
        }
    });

        return root;
    }

    private void convertToKhmer(){

        long dollars = Long.parseLong(ed_dollar.getText().toString());
        long khmer = 4100;
        long result = dollars * khmer ;
        String riels = String.valueOf(result);
                //.replace(".0","");
        tvResult.setText("Money in Khmer is : "+riels+" រៀល");
    }

}