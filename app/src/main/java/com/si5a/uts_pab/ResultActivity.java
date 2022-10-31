package com.si5a.uts_pab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView tvNama,tvNomorPendaftaran,tvJalurPendaftaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvNama=findViewById(R.id.tv_nama);
        tvNomorPendaftaran=findViewById(R.id.tv_nopendaftaran);
        tvJalurPendaftaran=findViewById(R.id.tv_jalur);

        Intent intent = getIntent();
        tvNama.setText(intent.getStringExtra("intNama"));
        tvNomorPendaftaran.setText(intent.getStringExtra("intnomor"));
        tvJalurPendaftaran.setText(intent.getStringExtra("intJalur"));
    }
}