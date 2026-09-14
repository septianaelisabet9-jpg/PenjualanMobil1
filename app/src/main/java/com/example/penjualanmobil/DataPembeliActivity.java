package com.example.penjualanmobil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class DataPembeliActivity extends AppCompatActivity {
    Button btnPembeli;
    @Override
    protected void onCreate(Bundle SaveInStanceState) {
        super.onCreate(SaveInStanceState);
        setContentView(R.layout.activity_data_pembeli);

        btnPembeli=findViewById(R.id.tombolpembeli);

        btnPembeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DataPembeliActivity.this, TambahDataPembeliActivity.class);
                startActivity(intent);
            }
        });

    }
}