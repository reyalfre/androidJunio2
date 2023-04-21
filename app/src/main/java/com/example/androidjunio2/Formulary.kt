package com.example.androidjunio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.androidjunio2.databinding.ActivityFormularyBinding

class Formulary : AppCompatActivity() {
    private lateinit var mBinding: ActivityFormularyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityFormularyBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        onRadioButtonClicked()
        onSetupSpinner()
    }

    private fun onSetupSpinner() {
        val opcionDepar = resources.getStringArray(R.array.grupo)

        val spinner = mBinding.spinner

        ArrayAdapter.createFromResource(this, R.array.grupo, android.R.layout.simple_spinner_item)
            .also {
                it.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spinner.adapter = it
            }
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, View: View?, pos: Int, p3: Long){
                Toast.makeText(this@Formulary, opcionDepar[pos], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }

    private fun onRadioButtonClicked() {
        mBinding.radio.setOnCheckedChangeListener { radio, checkedId ->
            when (checkedId) {
                R.id.radioButton -> {
                    Toast.makeText(this, mBinding.radioButton.text.toString(), Toast.LENGTH_SHORT)
                        .show()
                }
                R.id.radioButton2 -> {
                    Toast.makeText(this, mBinding.radioButton2.text.toString(), Toast.LENGTH_SHORT)
                        .show()
                }
                R.id.radioButton3 -> {
                    Toast.makeText(this, mBinding.radioButton3.text.toString(), Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }
    }
}