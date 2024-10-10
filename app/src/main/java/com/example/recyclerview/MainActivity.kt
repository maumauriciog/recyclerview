package com.example.recyclerview

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
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
        adapter.setOnClickListener { contacts -> Log.d("Mau", contacts.toString()) }

        binding.ivList.setOnClickListener {
            binding.rvList.layoutManager = LinearLayoutManager(this)
        }

        binding.ivGrid.setOnClickListener {
            binding.rvList.layoutManager = GridLayoutManager(this, 2)
        }
    }
}

val contacts = listOf(
    dtContact(
        name = "Cremilda da Chagas",
        phone = "8754-9521",
        R.drawable.sample9
    ),
    dtContact(
        name = "Fulano Xavier",
        phone = "8754-9521",
        R.drawable.sample15
    ),
    dtContact(
        name = "Forum de Tagua",
        phone = "8754-9521",
        R.drawable.sample4
    ),
    dtContact(
        name = "Cravo de Cebola",
        phone = "8754-9521",
        R.drawable.sample3
    ),
    dtContact(
        name = "Tomada Ant do le",
        phone = "8754-9521",
        R.drawable.sample1
    ),
    dtContact(
        name = "Cremilda da Chagas",
        phone = "8754-9521",
        R.drawable.sample9
    ),
    dtContact(
        name = "Fulano Xavier",
        phone = "8754-9521",
        R.drawable.sample15
    ),
    dtContact(
        name = "Forum de Tagua",
        phone = "8754-9521",
        R.drawable.sample4
    ),
    dtContact(
        name = "Cravo de Cebola",
        phone = "8754-9521",
        R.drawable.sample3
    ),
    dtContact(
        name = "Tomada Ant do le",
        phone = "8754-9521",
        R.drawable.sample1
    ),
    dtContact(
        name = "Joana Gomes Chagas",
        phone = "(61) 999-8765",
        R.drawable.sample1
    ),
    dtContact(
        name = "José Pep da Silva",
        phone = "(61) 9875-5885",
        R.drawable.sample2
    ),
    dtContact(
        name = "Jéssica G. dos Santos",
        phone = "8754-9521",
        R.drawable.sample3
    ),
    dtContact(
        name = "Clara das Chagas",
        phone = "8754-9521",
        R.drawable.sample4
    ),
    dtContact(
        name = "Jessica da Chagas",
        phone = "8754-9521",
        R.drawable.sample5
    ),
    dtContact(
        name = "Mariana Pep da Chagas",
        phone = "8754-9521",
        R.drawable.sample6
    ),
    dtContact(
        name = "Claudia M. Chagas",
        phone = "8754-9521",
        R.drawable.sample7
    ),
    dtContact(
        name = "Maurício G. Chagas",
        phone = "8754-9521",
        R.drawable.sample8
    ),
    dtContact(
        name = "Páblo Scobar P.",
        phone = "8754-9521",
        R.drawable.sample9
    ),
    dtContact(
        name = "Carlos M. Silva",
        phone = "8754-9521",
        R.drawable.sample2
    ),
    dtContact(
        name = "Jessica Chagas",
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
        name = "José P. da Silva",
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
        name = "Morena L. da Chagas",
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
        name = "José P. da Silva",
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
        name = "Morena L. da Chagas",
        phone = "8754-9521",
        R.drawable.sample9
    ),
    dtContact(
        name = "Fulana da Chagas",
        phone = "8754-9521",
        R.drawable.sample3
    ),
    dtContact(
        name = "Cremilda Chagas",
        phone = "8754-9521",
        R.drawable.sample4
    ),
    dtContact(
        name = "Morena Chagas",
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
        name = "José Pep da Silva",
        phone = "(61) 9875-5885",
        R.drawable.sample2
    ),
    dtContact(
        name = "Fulana da Chagas",
        phone = "8754-9521",
        R.drawable.sample1
    ),
    dtContact(
        name = "Cremilda Chagas",
        phone = "8754-9521",
        R.drawable.sample9
    ),
    dtContact(
        name = "Fulano Xavier",
        phone = "8754-9521",
        R.drawable.sample15
    ),
    dtContact(
        name = "Forum de Tagua",
        phone = "8754-9521",
        R.drawable.sample4
    ),
    dtContact(
        name = "Cravo de Cebola",
        phone = "8754-9521",
        R.drawable.sample3
    ),
    dtContact(
        name = "Tomada Mab do le",
        phone = "8754-9521",
        R.drawable.sample1
    ),
    dtContact(
        name = "Cremilda da Chagas",
        phone = "8754-9521",
        R.drawable.sample9
    ),
    dtContact(
        name = "Fulano Xavier",
        phone = "8754-9521",
        R.drawable.sample15
    ),
    dtContact(
        name = "Forum de Tagua",
        phone = "8754-9521",
        R.drawable.sample4
    ),
    dtContact(
        name = "Cravo de Cebola",
        phone = "8754-9521",
        R.drawable.sample3
    ),
    dtContact(
        name = "Tomada Ac. do le",
        phone = "8754-9521",
        R.drawable.sample1
    ),
    dtContact(
        name = "Cremilda da Chagas",
        phone = "8754-9521",
        R.drawable.sample9
    ),
    dtContact(
        name = "Fulano Xavier",
        phone = "8754-9521",
        R.drawable.sample15
    ),
    dtContact(
        name = "Forum de Tagua",
        phone = "8754-9521",
        R.drawable.sample4
    ),
    dtContact(
        name = "Cravo de Cebola",
        phone = "8754-9521",
        R.drawable.sample3
    ),
    dtContact(
        name = "Tomada Ac. do le",
        phone = "8754-9521",
        R.drawable.sample1
    ),
    dtContact(
        name = "Joana G Chagas",
        phone = "(61) 999-8765",
        R.drawable.sample1
    ),
    dtContact(
        name = "José Pep da Silva",
        phone = "(61) 9875-5885",
        R.drawable.sample2
    )
)