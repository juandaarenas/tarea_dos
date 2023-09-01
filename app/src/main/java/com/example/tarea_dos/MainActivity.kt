package com.example.tarea_dos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.example.tarea_dos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        FullPantalla()
        val tiempo = object : CountDownTimer(3000,1000){
            override fun onTick(p0: Long) {

            }
            override fun onFinish() {
                startActivity(Intent(this@MainActivity,MainActivity2::class.java))
            }
        }
        tiempo.start()
    }
    fun FullPantalla(){
        WindowCompat.setDecorFitsSystemWindows(window,false)
        WindowInsetsControllerCompat(window,window.decorView).hide(WindowInsetsCompat.Type.systemBars())
    }
}