package com.example.coinnect

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CreditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_credit)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/
        val user = intent.getStringExtra("USER")
        val btn2 = findViewById<Button>(R.id.btn2)
        val tvacerca = findViewById<TextView>(R.id.tvacerca)
        tvacerca.text = getString(R.string.acerca , user)

        btn2.setOnClickListener {
            val intent2 = Intent(Intent.ACTION_SEND).apply {
                type = "message/rfc822"
                putExtra(Intent.EXTRA_EMAIL , arrayOf("coinnectsoporte@gmail.com"))
                putExtra(Intent.EXTRA_SUBJECT , "Consulta de la app Coinnect")
                putExtra(Intent.EXTRA_TEXT , "Hola buenas, mi usuario es :$tvacerca")
            }
            startActivity(Intent.createChooser(intent2, "Elige la aplicacion de correo"))
        }
    }
}