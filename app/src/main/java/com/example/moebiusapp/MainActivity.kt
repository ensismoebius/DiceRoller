package com.example.moebiusapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tt : Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tt = Intent(this, Teste::class.java)

        val button : Button = findViewById(R.id.btnJogar)
        button.setOnClickListener {
            this.jogar()
        }
    }

    private fun jogar(){
        val mensagem : TextView = findViewById(R.id.txtMensagem)
        mensagem.text = "Uga"
        // val tt = Intent(this, Teste::class.java)
        // To pass any data to next activity
        tt.putExtra("ugamei", "testetstete")
        // start your next activity
        startActivity(tt)
    }
}