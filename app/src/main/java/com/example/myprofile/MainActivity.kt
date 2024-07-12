package com.example.myprofile

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
      // LinkedIn Profile URL
        val linkedin: ImageView=findViewById(R.id.linkedin)

        linkedin.setOnClickListener {
          openUrl("https://www.linkedin.com/in/mayar-mohamed-")
        }
      // GitHUb Profile URL
        val github: ImageView=findViewById(R.id.github)
        github.setOnClickListener {
            openUrl("https://github.com/MayarMohamed")
        }
        //FaceBook Profile URL
        val facebook: ImageView=findViewById(R.id.facebook)
        facebook.setOnClickListener {
            openUrl("https://www.facebook.com/profile.php?id=100010604195726&mibextid=LQQJ4d")
        }


    }

   private fun openUrl(link: String) {
      val uri=Uri.parse(link)
        val inte= Intent(Intent.ACTION_VIEW,uri)
        startActivity(inte)
    }
}