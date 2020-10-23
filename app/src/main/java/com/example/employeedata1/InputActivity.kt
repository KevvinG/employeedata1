package com.example.employeedata1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.employeedata1.databinding.ActivityInputBinding
import com.example.employeedata1.model.EmployeeModel

class InputActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSubmit.setOnClickListener {
            submit()
        }

    }//onCreate

    private fun submit() {
        var name = binding.empName.text.toString()
        var trained = binding.chkTrained.isChecked
        var certified = binding.chkCertified.isChecked
        val data = EmployeeModel(name, trained, certified)
        if (data.employeeName == "" || data.employeeName == "Name") {
            Toast.makeText(applicationContext, "Please enter a name", Toast.LENGTH_LONG).show()
        } else {
            val intent = Intent(this, OutputActivity::class.java).apply{
                putExtra("data", data)
            }
            startActivity(intent)
        }//else
    }//submit
}