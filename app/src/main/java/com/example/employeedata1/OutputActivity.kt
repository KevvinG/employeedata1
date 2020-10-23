package com.example.employeedata1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.employeedata1.databinding.ActivityInputBinding
import com.example.employeedata1.databinding.ActivityOutputBinding
import com.example.employeedata1.model.EmployeeModel

class OutputActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOutputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOutputBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getSerializableExtra("data") as EmployeeModel
        //converting bool to string
        val trained = if (data.trained) {
            "Is Trained"
        } else {
            "Is not Trained"
        }
        val certified = if (data.certified) {
            "Is Certified"
        } else {
            "Is not Certified"
        }

        binding.apply {
            txtName.text = data.employeeName
            txtTrained.text = data.employeeName + " " + trained
            txtCertified.text = data.employeeName + " " + certified
        }

    }
}