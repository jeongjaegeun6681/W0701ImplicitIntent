package kr.ac.kumoh.s20161396W0701implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20161396W0701implicitintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnHompage.setOnClickListener{
            val uri = Uri.parse("http://www.youtube.com")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        binding.btnMap.setOnClickListener{
            val uri = Uri.parse("geo:0,0?z=17&q=구미역")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        binding.btnTelephone.setOnClickListener{
            val uri = Uri.parse("sms:010-1234-5678")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

    }
}