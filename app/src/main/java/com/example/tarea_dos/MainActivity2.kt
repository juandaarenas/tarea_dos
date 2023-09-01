package com.example.tarea_dos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.example.tarea_dos.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        FullPantalla()
        binding.apply {
            btnOmitir.setOnClickListener{
                startActivity(Intent(this@MainActivity2,MainActivity3::class.java))
                finish()
            }
            btnUserTelCorreo.setOnClickListener {
                startActivity(Intent(this@MainActivity2,MainActivity3::class.java))
                finish()
            }
        }
    }
    fun FullPantalla(){
        WindowCompat.setDecorFitsSystemWindows(window,false)
        WindowInsetsControllerCompat(window,window.decorView).hide(WindowInsetsCompat.Type.systemBars())
    }
}