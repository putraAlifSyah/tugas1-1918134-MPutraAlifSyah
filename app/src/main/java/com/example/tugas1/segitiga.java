package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segitiga extends AppCompatActivity {
    EditText alas, tinggi;
    Button button;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        alas = findViewById(R.id.in_alas);
        tinggi = findViewById(R.id.in_tinggi);
        tvHasil = findViewById(R.id.hasil);
        button = findViewById(R.id.hitung);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Alas = alas.getText().toString().trim();
                String Tinggi = tinggi.getText().toString().trim();
                boolean isEmpty = false;
                boolean isInvalid = false;
                if (TextUtils.isEmpty(Alas)) {
                    isEmpty = true;
                    alas.setError("Masukkan Nilai Alas");
                }
                if (TextUtils.isEmpty(Tinggi)) {
                    isEmpty = true;
                    tinggi.setError("Masukkan Nilai Tinggi");
                }
                if (!isEmpty && !isInvalid) {
                    double luas = 0.5 * Double.parseDouble(Alas) * Double.parseDouble(Tinggi);
                    tvHasil.setText(String.valueOf(luas));
                }

            }
        });
    }
}