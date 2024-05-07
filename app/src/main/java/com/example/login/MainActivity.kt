package com.example.login

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var messageBinding: ActivityMainBinding
    lateinit var sharedPreferences: SharedPreferences

    var Email:String?=null
    var password:String?=null
    var remember:Boolean=false

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Email","on Create")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        messageBinding = ActivityMainBinding.inflate(layoutInflater)
        var view=messageBinding.root
        setContentView(view)


        messageBinding.log.setOnClickListener {

            sharedPreferences=getSharedPreferences("userData", MODE_PRIVATE)
            Email=sharedPreferences.getString("Email","")
            password=sharedPreferences.getString("password","")
            remember=sharedPreferences.getBoolean("remember",false)


            if(Email.toString() == messageBinding.Email.text.toString() && password.toString() == messageBinding.password.text.toString()){


            Toast.makeText(applicationContext,"login successful",Toast.LENGTH_LONG).show()
                val intent= Intent(this@MainActivity,
                    dashboard::class.java)

                startActivity(intent)

            }else{
            Toast.makeText(applicationContext,"User not found",Toast.LENGTH_LONG).show()

            }
        }

        messageBinding.register.setOnClickListener {
            sharedPreferences=getSharedPreferences("userData", MODE_PRIVATE)
            Email=messageBinding.Email.text.toString()
            password=messageBinding.password.text.toString()
            remember=messageBinding.remember.isChecked

            var editor = sharedPreferences.edit()
            editor.putString("Email",Email)
            editor.putString("password",password)
            editor.putBoolean("remember me",remember)

            editor.apply()
            Toast.makeText(applicationContext,"Data Saved",Toast.LENGTH_LONG).show()
        }


    }
}