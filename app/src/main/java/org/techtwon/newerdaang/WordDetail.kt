package org.techtwon.newerdaang

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.word_detail.*

class WordDetail : AppCompatActivity() {

    lateinit var wname: String
    lateinit var wmean: String

    override fun onCreate(savedInstanceState: Bundle?) {
        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.hide()
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_detail)

        wname = intent.getSerializableExtra("name").toString()
        wmean = intent.getSerializableExtra("mean").toString()
        wn.text = wname
        wm.text = wmean

        more.setOnClickListener {
            Intent(this, WordMore::class.java).apply {
                putExtra("name", wn.text)
                putExtra("mean", wm.text)
                startActivity(this)
            }
        }



    }
}