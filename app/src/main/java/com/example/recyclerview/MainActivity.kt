package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding
    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}

val contact = listOf(
    Contact (
        name = "Mauricio Gomes das Chagas",
        phone = "(61) 56565-6565",
        R.drawable.sample14
    ),
    Contact (
        name = "Jéssica Gonçalves dos Santos",
        phone = "(61) 46544-4545",
        R.drawable.sample3
    ),
    Contact(
        name = "José Fulano",
        phone = "(61) 4545-4545",
        R.drawable.sample5
    ),
    Contact(
        name = "Maria Fulano",
        phone = "(61) 4545-4545",
        R.drawable.sample1
    ),
    Contact(
        name = "Maria Fulano",
        phone = "(61) 4545-4545",
        R.drawable.sample2
    ),
    Contact(
        name = "Maria Fulano",
        phone = "(61) 4545-4545",
        R.drawable.sample3
    )
)