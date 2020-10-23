package com.example.employeedata1

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

        binding.apply {
            val name = empName.text.toString()
            val trained = chkTrained.isChecked
            val certified = chkCertified.isChecked
            val empData = EmployeeModel(name, trained, certified)
            btnSubmit.setOnClickListener {
                submit(empData)
            }
        }

    }

    private fun submit(data: EmployeeModel) {
        if (data.employeeName == "") {
            Toast.makeText(applicationContext, "Please enter a name", Toast.LENGTH_LONG).show()
        } else {

        }
    }
}