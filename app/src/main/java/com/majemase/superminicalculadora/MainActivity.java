package com.majemase.superminicalculadora;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView lblSol;
    EditText inNum1;
    EditText inNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSuma = findViewById(R.id.btnSuma);
        Button btnResta = findViewById(R.id.btnResta);
        Button btnMultiplica = findViewById(R.id.btnMultiplica);
        Button btnDivide = findViewById(R.id.btnDividir);
        Button btnBorrar = findViewById(R.id.btnBorrar);
        inNum1 = findViewById(R.id.inNum1);
        inNum2 = findViewById(R.id.inNum2);
        lblSol = findViewById(R.id.lblSol);
        btnSuma.setOnClickListener(v -> sumar(inNum1.getText(), inNum2.getText()));
        btnResta.setOnClickListener(v -> restar(inNum1.getText(), inNum2.getText()));
        btnMultiplica.setOnClickListener(v -> multiplicar(inNum1.getText(), inNum2.getText()));
        btnDivide.setOnClickListener(v -> dividir(inNum1.getText(), inNum2.getText()));
        btnBorrar.setOnClickListener(v -> borrar());
    }

    public void sumar(Editable num1, Editable num2){
        if(num1.toString().trim().isEmpty()){
            Log.i("Error", "El numero 1 esta vacio");
        }
        if(num2.toString().trim().isEmpty()){
            Log.i("Error", "El numero 2 esta vacio");
        }
        try {
            int res = Integer.parseInt(num1.toString()) + Integer.parseInt(num2.toString());
            lblSol.setText(String.valueOf(res));
        }catch(NumberFormatException e){
            Toast toast = Toast.makeText(getApplicationContext(), "Debes introducir dos numeros", Toast.LENGTH_SHORT);
            toast.show();
            Log.i("Error", "Entrada no válida");
        }
    }

    public void restar(Editable num1, Editable num2){
        if(num1.toString().trim().isEmpty()){
            Log.i("Error", "El numero 1 esta vacio");
        }
        if(num2.toString().trim().isEmpty()){
            Log.i("Error", "El numero 2 esta vacio");
        }
        try {
            int res = Integer.parseInt(num1.toString()) - Integer.parseInt(num2.toString());
            lblSol.setText(String.valueOf(res));
        }catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(), "Debes introducir dos númeross", Toast.LENGTH_SHORT).show();
            Log.i("Error", "Entrada no válida");
        }
    }

    public void multiplicar(Editable num1, Editable num2){
        if(num1.toString().trim().isEmpty()){
            Log.i("Error", "El numero 1 esta vacio");
        }
        if(num2.toString().trim().isEmpty()){
            Log.i("Error", "El numero 2 esta vacio");
        }
        try {
            int res = Integer.parseInt(num1.toString()) * Integer.parseInt(num2.toString());
            lblSol.setText(String.valueOf(res));
        }catch(NumberFormatException e){
            Toast toast = Toast.makeText(getApplicationContext(), "Debes introducir dos númeross", Toast.LENGTH_SHORT);
            toast.show();
            Log.i("Error", "Entrada no válida");
        }
    }

    public void dividir(Editable num1, Editable num2){
        if(num1.toString().trim().isEmpty()){
            Log.i("Error", "El numero 1 esta vacio");
        }
        if(num2.toString().trim().isEmpty()){
            Log.i("Error", "El numero 2 esta vacio");
        }
        try {
            int res = Integer.parseInt(num1.toString()) / Integer.parseInt(num2.toString());
            lblSol.setText(String.valueOf(res));
        }catch(NumberFormatException e){
            Toast toast = Toast.makeText(getApplicationContext(), "Debes introducir dos númeross", Toast.LENGTH_SHORT);
            toast.show();
            Log.i("Error", "Entrada no válida");
        }catch(ArithmeticException e){
            Toast toast = Toast.makeText(getApplicationContext(), "No se puede dividir entre 0", Toast.LENGTH_SHORT);
            toast.show();
            Log.i("Error", "Division entre 0");
        }
    }

    public void borrar(){
        lblSol.setText("");
        inNum1.setText("");
        inNum2.setText("");
    }
}