/*
package com.example.noticeme.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.noticeme.Model.Checklists
import com.example.noticeme.Model.VoiceMemos
import com.example.noticeme.R
import com.example.noticeme.databinding.ItemChecklistBinding
import com.example.noticeme.databinding.ItemVoicememoBinding


class VoiceMemoAdapter(var memos: VoiceMemos) :
    RecyclerView.Adapter<VoiceMemoAdapter.VoiceMemoHolder>() {    //////Konstruktor

    inner class VoiceMemoHolder(
        var binding: ItemVoicememoBinding):
        RecyclerView.ViewHolder(binding.root){

        fun bind(voicememo: VoiceMemos) {
            binding.frequzenzen.setImageResource = voicememo.frequenzen.setImageResource(R.id.frequzenzen)
            binding.playpause.setImageResource = checklists.isOk
            binding.ueberschriftChecklist.text = checklists.ueberschrift
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
*/
