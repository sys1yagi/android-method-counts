package com.sys1yagi.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val name: String? = null
        Toast.makeText(this, name ?: "jack and", Toast.LENGTH_SHORT).show()
        listOf(name).map { it?.plus(it) }

        val a = listOf("a", "b", "c").map({ value -> value + value })
        
    }
}
