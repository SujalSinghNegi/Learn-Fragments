package com.example.learnfragments

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.learnfragments.databinding.ActivityMainBinding
import com.example.learnfragments.fragments.BlankFragment1
import kotlin.getValue

class MainActivity : AppCompatActivity() {
  val binding by lazy{
      ActivityMainBinding.inflate(layoutInflater)
  }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var manager = supportFragmentManager // support of fm
        var tr= manager.beginTransaction() // startof transaction
        tr.replace(R.id.frame, BlankFragment1()) // what tr,
        tr.commit() // final done
    }
}