package com.example.noticeme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.noticeme.Model.UI.NotizenFragment
import com.example.noticeme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var notizen: NotizenFragment
    //private lateinit var adapter: NotizenUndChecklistenAdapter
    //private lateinit var Checklists: ArrayList<Checklists>  // hier werden die Felder per Usereingabe befüllt


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}

