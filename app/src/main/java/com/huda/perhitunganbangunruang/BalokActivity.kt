package com.huda.perhitunganbangunruang

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_balok.*

class BalokActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balok)

        btn_vbalok.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber1.setError("Semua input harus diisi!")
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = txtNumber3.text.toString().toDouble()
                val d = this.hasil(a, b, c )
                txtHasil.setText(d.toString())
            }
        }
    }
    fun hasil(a: Double, b: Double, c: Double): Double {
        return a * b * c
    }
}
