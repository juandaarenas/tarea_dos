package com.example.tarea_dos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity3 : AppCompatActivity() {
    lateinit var navegacion : BottomNavigationView
    private val mOnNavMenu = BottomNavigationView.OnNavigationItemSelectedListener{item ->
        when(item.itemId){
            R.id.itemfragment1 ->{
                supportFragmentManager.commit {
                    replace<FirstFragment>(R.id.FragmentContainer)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.itemfragment2 ->{
                supportFragmentManager.commit {
                    replace<SecondFragment>(R.id.FragmentContainer)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.itemfragment3 ->{
                supportFragmentManager.commit {
                    replace<ThreeFragment>(R.id.FragmentContainer)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.itemfragment4 ->{
                supportFragmentManager.commit {
                    replace<FourFragment>(R.id.FragmentContainer)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.itemfragment5 ->{
                supportFragmentManager.commit {
                    replace<FiveFragment>(R.id.FragmentContainer)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        navegacion = findViewById(R.id.navegation)
        navegacion.setOnNavigationItemSelectedListener(mOnNavMenu)

        supportFragmentManager.commit {
            replace<FirstFragment>(R.id.FragmentContainer)
            setReorderingAllowed(true)
            addToBackStack("replacement")
        }
        FullPantalla()
    }
    fun FullPantalla(){
        WindowCompat.setDecorFitsSystemWindows(window,false)
        WindowInsetsControllerCompat(window,window.decorView).hide(WindowInsetsCompat.Type.systemBars())
    }
}