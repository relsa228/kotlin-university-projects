package com.example.quarter_pounder

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.quarter_pounder.services.UiHelperService
import com.example.quarter_pounder.ui.main.MainFragment


class MainActivity : AppCompatActivity() {
    val uiHelperService: UiHelperService = UiHelperService();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }

    fun numBtnOnClick(view: View) {
        val inputEditText: EditText = findViewById(R.id.input);
        var inputVal: String = "";
        when(view.getId()) {
            R.id.b0 -> inputVal = uiHelperService.inputValidation("0", inputEditText.text.toString());
            R.id.b00 -> inputVal = uiHelperService.inputValidation("00", inputEditText.text.toString());
            R.id.b000 -> inputVal = uiHelperService.inputValidation("000", inputEditText.text.toString());
            R.id.b1 -> inputVal = uiHelperService.inputValidation("1", inputEditText.text.toString());
            R.id.b2 -> inputVal = uiHelperService.inputValidation("2", inputEditText.text.toString());
            R.id.b3 -> inputVal = uiHelperService.inputValidation("3", inputEditText.text.toString());
            R.id.b4 -> inputVal = uiHelperService.inputValidation("4", inputEditText.text.toString());
            R.id.b5 -> inputVal = uiHelperService.inputValidation("5", inputEditText.text.toString());
            R.id.b6 -> inputVal = uiHelperService.inputValidation("6", inputEditText.text.toString());
            R.id.b7 -> inputVal = uiHelperService.inputValidation("7", inputEditText.text.toString());
            R.id.b8 -> inputVal = uiHelperService.inputValidation("8", inputEditText.text.toString());
            R.id.b9 -> inputVal = uiHelperService.inputValidation("9", inputEditText.text.toString());
        }
        inputEditText.setText(inputVal)
    }
    fun toolBtnOnClick(view: View) {
        val inputEditText: EditText = findViewById(R.id.input);
        val outputEditText: EditText = findViewById(R.id.output);
        val inputSpin: Spinner = findViewById(R.id.InputSpinner);
        val outputSpin: Spinner = findViewById(R.id.OutputSpinner);

        when(view.getId()) {
            R.id.cleanInput -> inputEditText.setText("0");
            R.id.switchValues -> uiHelperService.switchValues(inputEditText, outputEditText);
            R.id.copy -> uiHelperService.copyToClipboard(this.applicationContext, inputEditText.text.toString(), outputEditText.text.toString(),
                inputSpin.selectedItem.toString(), outputSpin.selectedItem.toString());
            R.id.comma -> inputEditText.setText(uiHelperService.inputValidation(".", inputEditText.text.toString()));
        }
    }

    fun tabBtnOnClick(view: View) {
        val inputSpin: Spinner = findViewById(R.id.InputSpinner);
        val outputSpin: Spinner = findViewById(R.id.OutputSpinner);

        when(view.getId()) {
            R.id.DistanceItem -> uiHelperService.changeSpinnerList(inputSpin, outputSpin, "distance")
            R.id.WeightItem -> uiHelperService.changeSpinnerList(inputSpin, outputSpin, "weight")
            R.id.DataItem -> uiHelperService.changeSpinnerList(inputSpin, outputSpin, "data")
            R.id.CryptoItem -> uiHelperService.changeSpinnerList(inputSpin, outputSpin, "crypto")
        }
    }
}