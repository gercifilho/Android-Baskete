package br.com.pocomartins.baskete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int pontuacaoTimeA =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoTresPontosTimeA = (Button) findViewById(R.id.tresPontosA);
        botaoTresPontosTimeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTresPontosTimeA();
            }
        });

        Button botaodoisPontosTimeA = (Button) findViewById(R.id.doisPontosA);
        botaodoisPontosTimeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDoisPontosTimeA();
            }
        });

        Button tiroslivresA = (Button) findViewById(R.id.tiroslivresA);
        tiroslivresA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUmPontosTimeA();
            }
        });




    }

    public void mostraPlacarTimeA(int pontuacao) {
        TextView placarTimeA = (TextView) findViewById(R.id.placaTimeA);
        placarTimeA.setText(String.valueOf(pontuacao));
    }

    public void addTresPontosTimeA() {
        pontuacaoTimeA = pontuacaoTimeA + 3;
        mostraPlacarTimeA(pontuacaoTimeA);
    }

    public void addDoisPontosTimeA() {
        pontuacaoTimeA = pontuacaoTimeA + 2;
        mostraPlacarTimeA(pontuacaoTimeA);
    }

    public void addUmPontosTimeA() {
        pontuacaoTimeA = pontuacaoTimeA + 1;
        mostraPlacarTimeA(pontuacaoTimeA);
    }
}
