package com.example.formregister

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.formregister.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonSignUp.setOnClickListener {
            val email = binding.editTextEmail.text.toString()
            val fullname = binding.editTextFullname.text.toString()
            val username = binding.editTextUsername.text.toString()
            val password = binding.editTextPassword.text.toString()

            if (email.isEmpty() || fullname.isEmpty() || username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Semua field harus diisi", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Registrasi berhasil", Toast.LENGTH_LONG).show()

                // Mengosongkan field EditText setelah input
                binding.editTextEmail.text.clear()
                binding.editTextFullname.text.clear()
                binding.editTextUsername.text.clear()
                binding.editTextPassword.text.clear()
            }
        }
    }
}
