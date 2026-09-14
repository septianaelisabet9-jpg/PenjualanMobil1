package com.example.penjualanmobil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class DataCashActivity extends AppCompatActivity {
    Button btnCash;
    @Override
    protected void onCreate(Bundle SaveInStanceState) {
        super.onCreate(SaveInStanceState);
        setContentView(R.layout.activity_data_pembayaran_cash);

        btnCash=findViewById(R.id.tombolcash);

        btnCash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DataCashActivity.this, TambahDataCashActivity.class);
                startActivity(intent);
            }
        });

    }
}