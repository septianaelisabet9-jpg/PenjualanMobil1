package com.example.penjualanmobil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.example.penjualanmobil.databinding.ActivityTambahDataPaketBinding;

public class DataPaketActivity extends AppCompatActivity {
    Button btnDataPaket;
    @Override
    protected void onCreate(Bundle SaveInStanceState) {
        super.onCreate(SaveInStanceState);
        setContentView(R.layout.activity_data_paket);

        btnDataPaket=findViewById(R.id.tombolTambah);

        btnDataPaket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DataPaketActivity.this, TambahDataPaketActivity.class);
                startActivity(intent);
            }
        });

    }
}