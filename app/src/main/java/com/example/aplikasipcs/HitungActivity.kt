package com.example.aplikasipcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HitungActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung)

        //inisialisasi variabel
        val bilanganpertama:EditText = findViewById(R.id.angkapertama);
        val bilangankedua:EditText = findViewById(R.id.angkakedua);
        val buttontambah:Button = findViewById(R.id.buttontambah);
        val hasiltext:TextView = findViewById(R.id.hasil)

        //button tambah on click
        buttontambah.setOnClickListener{
            val bilanganpertama:Int = bilanganpertama.text.toString().toInt()
            val bilangankedua:Int = bilangankedua.text.toString().toInt()

            val hasil : Int = bilanganpertama + bilangankedua

            hasiltext.text = hasil.toString()
        }
    }


}