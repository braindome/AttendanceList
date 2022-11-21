package com.example.attendancelist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentsRecyclerAdapter(val context : Context, val students : List<Student> ) : RecyclerView.Adapter<StudentsRecyclerAdapter.ViewHolder>() {

    val layoutInflater = LayoutInflater.from(context)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.list_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val student = students[position]

        holder.nameTextView.text = student.name
        holder.classTextView.text = student.className
        holder.presentButton.isChecked = student.present
    }

    override fun getItemCount() : Int = students.size


    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView = itemView.findViewById<TextView>(R.id.nameTextView)
        val classTextView = itemView.findViewById<TextView>(R.id.classTextView)
        val presentButton = itemView.findViewById<CheckBox>(R.id.checkBox)
        val deleteButton = itemView.findViewById<ImageButton>(R.id.deleteButton)

    }
}