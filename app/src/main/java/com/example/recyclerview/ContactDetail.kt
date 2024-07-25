package com.example.recyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ContactDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_detail)

        val tv_nameResult = findViewById<TextView>(R.id.tv_nameResult)
        val tv_phoneResult = findViewById<TextView>(R.id.tv_PhoneResult)
        val tv_share = findViewById<TextView>(R.id.tv_share)
        val image = findViewById<ImageView>(R.id.iv_imageResult)

        val nameReceive = intent.getStringExtra("name")
        val phoneReceive = intent.getStringExtra("phone")
        val iconReceive = intent.getIntExtra("icon", R.drawable.ic_launcher_foreground)

        tv_nameResult.text = nameReceive
        tv_phoneResult.text = phoneReceive
        image.setImageResource(iconReceive)

        tv_share.setOnClickListener(){
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "$nameReceive | $phoneReceive")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }
    }
}
