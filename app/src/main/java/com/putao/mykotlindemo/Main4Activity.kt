package com.putao.mykotlindemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class Main4Activity : AppCompatActivity() {

    private var mBtn_0: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        mBtn_0 = findViewById(R.id.btn_0) as Button

        mBtn_0!!.text = "to-->Main"

        mBtn_0!!.setOnClickListener { startActivity(Intent(this, MainActivity::class.java)) }
    }
}
