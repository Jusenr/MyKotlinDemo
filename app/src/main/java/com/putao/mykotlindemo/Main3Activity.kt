package com.putao.mykotlindemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class Main3Activity : AppCompatActivity() {

    private var mTv0: TextView? = null
    private var mTv1: TextView? = null

    private var mBtn_0: Button? = null
    private var mBtn_1: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTv0 = findViewById(R.id.tv_0) as TextView
        mTv1 = findViewById(R.id.tv_1) as TextView

        mTv0!!.text = "Main3Activity"
        mTv1!!.text = "this"

        mBtn_0 = findViewById(R.id.btn_0) as Button
        mBtn_1 = findViewById(R.id.btn_1) as Button

        mBtn_0!!.text = "to-->Main"
        mBtn_1!!.text = "to-->Main2"

        mBtn_0!!.setOnClickListener { startActivity(Intent(this, MainActivity::class.java)) }
        mBtn_1!!.setOnClickListener { startActivity(Intent(this, Main2Activity::class.java)) }

    }
}
