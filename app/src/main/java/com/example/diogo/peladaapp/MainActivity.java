package com.example.diogo.peladaapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clique(final View view) {


        final Random random = new Random();

        final String[] cores = {"Time LARANJA", "Time AZUL", "Time PRETO"};
        final int x1 = random.nextInt(cores.length);
        String s = cores[x1];

        final Button btRandomico = (Button) findViewById(R.id.button);
        final TextView tvrandomico = (TextView) findViewById(R.id.textView);
        if (btRandomico != null) btRandomico.setOnClickListener(new Button.OnClickListener() {
                                                                    public void onClick(View v) {

                                                                        tvrandomico.setText(cores[x1]);

                                                                    }
                                                                }
        );

    }
}
