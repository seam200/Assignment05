package com.example.assignemt05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class FdetailsActivity : AppCompatActivity() {

    lateinit var foodName: TextView
    lateinit var foodDts:TextView
    lateinit var foodImg: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fdetails)

        foodName = findViewById(R.id.foodName)
        foodDts = findViewById(R.id.foodDetls)
        foodImg = findViewById(R.id.foodImg)

        var fName = intent.getStringExtra("fName")
        var fDts = intent.getStringExtra("fDts")
        var fImg = intent.getIntExtra("fImg", R.drawable.foo)

        foodName.text = fName
        foodDts.text = fDts
        foodImg.setImageResource(fImg)




    }
}