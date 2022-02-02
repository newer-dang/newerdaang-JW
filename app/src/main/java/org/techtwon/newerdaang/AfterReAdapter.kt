package com.example.recyclerview_ex

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.techtwon.newerdaang.AfterData
import org.techtwon.newerdaang.R

class AfterReAdapter(private val context: Context) : RecyclerView.Adapter<AfterReAdapter.ViewHolder>() {

    var datas = mutableListOf<AfterData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.after_s,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = datas.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(datas[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val wna: TextView = itemView.findViewById(R.id.wna)
        private val wme: TextView = itemView.findViewById(R.id.wme)


        fun bind(item: AfterData) {
            wna.text = item.name
            wme.text = item.mean

        }
    }


}