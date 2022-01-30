package org.techtwon.newerdaang

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.word_detail.*

class WordMore : AppCompatActivity(){

    lateinit var wname : String
    lateinit var wmean : String

    override fun onCreate(savedInstanceState: Bundle?) {
        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.hide()
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_more)

        wname = intent.getSerializableExtra("name").toString()
        wmean = intent.getSerializableExtra("mean").toString()
        wn.text = wname
        wm.text = wmean

    }


}