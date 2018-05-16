package com.ejemplos.dam.animation

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main2.*
import org.jetbrains.anko.toast


class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        // Listener del boton Domotta que me 'abre' la Main2Activity con el menu inferior
        val intento: Intent = Intent(this, MainActivity::class.java)
                Boton2.setOnClickListener {
                    toast("Esto funciona")
                    startActivity(intento)
                }
    }
}
