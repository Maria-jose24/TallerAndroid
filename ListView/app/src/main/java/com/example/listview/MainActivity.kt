package com.example.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Obtener los nombres del array de recursos
        val nombres = resources.getStringArray(R.array.arraylista)

        // Crear un adaptador para el ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nombres)

        // Obtener la referencia al ListView
        val lista = findViewById<ListView>(R.id.lista)

        // Establecer el adaptador en el ListView
        lista.adapter = adapter
    }
}
