package com.example.quarter_pounder.services

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quarter_pounder.R

class UiHelperService: AppCompatActivity() {
    public fun switchValues(inputEditText: EditText, outputEditText: EditText) {
        val inputText: String = inputEditText.text.toString();

        inputEditText.setText(outputEditText.text.toString());
        outputEditText.setText(inputText);
    }

    public fun inputValidation(inputNum: String, currentNum: String): String {
        if (inputNum[0] == '0') {
            var nullFlag: Boolean = true;
            currentNum.forEach {
                if (it != '0') {
                    nullFlag = false
                    return@forEach;
                };
            }
            if (nullFlag)
                return "0"
            return currentNum + inputNum;
        };
        else if (inputNum == ".") {
            var commaFlag: Boolean = false;
            currentNum.forEach {
                if (it == '.') {
                    commaFlag = true;
                    return@forEach;
                }
            }
            if (commaFlag)
                return currentNum;
            return currentNum + inputNum;
        };
        if (currentNum == "0")
            return inputNum;
        return currentNum + inputNum;
    }

    fun changeSpinnerList(inputSpin: Spinner, outputSpin: Spinner, tabName: String) {
        if(tabName == "distance")
            ArrayAdapter.createFromResource(
                this,
                R.array.distance_list,
                android.R.layout.simple_spinner_item
            ).also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                inputSpin.adapter = adapter
                outputSpin.adapter = adapter
            };
        else  if(tabName == "weight")
            ArrayAdapter.createFromResource(
                this,
                R.array.weight_list,
                android.R.layout.simple_spinner_item
            ).also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                inputSpin.adapter = adapter
                outputSpin.adapter = adapter
            };
        else  if(tabName == "data")
            ArrayAdapter.createFromResource(
                this,
                R.array.data_list,
                android.R.layout.simple_spinner_item
            ).also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                inputSpin.adapter = adapter
                outputSpin.adapter = adapter
            };
        else  if(tabName == "crypto")
            ArrayAdapter.createFromResource(
                this,
                R.array.cryptocurrency_list,
                android.R.layout.simple_spinner_item
            ).also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                inputSpin.adapter = adapter
                outputSpin.adapter = adapter
            };

    }

    fun copyToClipboard(context: Context, input: String, output: String, funit: String, sunit: String){
        val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText("label", "$input $funit = $output $sunit")
        clipboard.setPrimaryClip(clip)

        Toast.makeText(context, "Результат вычислений скопирован", Toast.LENGTH_SHORT).show()
    }
}