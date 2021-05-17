package br.edu.infnet.bancomr


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.edu.infnet.bancomr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var biniding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        biniding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(biniding.root)

        biniding.saldo.setOnClickListener {
            var intent = Intent(this, Saldo::class.java)
            startActivity(intent)
        }

        biniding.faturas.setOnClickListener {
            var intent = Intent(this, Faturas::class.java)
            startActivity(intent)
        }

        biniding.transferencia.setOnClickListener {
            var intent = Intent(this, Transferencia::class.java)
            startActivity(intent)
        }
        biniding.poupanca.setOnClickListener {
            var intent = Intent(this, Poupanca::class.java)
            startActivity(intent)
        }
    }
}