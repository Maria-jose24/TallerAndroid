package com.example.interfaz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activity_list  extends AppCompatActivity {

    ListView listaTyT;
    Button BtnVolver, BtnNoticias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listaTyT = (ListView) findViewById(R.id.lista);
        BtnVolver = (Button) findViewById(R.id.BtnVolver);
        BtnNoticias = (Button) findViewById(R.id.BtnNoticias);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.arrayLista, android.R.layout.simple_list_item_1);
        listaTyT.setAdapter(adaptador);

        listaTyT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), "Selecciona: " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });
        BtnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //finish elimina o cierra la actividad actual
                finish();
            }
        });

        BtnNoticias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //se configura
                Intent intent = new Intent(activity_list.this, activity_news.class);
                //se ejecuta la actividad
                startActivity(intent);
            }
        });
    }
}
