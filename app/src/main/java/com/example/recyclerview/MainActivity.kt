package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintAttribute
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ContactListAdapter()
        binding.rvList.adapter = adapter
        binding.rvList.layoutManager = LinearLayoutManager(this)
        adapter.submitList(contacts)

        binding.ivGrid.setOnClickListener(){
            binding.rvList.layoutManager = GridLayoutManager(this, 2)
        }

        binding.ivList.setOnClickListener(){
            binding.rvList.layoutManager = LinearLayoutManager(this)
        }

        adapter.setOnClickListener { contacts ->

        }
    }
}

val contacts = listOf(
    dtContact(
        name = "Joana Gomes Chagas",
        phone = "(61) 999-8765",
        R.drawable.sample1
    ),
    dtContact(
        name = "José Pereira da Silva",
        phone = "(61) 9875-5885",
        R.drawable.sample2
    ),
    dtContact(
        name = "Fulana da Chagas",
        phone = "8754-9521",
        R.drawable.sample3
    ),
    dtContact(
        name = "Clara das Chagas",
        phone = "8754-9521",
        R.drawable.sample4
    ),
    dtContact(
        name = "Morena Lena da Chagas",
        phone = "8754-9521",
        R.drawable.sample5
    ),
    dtContact(
        name = "Mariana Pereira da Chagas",
        phone = "8754-9521",
        R.drawable.sample6
    ),
    dtContact(
        name = "Claudia M. Chagas",
        phone = "8754-9521",
        R.drawable.sample7
    ),
    dtContact(
        name = "Maurício Gomes Chagas",
        phone = "8754-9521",
        R.drawable.sample8
    ),
    dtContact(
        name = "Páblo Scobar P.",
        phone = "8754-9521",
        R.drawable.sample9
    ),
    dtContact(
        name = "Carlos Messias Silva",
        phone = "8754-9521",
        R.drawable.sample2
    ),
    dtContact(
        name = "Fulana da Chagas",
        phone = "8754-9521",
        R.drawable.sample3
    ),
    dtContact(
        name = "Fulana da Chagas",
        phone = "8754-9521",
        R.drawable.sample4
    ),
    dtContact(
        name = "Fulana da Chagas",
        phone = "8754-9521",
        R.drawable.sample7
    ),
    dtContact(
        name = "Fulana da Chagas",
        phone = "8754-9521",
        R.drawable.sample9
    ),
    dtContact(
        name = "Joana Gomes Chagas",
        phone = "(61) 999-8765",
        R.drawable.sample1
    ),
    dtContact(
        name = "José Pereira da Silva",
        phone = "(61) 9875-5885",
        R.drawable.sample2
    ),
    dtContact(
        name = "Fulana da Chagas",
        phone = "8754-9521",
        R.drawable.sample3
    ),
    dtContact(
        name = "Cremilda da Chagas",
        phone = "8754-9521",
        R.drawable.sample4
    ),
    dtContact(
        name = "Morena Lena da Chagas",
        phone = "8754-9521",
        R.drawable.sample5
    ),
    dtContact(
        name = "Fulana da Chagas",
        phone = "8754-9521",
        R.drawable.sample4
    ),
    dtContact(
        name = "Fulana da Chagas",
        phone = "8754-9521",
        R.drawable.sample7
    ),
    dtContact(
        name = "Fulana da Chagas",
        phone = "8754-9521",
        R.drawable.sample9
    ),
    dtContact(
        name = "Joana Gomes Chagas",
        phone = "(61) 999-8765",
        R.drawable.sample1
    ),
    dtContact(
        name = "José Pereira da Silva",
        phone = "(61) 9875-5885",
        R.drawable.sample2
    ),
    dtContact(
        name = "Fulana da Chagas",
        phone = "8754-9521",
        R.drawable.sample1
    ),
    dtContact(
        name = "Cremilda da Chagas",
        phone = "8754-9521",
        R.drawable.sample2
    ),
    dtContact(
        name = "Morena Lena da Chagas",
        phone = "8754-9521",
        R.drawable.sample9
    ),
    dtContact(
        name = "Fulana da Chagas",
        phone = "8754-9521",
        R.drawable.sample3
    ),
    dtContact(
        name = "Cremilda da Chagas",
        phone = "8754-9521",
        R.drawable.sample4
    ),
    dtContact(
        name = "Morena Lena da Chagas",
        phone = "8754-9521",
        R.drawable.sample5
    ),
    dtContact(
        name = "Fulana da Chagas",
        phone = "8754-9521",
        R.drawable.sample4
    ),
    dtContact(
        name = "Fulana da Chagas",
        phone = "8754-9521",
        R.drawable.sample7
    ),
    dtContact(
        name = "Fulana da Chagas",
        phone = "8754-9521",
        R.drawable.sample9
    ),
    dtContact(
        name = "Joana Gomes Chagas",
        phone = "(61) 999-8765",
        R.drawable.sample1
    ),
    dtContact(
        name = "José Pereira da Silva",
        phone = "(61) 9875-5885",
        R.drawable.sample2
    ),
    dtContact(
        name = "Fulana da Chagas",
        phone = "8754-9521",
        R.drawable.sample1
    ),
    dtContact(
        name = "Cremilda da Chagas",
        phone = "8754-9521",
        R.drawable.sample2
    ),
    dtContact(
        name = "Morena Lena da Chagas",
        phone = "8754-9521",
        R.drawable.sample9
    )
)