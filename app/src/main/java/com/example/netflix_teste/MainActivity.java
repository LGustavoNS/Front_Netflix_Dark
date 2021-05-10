package com.example.netflix_teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtInicio;
    private TextView txtFinal;
    private SeekBar seekBarDuracao;

    private float duracaoEp = 0000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtInicio = findViewById(R.id.txtInicio);
        txtFinal = findViewById(R.id.txtFinal);
        seekBarDuracao = findViewById(R.id.seekBarDuracao);

        //Adicionar listener Seekbar
        seekBarDuracao.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                duracaoEp = progress;
                txtInicio.setText( Math.round( duracaoEp ) + "");
                txtFinal.setText( Math.round( duracaoEp ) + "");
                duracao();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public void duracao (){

        /*
        String valorDuracao = txtInicio.getText().toString();
        if(valorDuracao ==  null || valorDuracao.equals("") ){

            Toast.makeText(
                    getApplicationContext(),
                    "Digite um valor primeiro! ",
                    Toast.LENGTH_LONG
            ).show();
        }else {

            //Converter string para double
            double valorDigitado = Double.parseDouble( valorDuracao );

            //calcula a gorjeta total
            double gorjeta = valorDigitado * (duracaoEp/100);
            double total = gorjeta + valorDigitado;

            //exibir a gorjeta e total
            //txtGorjeta.setText("R$: " + Math.round(gorjeta) );
            //txtGorjeta.setText("R$: " + gorjeta );
            //txtTotal.setText("R$: " + total );
        }

         */

    }

}