package com.murgupluoglu.librarytest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.murgupluoglu.jitpack.JitPackUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("TAG", JitPackUtils().getName())
    }
}
