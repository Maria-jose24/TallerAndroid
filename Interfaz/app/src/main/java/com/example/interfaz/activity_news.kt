package com.example.interfaz

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_news : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_news)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var btnVolver: Button = findViewById(R.id.btnVolver)
        btnVolver.setOnClickListener {
            //finish elimina o cierra la actividad actual
            finish()
        }
    }

    fun btn_registrar(view: View) {
        //se configura
        var intent = Intent(application, MainActivity::class.java)
        //se ejecuta la actividad
        startActivity(intent)
    }
}
