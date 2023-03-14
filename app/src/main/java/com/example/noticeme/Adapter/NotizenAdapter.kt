package com.example.noticeme.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.noticeme.Model.Checklists
import com.example.noticeme.Model.Notizens
import com.example.noticeme.R
import com.example.noticeme.databinding.ItemChecklistBinding
import com.example.noticeme.databinding.ItemNoticeBinding


class NotizenAdapter(var notizen: ArrayList<Notizens>) :
    RecyclerView.Adapter<NotizenAdapter.NotizenHolder>() {    //////Konstruktor

    inner class NotizenHolder(
        var binding: ItemNoticeBinding):
        RecyclerView.ViewHolder(binding.root){

        fun bind(notizens: Notizens) {
            binding.preview.text = notizens.preview
            binding.schloss.isPressed = notizens.verschluesselt
            binding.ueberschriftNotizItem.text = notizens.ueberschrift

            binding.schloss.setOnClickListener{
                Toast.makeText(binding.root.context, "schloss auf", Toast.LENGTH_SHORT).show()
                //hier wird der Toast je nach zustand auf "wurde abgearbeitet" oder "noch zu bearbeiten" gesetzt
                notizens.verschluesselt =  binding.schloss.isPressed
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotizenHolder {
        val binding = ItemNoticeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NotizenHolder(binding)
    }

    override fun onBindViewHolder(holder: NotizenHolder, position: Int) {
        holder.bind(notizen.get(position))

    }

    override fun getItemCount(): Int {
        return notizen.size
    }
}