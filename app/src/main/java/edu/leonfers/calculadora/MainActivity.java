package edu.leonfers.calculadora;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import java.io.StringWriter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcular(View view){
        checarRadioButtom(findViewById(R.id.soma));
        checarRadioButtom(findViewById(R.id.subtrair));
        checarRadioButtom(findViewById(R.id.multiplicar));
        checarRadioButtom(findViewById(R.id.dividir));

    }


    public double[] receberValores (View view){


        EditText et = (EditText) findViewById(R.id.numero1);
        String str = et.getText().toString();

        double f1=Double.valueOf(str);

        et = (EditText) findViewById(R.id.numero2);
        str = et.getText().toString();

        double f2=Double.valueOf(str);

        double[] f=new double[2];
                f[0]=f1;
                f[1]=f2;
        return f;
    }

    public void checarRadioButtom(View view){
        boolean checked = ((RadioButton)view).isChecked();
        double[] f = new double[2];
        double f1;
        String str;
        switch (view.getId()){
            case R.id.soma:
                if(checked) {
                    f = receberValores(view);
                    f1=soma(f);
                    str=String.valueOf(f1);
                    ((TextView)findViewById(R.id.resultados)).setText(str);

                }
                break;
            case R.id.subtrair:
                if(checked)
                {
                    f = receberValores(view);
                    f1=sub(f);
                    str=String.valueOf(f1);
                    ((TextView)findViewById(R.id.resultados)).setText(str);

                }
                    break;
            case R.id.dividir:
                if(checked){
                    f = receberValores(view);
                    f1=div(f);
                    str=String.valueOf(f1);
                    ((TextView)findViewById(R.id.resultados)).setText(str);

                }
                    break;
            case R.id.multiplicar:
                if(checked){
                    f = receberValores(view);
                    f1=mult(f);
                    str=String.valueOf(f1);
                    ((TextView)findViewById(R.id.resultados)).setText(str);

                }
                    break;
        }
    }


    public double soma(double[] f){

        f[0]=f[0]+f[1];
        return f[0];
    }
    public double sub(double[] f){
        f[0]=f[0]-f[1];
        return f[0];
    }
    public double div(double[] f){
        f[0]=f[0]/f[1];
        return f[0];
    }
    public double mult(double[] f){
        f[0]=f[0]*f[1];
        return f[0];
    }


}
