package org.techtwon.newerdaang

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_ex.AfterReAdapter

class AfterRe : AppCompatActivity() {
    lateinit var reAdapter: AfterReAdapter
    val datas = mutableListOf<AfterData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.after)

        initRecycler()
    }


    private fun initRecycler() {
        reAdapter = AfterReAdapter(this)
        val afterrec: RecyclerView = findViewById(R.id.after_search)
        afterrec.adapter = reAdapter

        datas.apply {
            add(AfterData("asd","dasdasdasd"))
            reAdapter.datas = datas
            reAdapter.notifyDataSetChanged()

        }
    }
}