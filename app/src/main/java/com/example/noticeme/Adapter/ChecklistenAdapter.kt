package com.example.noticeme.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.noticeme.Model.Checklists
import com.example.noticeme.databinding.ItemChecklistBinding


class ChecklistenAdapter(var checkicheck: ArrayList<Checklists>) :
    RecyclerView.Adapter<ChecklistenAdapter.ChecklistenHolder>() {    //////Konstruktor

        inner class ChecklistenHolder(
            var binding: ItemChecklistBinding):
            RecyclerView.ViewHolder(binding.root){

    fun bind(checklists: Checklists) {
        binding.preview.text = checklists.preview
        binding.checkBox.isChecked = checklists.isOk
        binding.ueberschriftChecklist.text = checklists.ueberschrift

        binding.checkBox.setOnClickListener{
            Toast.makeText(binding.root.context, "wurde abgearbeitet", Toast.LENGTH_SHORT).show()
            //hier wird der Toast je nach zustand auf "wurde abgearbeitet" oder "noch zu bearbeiten" gesetzt
            checklists.isOk = binding.checkBox.isChecked
        }

        binding.preview.setOnClickListener{
            Toast.makeText(binding.root.context, "Checklist wurde angeklickt", Toast.LENGTH_SHORT).show()
            // Hier kommt der Code, der ausgeführt wird, wenn die Preview angeklickt wird
            // hier fehlt noch der NavGraph verweis
        }

        /*binding.ueberschriftChecklistenItem.setOnClickListener{
            Toast.makeText(binding.root.context, "${checklists.preview} wurde geöffnet", Toast.LENGTH_SHORT).show()
        }*/
    }
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChecklistenHolder {

        val binding = ItemChecklistBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChecklistenHolder(binding)
    }

    override fun onBindViewHolder(holder: ChecklistenHolder, position: Int) {
        holder.bind(checkicheck.get(position))
    }

    override fun getItemCount(): Int {
        return checkicheck.size
    }
}