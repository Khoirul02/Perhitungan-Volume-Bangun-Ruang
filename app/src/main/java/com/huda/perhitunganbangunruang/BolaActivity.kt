package com.huda.perhitunganbangunruang

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bola.*
import kotlinx.android.synthetic.main.activity_kerucut.*
import kotlinx.android.synthetic.main.activity_kubus.*

class BolaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bola)
        btn_vbola.setOnClickListener {
            if (txtNumber10.text.toString().isEmpty()) {
                txtNumber10.setError("Harus diisi bagian p*l*t!")
            } else {
                val a = txtNumber10.text.toString().toDouble()
                val b = this.hasil(a)
                txtHasil_bola.setText(b.toString())
            }
        }
        btn_hapus_bola.setOnClickListener {
            txtNumber10.setText("")
            txtHasil_bola.setText("")
        }
    }
    fun hasil(a:Double): Double {
        return 1.33 * 3.14 * a * a * a
    }
}
