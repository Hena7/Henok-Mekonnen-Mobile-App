package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class LoginPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)


        val etUsername = findViewById<EditText>(R.id.et_username)
        val etPassword = findViewById<EditText>(R.id.et_password)
        val cbRememberMe = findViewById<CheckBox>(R.id.cb_remember_me)
        val btnLogin = findViewById<Button>(R.id.btn_login)
        val btnCancel = findViewById<Button>(R.id.btn_cancel)
        val tvForgotPassword = findViewById<TextView>(R.id.tv_forgot_password)
        val tvSignUp = findViewById<TextView>(R.id.tv_sign_up)


        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if(etUsername.text.isEmpty()){
                etUsername.error = "Username is required"
                etUsername.requestFocus()
            }
            if(etPassword.text.isEmpty()){
                etPassword.error = "Password is required"
                etPassword.requestFocus()
                }


            if (username == "henok" && password == "1234") {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, DashboardActivity::class.java).also {
                    it.putExtra("USERNAME", username)
                }
                startActivity(intent)

            } else {
                Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show()
            }
        }

        btnCancel.setOnClickListener {
            etUsername.text.clear()
            etPassword.text.clear()
        }

        tvForgotPassword.setOnClickListener {
            Toast.makeText(this, "Forgot Password clicked!", Toast.LENGTH_SHORT).show()

        }

        tvSignUp.setOnClickListener {
            Toast.makeText(this, "Sign Up clicked!", Toast.LENGTH_SHORT).show()

        }
    }
}
