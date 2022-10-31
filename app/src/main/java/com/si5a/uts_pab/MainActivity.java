package com.si5a.uts_pab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etNama,etNomorPendaftaran;
    private Spinner spJalurPendaftaran;
    private CheckBox cbKonfirmasi;
    private Button btndaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama=findViewById(R.id.et_nama);
        etNomorPendaftaran=findViewById(R.id.et_nomorpendaftaran);
        spJalurPendaftaran=findViewById(R.id.sp_jalurpendaftaran);
        cbKonfirmasi=findViewById(R.id.cb_konfirmasi);

        btndaftar=findViewById(R.id.btn_daftar);
        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama,nomorpendaftaran,konfirmasidaftar,jalurpendaftaran;

                nama=etNama.getText().toString();
                nomorpendaftaran=etNomorPendaftaran.getText().toString();
                jalurpendaftaran=spJalurPendaftaran.getSelectedItem().toString();

                if (nama.trim().equals("")){
                    etNama.setError("Nama Tidak Boleh Kosong");
                }
                else if (nomorpendaftaran.trim().equals("")){
                    etNomorPendaftaran.setError("Nomor Pendaftaran Tidak Boleh Kosong");
                }
                else if (jalurpendaftaran.equals("Jalur Pendaftaran")){
                    Toast.makeText(MainActivity.this, "Jalur Pendaftaran Belum Dipilih", Toast.LENGTH_SHORT).show();
                }
                else if (!(cbKonfirmasi.isChecked())){
                    Toast.makeText(MainActivity.this, "Silakan Centang Terlebih Dahulu !!!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                    intent.putExtra("intNama",nama);
                    intent.putExtra("intnomor",nomorpendaftaran);
                    intent.putExtra("intJalur",jalurpendaftaran);
                    startActivity(intent);
                }
            }
        });

    }
}