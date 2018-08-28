package com.example.ecosistemas.listas_clase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText et_nombre;
    private Button btn_confirmar;
    private ListView lv_estudiantes;

    private ArrayList<String> estudiantes;
    private ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        estudiantes = new ArrayList<>();
        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, estudiantes);


        et_nombre = findViewById(R.id.et_nombre);
        btn_confirmar = findViewById(R.id.btn_confirmar);
        lv_estudiantes = findViewById(R.id.lv_estudiantes);

        lv_estudiantes.setAdapter(adaptador);

        btn_confirmar.setOnClickListener(mListener);
    }

    View.OnClickListener mListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };


}
