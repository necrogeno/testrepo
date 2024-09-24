package com.example.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText edad_edit = findViewById(R.id.editText);
        Button button = findViewById(R.id.boton);
        TextView result = findViewById(R.id.resultado);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edad = edad_edit.getText().toString();
                if(!edad.isEmpty()){
                    int edadint = Integer.parseInt(edad);
                    int resultado = edadint * 7;
                    String resultadofinal = "La edad del can es: "+ resultado + " años";
                    result.setText(resultadofinal);
                }else{
                    Toast.makeText(MainActivity.this, "Se debe agregar una edad", Toast.LENGTH_LONG).show();
                }


            }
        });
    }
}