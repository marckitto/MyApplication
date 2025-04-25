package com.example.seuapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TrapAdapter(private val trapList: List<TrapDataModel>) : RecyclerView.Adapter<TrapAdapter.TrapViewHolder>() {

    class TrapViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val locationTextView: TextView = itemView.findViewById(R.id.locationTextView)
        val statusTextView: TextView = itemView.findViewById(R.id.statusTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrapViewHolder {
        //val view = LayoutInflater.from(parent.context).inflate(R.layout.trap_item, parent, false)
        //return TrapViewHolder(view)
        return TODO("Provide the return value")
    }

    override fun onBindViewHolder(holder: TrapViewHolder, position: Int) {
        val trap = trapList[position]
        holder.locationTextView.text = trap.location
        holder.statusTextView.text = if (trap.isOperational) "Operacional" else "Não Operacional"
    }

    override fun getItemCount(): Int {
        return trapList.size
    }
}