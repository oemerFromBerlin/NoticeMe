package com.example.noticeme.Model.UI

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.noticeme.Adapter.ChecklistenAdapter
import com.example.noticeme.Model.Checklists
import com.example.noticeme.databinding.FragmentNotizenBinding

class NotizenFragment: Fragment() {

    var _binding: FragmentNotizenBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentNotizenBinding.inflate(LayoutInflater.from(context))
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recNotizen.adapter = ChecklistenAdapter(arrayListOf<Checklists>(
        //binding.adapter = ChecklistenAdapter(arrayListOf<Checklists>(
            Checklists("Test1", "hier könnte deine Werbung stehen", true)
        )
        )
    }

    fun fillnotice(checklists: Checklists){
        Checklists("Zombie", "was das ya zalame", true)
    }
}