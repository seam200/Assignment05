package com.example.assignemt05

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(
    private val context: Activity,
    private val name: Array<String>,
    private val dtls: Array<String>,
    private val img: Array<Int>
) : ArrayAdapter<String>(context,R.layout.list_item, name){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.list_item, parent, false)

        val fName = rowView.findViewById<TextView>(R.id.foodName)
        val fDetails = rowView.findViewById<TextView>(R.id.foodDetls)
        val fimg = rowView.findViewById<ImageView>(R.id.foodImg)

        fName.text = name[position]
        fDetails.text = dtls[position]
        fimg.setImageResource(img[position])

        return rowView

    }
}