package br.com.fiap.imc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener {
            val telaResultado = Intent(this, ResultadoActivity::class.java)
            telaResultado.putExtra("PESO", txtPeso.text.toString())
            telaResultado.putExtra("ALTURA", txtAltura.text.toString())
            startActivity(telaResultado)
        }

        btnLimpar.setOnClickListener {
            txtPeso.setText("")
            txtAltura.setText("")
            txtPeso.requestFocus()
        }
    }
}
