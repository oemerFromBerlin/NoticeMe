package com.example.noticeme.Model.UI

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.noticeme.Adapter.ChecklistenAdapter
import com.example.noticeme.Model.Checklists
import com.example.noticeme.R
import com.example.noticeme.databinding.FragmentChlecklisteBinding

class ChecklistenFragment: Fragment() {

    var _binding: FragmentChlecklisteBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentChlecklisteBinding.inflate(LayoutInflater.from(context))
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recChecklist.adapter = ChecklistenAdapter(arrayListOf<Checklists>(
            Checklists("Test1", "hier könnte deine Werbung stehen", true)
        )
        )

        binding.iconHome.setOnClickListener{
            findNavController().navigate(R.id.mainscreenFragment)
        }
    }
}