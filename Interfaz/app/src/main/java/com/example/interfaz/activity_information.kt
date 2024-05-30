package com.example.interfaz

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_information : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_information)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var BtnVolver: Button = findViewById(R.id.BtnVolver)
        BtnVolver.setOnClickListener{
            //finish elimina o cierra la actividad actual
            finish()
        }
    }
    fun BtnLista(view:View){
        //Se configura
        var intent = Intent(application, activity_list::class.java)
        //Se ejecuta la actividad
        startActivity(intent)
    }
}