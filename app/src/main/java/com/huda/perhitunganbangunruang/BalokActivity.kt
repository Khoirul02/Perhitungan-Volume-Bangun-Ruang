package com.huda.perhitunganbangunruang

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_balok.*

class BalokActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balok)

        btn_vbalok.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()
                || textView3.text.toString().isEmpty()) {
                txtNumber1.setError("Harus diisi bagian p*l*t!")
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = txtNumber3.text.toString().toDouble()
                val d = this.hasil(a, b, c )
                txtHasil_balok.setText(d.toString())
            }
        }
        btn_vbalok2.setOnClickListener {
            if (txtNumber4.text.toString().isEmpty() || txtNumber5.text.toString().isEmpty()){
                txtNumber4.setError("Harus diisi bagian la*t")
            } else {
                val a = txtNumber4.text.toString().toDouble()
                val b = txtNumber5.text.toString().toDouble()
                val c = this.hasil2(a,b)
                txtHasil_balok.setText(c.toString())
            }
        }
    }
    fun hasil(a: Double, b: Double, c: Double): Double {
        return a * b * c
    }
    fun hasil2(a: Double, b: Double): Double{
        return a * b
    }
}
