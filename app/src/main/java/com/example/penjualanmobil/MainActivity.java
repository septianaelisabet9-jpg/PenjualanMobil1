package com.example.penjualanmobil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnMobil, btnPembeli, btnPaket, btnCash, btnKredit, btnCicil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMobil = findViewById(R.id.tombolmobil);
        btnPembeli = findViewById(R.id.tombolpembeli);
        btnPaket = findViewById(R.id.tombolpaket);
        btnCash = findViewById(R.id.tombolcash);
        btnKredit = findViewById(R.id.tombolkredit);
        btnCicil = findViewById(R.id.tombolcicilan);

        btnMobil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DataMobilActivity.class);
                startActivity(intent);
            }
        });

        btnPembeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DataPembeliActivity.class);
                startActivity(intent);
            }
        });

        btnPaket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DataPaketActivity.class);
                startActivity(intent);
            }
        });

        btnCash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DataCashActivity.class);
                startActivity(intent);
            }
        });

        btnKredit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DataKreditActivity.class);
                startActivity(intent);
            }
        });

        btnCicil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DataCicilActivity.class);
                startActivity(intent);
            }
        });
    }
}