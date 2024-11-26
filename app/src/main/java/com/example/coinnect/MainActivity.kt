package com.example.coinnect

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/

        val btn1 = findViewById<Button>(R.id.btn1)
        val etUser = findViewById<EditText>(R.id.etUser)


        btn1.setOnClickListener {
            val user = etUser.text.toString()

            if( user.isEmpty()){
            Toast.makeText(this, "Introduce un usuario", Toast.LENGTH_SHORT).show()

            } else{
                val intent =  Intent(this, CreditActivity::class.java)
                intent.putExtra("USER", user)
                startActivity(intent)
            }





        }



    }
}