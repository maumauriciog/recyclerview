package com.example.recyclerview

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class clsContactList: ListAdapter<Contact, clsContactList.ContactViewHolder>(ContactDiffUtils()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        TODO("Not yet implemented")
    }
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    //classe view holder = view que segura os dados
    class ContactViewHolder(view: View) : RecyclerView.ViewHolder(view){

    }

    //compara a diferença quando nossa lista é atualizada
    class ContactDiffUtils : DiffUtil.ItemCallback<Contact>(){
        override fun areItemsTheSame(oldItem: Contact, newItem: Contact): Boolean {
            return oldItem == newItem
        }
        override fun areContentsTheSame(oldItem: Contact, newItem: Contact): Boolean {
            return oldItem.name == newItem.name
        }
    }
}