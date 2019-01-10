package com.example.rpereira.objectbeteweenactivitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        TextView tvResultado = findViewById(R.id.idtvResultado);

        Intent intent = getIntent();

        VeiculoModel veiculoModel = (VeiculoModel) intent.getSerializableExtra("veiculo");

        tvResultado.setText(intent.getStringExtra("tag"));

    }
}
