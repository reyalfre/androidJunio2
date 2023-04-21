package com.example.androidjunio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.androidjunio2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    lateinit var username: EditText
    lateinit var password: EditText
    lateinit var btLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.buttonLogin.setOnClickListener {
            if (mBinding.editUsername.text.toString() == "user" && mBinding.editPassword.text.toString() == "123") {
                Toast.makeText(this, "usuario correcto", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, Formulary::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "usuario incorrecto", Toast.LENGTH_SHORT).show()
            }
            // setContentView(R.layout.activity_main)
        }
    }
}