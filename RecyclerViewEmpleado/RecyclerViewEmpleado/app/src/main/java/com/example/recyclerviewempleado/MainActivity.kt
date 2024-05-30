package com.example.recyclerviewempleado

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewempleado.adapters.adapterEmpleado
import com.example.recyclerviewempleado.models.empleado

class MainActivity : AppCompatActivity() {
    lateinit var listEmpleado:MutableList<empleado>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //se inicializa el mutablelist
        listEmpleado = mutableListOf()
        //se agrega elemtos
        var empleado=empleado("Maria","Instructora")
        listEmpleado.add(empleado)
        listEmpleado.add(empleado("Carlos","Instructor"))
        listEmpleado.add(empleado("Cristian","Vocero"))
        listEmpleado.add(empleado("Gloria","Representante"))
        listEmpleado.add(empleado("Santiago","Aprendiz"))
        listEmpleado.add(empleado("Leonardo","Aprendiz"))
        listEmpleado.add(empleado("Luis","Aprendiz"))
        listEmpleado.add(empleado("Leidy","Aprendiz"))

        //se crea y asocia una varibale con el objeto de la vista
        var recycler=findViewById<RecyclerView>(R.id.RVEmpleado)
        recycler.layoutManager = LinearLayoutManager(applicationContext)
        //se crea el adpatador
        var adapterEmpleado=adapterEmpleado(listEmpleado,applicationContext)
        //se asocia el adaptador con objeto
        recycler.adapter=adapterEmpleado

    }
}