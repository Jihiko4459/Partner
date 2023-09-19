package com.example.partner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.partner.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var bind: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        bind= ActivityResultBinding.inflate(layoutInflater)
        setContentView(bind.root)
        var data=intent.getStringExtra("Data")
        var dataArray= data.toString().split("/")
        bind.discount.text= dataArray[5]
    }

    fun complaint(view: View) {
        Toast.makeText(this@ResultActivity, "Сообщение о жалобе отправлено в поддержку", Toast.LENGTH_SHORT).show()
    }
    fun back(view: View) {
        val intent= Intent(this@ResultActivity, MainActivity2::class.java)
        startActivity(intent)
    }
}