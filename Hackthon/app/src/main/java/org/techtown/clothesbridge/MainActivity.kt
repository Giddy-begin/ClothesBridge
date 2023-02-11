package org.techtown.clothesbridge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import org.techtown.clothesbridge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.navbar.setOnItemSelectedListener { item->
            changeFragment(
                when(item.itemId){
                    R.id.nav_home -> {HomeFragment()}
                    R.id.nav_write -> {WritingFragment()}
                    R.id.nav_my -> {MypageFragment()}
                    else->{
                        HomeFragment()
                    }
                }
            )
            true
        }
        binding.navbar.selectedItemId = R.id.nav_home
    }
    private fun changeFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.nav_host,fragment)
            .commit()
    }
}