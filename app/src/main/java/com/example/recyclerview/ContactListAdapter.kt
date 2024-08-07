package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class ContactListAdapter :
    ListAdapter<dtContact, ContactListAdapter.ContactViewHolder>(ContactDiffUtils()) {
    private lateinit var onClickListener: (dtContact) -> Unit

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.itens_recyclerview, parent, false)
        return ContactViewHolder(view)
    }
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bind(getItem(position), onClickListener)
    }

    fun setOnClickListener(onClick : (dtContact) -> Unit){
        onClickListener = onClick
    }

    class ContactViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        private val tvName = view.findViewById<TextView>(R.id.tv_name)
        private val tvPhone = view.findViewById<TextView>(R.id.tv_phone)
        private val ivImage = view.findViewById<ImageView>(R.id.img)

        fun bind(dtContact: dtContact, onClick: (dtContact) -> Unit) {
            tvName.text = dtContact.name
            tvPhone.text = dtContact.phone
            ivImage.setImageResource(dtContact.icon)

            view.setOnClickListener(){
                onClick.invoke(dtContact)
            }
        }
    }

    class ContactDiffUtils : DiffUtil.ItemCallback<dtContact>() {
        override fun areItemsTheSame(oldItem: dtContact, newItem: dtContact): Boolean {
            return oldItem == newItem
        }
        override fun areContentsTheSame(oldItem: dtContact, newItem: dtContact): Boolean {
            return oldItem.name == newItem.name
        }
    }
}