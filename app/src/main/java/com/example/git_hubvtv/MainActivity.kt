package com.example.git_hubvtv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var auto1= Vehiculo()
        auto1.marca="Peugeot"
        auto1.patente="ATT123"

    }

}