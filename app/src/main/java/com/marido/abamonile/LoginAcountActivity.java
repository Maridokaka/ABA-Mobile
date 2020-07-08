package com.marido.abamonile;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.marido.abamonile.ui.menu.MenuFragment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginAcountActivity extends AppCompatActivity {
    private EditText edcustomerid;
    private EditText edpassword;
    private Button btnsubmit;
    private Button btnforgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_acount);
        edcustomerid = findViewById(R.id.rd_id);
        edpassword = findViewById(R.id.rd_password);
        btnsubmit = findViewById(R.id.btn_submit);
        btnforgot = findViewById(R.id.btn_forgot);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = edcustomerid.getText().toString();
                String pwd = edpassword.getText().toString();
                if (id.equals("000000") && pwd.equals("000000")
                        || id.equals("001525") && pwd.equals("001525")
                        || id.equals("003545") && pwd.equals("003545")) {
                    Toast.makeText(getApplicationContext(), "Submit is Successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginAcountActivity.this, MainActivity.class)
                            .putExtra("ID", id));
                } else {
                    Toast.makeText(getApplicationContext(), "Submit is Error ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
