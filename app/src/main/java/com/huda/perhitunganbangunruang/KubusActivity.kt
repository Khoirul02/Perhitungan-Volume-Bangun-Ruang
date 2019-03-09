package com.huda.perhitunganbangunruang

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_balok.*
import kotlinx.android.synthetic.main.activity_kubus.*

class KubusActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kubus)
        btn_vkubus.setOnClickListener {
            if (txtNumber6.text.toString().isEmpty()) {
                txtNumber6.setError("Harus diisi bagian p*l*t!")
            } else {
                val a = txtNumber6.text.toString().toDouble()
                val b = this.hasil(a)
                txtHasil_kubus.setText(b.toString())
            }
        }
        btn_vkubus2.setOnClickListener {
            if (txtNumber7.text.toString().isEmpty()){
                txtNumber7.setError("Harus diisi bagian la*t")
            } else {
                val a = txtNumber7.text.toString().toDouble()
                val b= this.hasil2(a)
                txtHasil_kubus.setText(b.toString())
            }
        }
        btn_hapus_kubus.setOnClickListener {
            txtNumber6.setText("")
            txtNumber7.setText("")
            txtHasil_kubus.setText("")
        }
    }
    fun hasil( a : Double):Double{
        return a * a * a
    }
    fun hasil2(a : Double):Double{
        return Math.sqrt(a) * Math.sqrt(a) * Math.sqrt(a)
    }
}
