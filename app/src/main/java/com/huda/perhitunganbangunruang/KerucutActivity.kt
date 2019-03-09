package com.huda.perhitunganbangunruang

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kerucut.*
import kotlinx.android.synthetic.main.activity_kubus.*

class KerucutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kerucut)
        btn_vkerucut.setOnClickListener {
            if (txtNumber8.text.toString().isEmpty()|| txtNumber9.text.toString().isEmpty()) {
                txtNumber8.setError("Harus diisi bagian p*l*t!")
            } else {
                val a = txtNumber8.text.toString().toDouble()
                val b = txtNumber9.text.toString().toDouble()
                val c = this.hasil(a,b)
                txtHasil_kerucut.setText(c.toString())
            }
        }
        btn_hapus_kerucut.setOnClickListener {
            txtNumber8.setText("")
            txtNumber9.setText("")
            txtHasil_kerucut.setText("")
        }
    }
    fun hasil(a:Double, b:Double): Double {
        return 0.33 * 3.14 * a * a * b
    }
}
