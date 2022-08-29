package com.example.quarter_pounder.services

import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.quarter_pounder.R

class UiHelperService: AppCompatActivity() {
    public fun switchValues() {
        val inputEditText: EditText = findViewById(R.id.input);
        val outputEditText: EditText = findViewById(R.id.output);

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
        else if (inputNum == ",") {
            var commaFlag: Boolean = false;
            currentNum.forEach {
                if (it == ',') {
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
}