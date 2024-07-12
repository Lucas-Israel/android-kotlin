package br.com.trybe.fragmentsebottomnavigation

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val fragmentOne = FragmentOne()
    private val fragmentTwo = FragmentTwo()
    private val mFragOneBtn: Button by lazy { findViewById(R.id.main_bt_frag1) }
    private val mFragTwoBtn: Button by lazy { findViewById(R.id.main_bt_frag2) }
    private val mNavBar: BottomNavigationView by lazy { findViewById(R.id.main_bn_navmenu) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mFragOneBtn.setOnClickListener(this)
        mFragTwoBtn.setOnClickListener(this)

        mNavBar.setOnItemReselectedListener { item ->
            when (item.itemId) {
                R.id.item_1 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_fragment_view, fragmentOne).commit()
                }
                R.id.item_2 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_fragment_view, fragmentTwo).commit()
                }
            }
        }
    }

    override fun onClick(view: View?) {

        when (view?.id) {
            R.id.main_bt_frag1 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.main_fragment_view, fragmentOne).commit()
            }

            R.id.main_bt_frag2 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.main_fragment_view, fragmentTwo).commit()
            }
        }
    }
}
