package com.example.barvolume

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnHitung.setOnClickListener {
        val panjang = edtPanjang.text.toString().toIntOrNull()
            val lebar = edtLebar.text.toString().toIntOrNull()
            if (panjang !=null){
                if (lebar !=null){
                    val hitung = panjang * lebar
                    hasil.text = hitung.toString()

                }else{
                    edtLebar.error = "lebar harus diisi"
                }
            }else{
            edtPanjang.error = "panjang harus diisi"
            }
        }
    }
}
