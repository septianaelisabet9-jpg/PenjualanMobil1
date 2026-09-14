package com.example.penjualanmobil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class DataMobilActivity extends AppCompatActivity {
    Button btnDatapembeli;
    @Override
    protected void onCreate(Bundle SaveInStanceState) {
        super.onCreate(SaveInStanceState);
        setContentView(R.layout.activity_data_mobil);

        btnDatapembeli=findViewById(R.id.tombolTambah);

        btnDatapembeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DataMobilActivity.this, TambahDataMobilActivity.class);
                startActivity(intent);
            }
        });

    }
}