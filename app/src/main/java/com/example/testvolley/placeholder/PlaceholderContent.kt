package com.example.testvolley.placeholder

import com.example.testvolley.services.rickAndMorty.dtos.Personaje
import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object PlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */
    val ITEMS: MutableList<Personaje> = ArrayList()

    /**
     * A map of sample (placeholder) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, PersonajeItem> = HashMap()

    init {
        // Add some sample items.
        //for (i in 1..25) {
        //    addItem(createPersonItem(i, "Item $i", makeDetails(i)))
        //}
    }

    private fun addItem(item: Personaje) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, createPersonItem(item.id.toInt(), item.name))
    }

    private fun createPersonItem(id: Int, name: String): PersonajeItem {
        return PersonajeItem(id.toString(), name)
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    /**
     * A placeholder item representing a piece of content.
     */
    data class PersonajeItem(val id: String, val name: String) {
        override fun toString(): String = name
    }
}