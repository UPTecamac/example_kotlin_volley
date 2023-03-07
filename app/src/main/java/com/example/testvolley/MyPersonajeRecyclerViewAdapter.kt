package com.example.testvolley

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import com.example.testvolley.placeholder.PlaceholderContent.PersonajeItem
import com.example.testvolley.databinding.FragmentItemBinding
import com.example.testvolley.services.rickAndMorty.dtos.Personaje
import com.squareup.picasso.Picasso


class MyPersonajeRecyclerViewAdapter(
    private val values: MutableList<Personaje>
) : RecyclerView.Adapter<MyPersonajeRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.idView.text = item.id
        holder.contentView.text = item.name
        val url = item.image
        Picasso.get().load(url).into(holder.img)

    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val idView: TextView = binding.itemNumber
        val contentView: TextView = binding.content
        val img : ImageView = binding.icon

        override fun toString(): String {
            return super.toString() + " '" + contentView.text + "'"
        }
    }

}