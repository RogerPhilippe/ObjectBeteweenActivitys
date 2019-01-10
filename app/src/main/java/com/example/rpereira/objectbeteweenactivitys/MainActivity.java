package com.example.rpereira.objectbeteweenactivitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etEnviar = findViewById(R.id.idevEnviar);

        Button btnEnviar = findViewById(R.id.idbtnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randonId;
                randonId = new Random();

                VeiculoModel veiculoModel = new VeiculoModel.Builder()
                        .setIdVeiculo( randonId.nextInt(100) )
                        .setTipoVeiculo("Aereo")
                        .setVeiculo("Avião")
                        .build();

                Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);

                intent.putExtra("veiculo", veiculoModel);

                if(!etEnviar.getText().toString().isEmpty()) {

                    intent.putExtra("tag", etEnviar.getText().toString());

                    startActivity(intent);

                }

            }
        });
    }
}
