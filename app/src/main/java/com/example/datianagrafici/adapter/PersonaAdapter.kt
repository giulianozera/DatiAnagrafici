package com.example.datianagrafici.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.datianagrafici.R
import com.example.datianagrafici.entity.Persona

class PersonaViewHolder(view: View) : RecyclerView.ViewHolder(view)  {

    private val nameView: TextView
    private val dataView:TextView
    private val placeView:TextView
    private val surnameView:TextView



    init {
        nameView = view.findViewById(R.id.text_view_person_name)
        surnameView = view.findViewById(R.id.text_view_person_surname)
        dataView=view.findViewById(R.id.text_view_person_birthday)
        placeView=view.findViewById(R.id.text_view_birthplace)
    }

    fun showPersona(persona: Persona) {
        nameView.text = persona.name
        surnameView.text=persona.surname
        dataView.text=persona.birthday
        placeView.text=persona.city

    }
}

class PersonaAdapter(private val model: List<Persona>) : RecyclerView.Adapter<PersonaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaViewHolder {
        val template = LayoutInflater // gestore delle operazioni di "inflating"
            .from(parent.context) // contesto nel quale viene creato il layout
            // operazione di "ingrandimento" del layout all'interno dell'area a sua disposizione
            .inflate(R.layout.person_list_item, parent, false)
        return PersonaViewHolder(template)
    }

    override fun getItemCount(): Int = model.size

    override fun onBindViewHolder(holder: PersonaViewHolder, position: Int) {
        holder.showPersona(model[position])
    }

}