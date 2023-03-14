/*
package com.example.noticeme.Model.UI

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.noticeme.Adapter.VoiceMemoAdapter
import com.example.noticeme.Model.Checklists
import com.example.noticeme.databinding.FragmentMainscreenBinding
import com.example.noticeme.databinding.FragmentVoiceMemoBinding

class VoiceMemoFragment: Fragment() {

    var _binding: FragmentVoiceMemoBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentVoiceMemoBinding.inflate(LayoutInflater.from(context))
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recViewLinks.adapter = VoiceMemoAdapter(arrayListOf<Checklists>(
            Checklists("Test1", "hier könnte deine Werbung stehen", true)
        )
        )

    }
}*/
