package br.com.pocomartins.baskete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int pontuacaoTimeA = 0;
    private int pontuacaoTimeB = 0;

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

        Button botaoTresPontosTimeB = (Button) findViewById(R.id.tresPontosB);
        botaoTresPontosTimeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTresPontosTimeB();
            }
        });

        Button botaodoisPontosTimeB = (Button) findViewById(R.id.doisPontosB);
        botaodoisPontosTimeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDoisPontosTimeB();
            }
        });

        Button tiroslivresB = (Button) findViewById(R.id.tiroslivresB);
        tiroslivresB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUmPontosTimeB();
            }
        });

        Button reinicarPartida = (Button) findViewById(R.id.reiniciar);
        reinicarPartida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reiniciarPartida();
            }
        });


    }

    public void mostraPlacarTimeA(int pontuacao) {
        TextView placarTimeA = (TextView) findViewById(R.id.placaTimeA);
        placarTimeA.setText(String.valueOf(pontuacao));
    }

    public void mostraPlacarTimeB(int pontuacao) {
        TextView placarTimeB = (TextView) findViewById(R.id.placaTimeB);
        placarTimeB.setText(String.valueOf(pontuacao));
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

    public void addTresPontosTimeB() {
        pontuacaoTimeB = pontuacaoTimeB + 3;
        mostraPlacarTimeB(pontuacaoTimeB);
    }

    public void addDoisPontosTimeB() {
        pontuacaoTimeB = pontuacaoTimeB + 2;
        mostraPlacarTimeB(pontuacaoTimeB);
    }

    public void addUmPontosTimeB() {
        pontuacaoTimeB = pontuacaoTimeB + 1;
        mostraPlacarTimeB(pontuacaoTimeB);
    }

    public void reiniciarPartida(){
        pontuacaoTimeA = 0;
        pontuacaoTimeB = 0;

        mostraPlacarTimeA(pontuacaoTimeA);
        mostraPlacarTimeB(pontuacaoTimeB);


    }
}
