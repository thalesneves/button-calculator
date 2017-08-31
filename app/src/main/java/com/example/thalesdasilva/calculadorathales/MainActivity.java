package com.example.thalesdasilva.calculadorathales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

/**
 * Classe criada para codificar um objeto do tipo calculadora.
 *
 * @author Thales da Silva Neves
 * @since Classe criada em 24/08/2017
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Atributos
    private double operador1;
    private double operador2;

    private EditText edtTela;

    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;

    private Button btnC;
    private Button btnDiv;
    private Button btnX;
    private Button btnSub;
    private Button btnSum;
    private Button btnP;
    private Button btnI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recuperando a referência dos objetos
        recuperarReferencia();

        //Listeners
        ouvintes();

        //Métodos Ouvintes
        listenerMethod();

        //bloqueando a tela
        edtTela.setEnabled(false);

    }

    @Override
    public void onClick(View v) {

    }

    //Método que limpa a tela
    private void limparTela() {
        edtTela.setText(null);
    }

    private void recuperarReferencia() {

        edtTela = (EditText) findViewById(R.id.edtTela);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        btnC = (Button) findViewById(R.id.btnC);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnX = (Button) findViewById(R.id.btnX);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnSum = (Button) findViewById(R.id.btnSum);
        btnP = (Button) findViewById(R.id.btnP);
        btnI = (Button) findViewById(R.id.btnI);

    }

    private void ouvintes() {

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        btnC.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnX.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnSum.setOnClickListener(this);
        btnP.setOnClickListener(this);
        btnI.setOnClickListener(this);

    }

    private void listenerMethod() {

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTela.setText(edtTela.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTela.setText(edtTela.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTela.setText(edtTela.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTela.setText(edtTela.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTela.setText(edtTela.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTela.setText(edtTela.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTela.setText(edtTela.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTela.setText(edtTela.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTela.setText(edtTela.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTela.setText(edtTela.getText() + "9");
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limparTela();
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int t = edtTela.getText().toString().length();
                if (t == 0) {
                    char c = edtTela.getText().toString().charAt(t - 1);
                    String conta = edtTela.getText().toString();
                    if (c == 'X' || c == '+' || c == '-' || c == getString(R.string.btnDiv).charAt(0)) {
                        conta = conta.substring(0, t - 1) + getString(R.string.btnDiv);
                        edtTela.setText(conta);
                    } else {
                        edtTela.setText(edtTela.getText() + getString(R.string.btnDiv));
                    }
                }
            }
        });

        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTela.setText(edtTela.getText() + "x");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTela.setText(edtTela.getText() + "-");
            }
        });

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTela.setText(edtTela.getText() + "+");
            }
        });

        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTela.setText(edtTela.getText() + ".");
            }
        });

        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String edt = String.valueOf(edtTela.getText());

                if (edt.contains("+-*/")) {

                    switch (edt) {
                        case "+":

                            int soma = 0;

                            String[] slp = edt.split("\\+");

                            for (int i = 0; i < slp.length; i++) {
                                soma += Integer.parseInt(slp[i]);
                            }

                            edtTela.setText(String.valueOf(soma));

                            break;

                        //case "-":



                    }


                } else if (edt.contains("-")) {

                    int edt2 = Integer.parseInt(String.valueOf(edtTela.getText()));

                    String[] slp = edt.split("\\-");

                    for (int i = 0; i < slp.length; i++) {
                        edt2 = Integer.parseInt(slp[i]);
                    }

                    edtTela.setText(String.valueOf(edt2));

                } else if (edt.contains("\\X")) {
                    String slp = edt;
                    String[] slp2 = slp.split("X");
                    String s1 = slp2[0];
                    String s2 = slp2[1];
                    String multi = String.valueOf(Integer.parseInt(s1) * Integer.parseInt(s2));
                    edtTela.setText(String.valueOf(multi));
                } else if (edt.contains("/")) {
//                    String slp = edt;
//                    String[] slp2 = slp.split("/");
//                    String s1 = slp2[0];
//                    String s2 = slp2[1];
//                    String div = String.valueOf(Integer.parseInt(s1) / Integer.parseInt(s2));
//                    edtTela.setText(String.valueOf(div));

                    int div = 0;

                    String[] slp = edt.split("/");

                    for (int i = 0; i < slp.length; i++) {
                        div /= Integer.parseInt(slp[i]);
                    }

                } else {
                    System.out.println();
                }
            }
        });

    }

}//fim da classe
