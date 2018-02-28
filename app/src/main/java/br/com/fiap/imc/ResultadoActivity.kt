package br.com.fiap.imc

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import br.com.fiap.imc.extentions.format
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    fun setaImagem(resourceId: Int){
        ivStatusIMC.setImageDrawable(ContextCompat.getDrawable(this, resourceId))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        if (intent.extras != null){

            val peso = intent.getStringExtra("PESO").toDouble()
            val altura = intent.getStringExtra("ALTURA").toDouble()

            val imc = peso.div(altura*altura)

            txtStatusIMC.text = imc.format(1)

            if (imc <= 18.5){
                setaImagem(R.drawable.abaixo)
                txtStatusMessage.text = "Abaixo do peso"

            } else if (imc <= 24.9){
                setaImagem(R.drawable.ideal)
                txtStatusMessage.text = "Peso ideal"

            } else if (imc < 29.9){
                setaImagem(R.drawable.sobre)
                txtStatusMessage.text = "Levemente acima"

            } else if (imc < 34.9){
                setaImagem(R.drawable.obesidade)
                txtStatusMessage.text = "Obesidade 1"

            } else if (imc < 39.9){
                setaImagem(R.drawable.obesidade)
                txtStatusMessage.text = "Obesidade 1"

            } else {
                setaImagem(R.drawable.obesidade)
                txtStatusMessage.text = "Obesidade 3"
            }


        }
    }
}
