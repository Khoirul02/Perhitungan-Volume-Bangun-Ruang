package com.huda.perhitunganbangunruang

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img_balok.setOnClickListener {
            startActivity(Intent(this, BalokActivity::class.java))
        }
        img_kubus.setOnClickListener {
            startActivity(Intent(this, KubusActivity::class.java))
        }
        img_kerucut.setOnClickListener {
            startActivity(Intent(Intent(this,KerucutActivity::class.java)))
        }
        img_bola.setOnClickListener {
            startActivity(Intent(Intent(this,BolaActivity::class.java)))
        }
    }

}