package com.example.recyclerview

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class ContactListAdapter : ListAdapter<dtContact, ContactListAdapter.ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        TODO("Not yet implemented")
    }
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class ContactViewHolder (view: View) : RecyclerView.ViewHolder(view){

    }

    class ContactDiffUtils : DiffUtil.ItemCallback<dtContact>(){
        override fun areItemsTheSame(oldItem: dtContact, newItem: dtContact): Boolean {
            return newItem == oldItem
        }
        override fun areContentsTheSame(oldItem: dtContact, newItem: dtContact): Boolean {
         return newItem.name == oldItem.name
        }
    }
}