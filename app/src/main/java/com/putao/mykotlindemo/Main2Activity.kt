package com.putao.mykotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    private var mTv0: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        mTv0 = findViewById(R.id.tv_0) as TextView

        mTv0!!.text = "finish"

        mTv0!!.setOnClickListener { finish() }
    }
}
