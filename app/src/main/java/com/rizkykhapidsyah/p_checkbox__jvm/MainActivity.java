package com.rizkykhapidsyah.p_checkbox__jvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox Nama1_IDJAVA, Nama2_IDJAVA;
    Button CheckButton_IDJAVA;

    String X[] = {
            "Anda Belum Memilih Satu Pun",
            "Anda Memilih : ",
            "Anda Memilih Keduanya"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nama1_IDJAVA = findViewById(R.id.Nama1_IDXML);
        Nama2_IDJAVA = findViewById(R.id.Nama2_IDXML);
        CheckButton_IDJAVA = findViewById(R.id.CheckButton_IDXML);

        CheckButton_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Nama1_IDJAVA.isChecked() && Nama2_IDJAVA.isChecked()) {
                    Toast.makeText(MainActivity.this,
                            X[2] + " (" + (Nama1_IDJAVA.getText().toString() + " dan " + Nama2_IDJAVA.getText().toString()) + ") ",
                            Toast.LENGTH_LONG).show();
                } else {
                    if (Nama1_IDJAVA.isChecked()) {
                        Toast.makeText(MainActivity.this,
                                X[1] + Nama1_IDJAVA.getText().toString(),
                                Toast.LENGTH_LONG).show();
                    } else if (Nama2_IDJAVA.isChecked()) {
                        Toast.makeText(MainActivity.this,
                                X[1] + Nama2_IDJAVA.getText().toString(),
                                Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(MainActivity.this, X[0], Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}


