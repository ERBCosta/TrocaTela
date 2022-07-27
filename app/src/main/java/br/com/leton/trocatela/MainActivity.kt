package br.com.leton.trocatela

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.com.leton.cdodesconto.R

class MainActivity : AppCompatActivity() {

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var btn6: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btn_activy1)
        btn2 = findViewById(R.id.btn_activy2)
        btn3 = findViewById(R.id.btn_activy3)
        btn4 = findViewById(R.id.btn_activy4)
        btn5 = findViewById(R.id.btn_activy5)
        btn6 = findViewById(R.id.btn_activy6)

        btn1.setOnClickListener {
            val i = Intent(this, TelaActivityBtn1::class.java)
            startActivity(i)
        }

        btn2.setOnClickListener{
            val i = Intent(this, TelaActivityBtn2::class.java)
            startActivity(i)
        }
        btn3.setOnClickListener{
            val i = Intent(this, TelaActivityBtn3::class.java)
            startActivity(i)
        }
        btn4.setOnClickListener{
            val i = Intent(this, TelaActivityBtn4::class.java)
            startActivity(i)
        }
        btn5.setOnClickListener{
            val i = Intent(this, TelaActivityBtn5::class.java)
            startActivity(i)
        }
        btn6.setOnClickListener{
            val i = Intent(this, TelaActivityBtn6::class.java)
            startActivity(i)
        }
    }
}
/*class MainActivity : AppCompatActivity() {
    //declaramos aqui o botão que escutaremos o evento de touch criando o botão:
    private lateinit var btnImc: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //abaixo é dado um valor para a variável btn para ela não ficar nula
        btnImc = findViewById(R.id.btn_imc)

        //para escutar os eventos de touch precisa do SetOnClickListener
        btnImc.setOnClickListener {
            //Para navegar para a proxima tela sempre precisaremos de um intent
            //primeiro passo é declarar uma variável nesse caso chamada de i e construimos o código
            //padrão da linha abaixo
            val i = Intent(this,ImcActivity::class.java)
            //agora que criamos a inteção na linha de cima, é necessário inicializar a intenção
            //com mais uma função padrão: StartActivity
            startActivity(i)
        }
    }
}
*/