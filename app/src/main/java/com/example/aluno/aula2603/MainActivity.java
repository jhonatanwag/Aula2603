package com.example.aluno.aula2603;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        private final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view){
        EditText editValor1 = (EditText)findViewById(R.id.editValor1);
        EditText editValor2 = (EditText)findViewById(R.id.editValor2);
        RadioButton radioSomar = (RadioButton) findViewById(R.id.radioSomar);
        RadioButton radioSubtrair = (RadioButton) findViewById(R.id.radioSubtrair);
        RadioButton radioMultiplicar = (RadioButton) findViewById(R.id.radioMultiplicar);
        RadioButton radioDividir = (RadioButton) findViewById(R.id.radioDividir);

        Double valor1 = Double.parseDouble(editValor1.getText().toString());
        Double valor2 = Double.parseDouble(editValor2.getText().toString());

        if(radioSomar.isChecked()){
            Toast.makeText(this,
                    "A soma é:"+(valor1+valor2),
                    Toast.LENGTH_SHORT).show();
        }else  if(radioSubtrair.isChecked()){
            Toast.makeText(this,
                    "A sub é:"+(valor1-valor2),
                    Toast.LENGTH_SHORT).show();
        }else if(radioMultiplicar.isChecked()){
            Toast.makeText(this,
                    "A Mult é:"+(valor1*valor2),
                    Toast.LENGTH_SHORT).show();
        }else if(radioDividir.isChecked()){
            Toast.makeText(this,
                    "A Div é:"+(valor1/valor2),
                    Toast.LENGTH_SHORT).show();
        }
        Log.i(TAG,"Meu Console");
    }

    public void chamarSegundaTela(View view){
        Intent intent = new Intent(this, SegundaTela.class);
        startActivity(intent);

    }
}
