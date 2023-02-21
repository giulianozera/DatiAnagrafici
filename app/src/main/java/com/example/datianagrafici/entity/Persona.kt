package com.example.datianagrafici.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

enum class Gender { Male, Female }


@Entity

 data class Persona(
    val name: String,
    val surname:String,
    val city: String,
    val provincia: String,
    val birthday: String,
    val gender: Gender
    )
{

    @PrimaryKey(autoGenerate = true)var id: Long=0



    override fun toString(): String {
        return "$name $surname ($birthday) " +
                "${if (gender == Gender.Male) 'M' else 'F'}" +
                " $city"
    }
    }

