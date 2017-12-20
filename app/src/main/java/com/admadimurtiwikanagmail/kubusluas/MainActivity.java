package com.admadimurtiwikanagmail.kubusluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txthasil ;
    EditText edt_sisi ;
    Button btnHitung ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txthasil = (TextView)findViewById(R.id.txt_hasil);
        edt_sisi = (EditText) findViewById(R.id.sisi);
        btnHitung = (Button)findViewById(R.id.btn);

        // Listener button
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int s,luas ;
                s=Integer.parseInt(edt_sisi.getText().toString());

                if (TextUtils.isEmpty(edt_sisi.getText()))
                    {
                        Toast.makeText(MainActivity.this, "Masukan angka", Toast.LENGTH_SHORT).show();
                    }
                else
                    {
                        try
                            {
                                luas = s * s * 6;
                                txthasil.setText("Luas : "+luas);
                            }


                        catch (NumberFormatException e )
                            {
                              Toast.makeText(MainActivity.this, "Format salah", Toast.LENGTH_SHORT).show();
                            }

                    }

            }
        });


    }
}
