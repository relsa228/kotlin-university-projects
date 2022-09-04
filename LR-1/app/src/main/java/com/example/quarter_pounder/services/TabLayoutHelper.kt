package com.example.quarter_pounder.services

import android.content.Context
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.tabs.TabLayout

class TabLayoutHelper constructor(appContext: Context, inSpin: Spinner, outSpin: Spinner): TabLayout.OnTabSelectedListener {
    private val applicationContext: Context
    private val inputSpinner: Spinner
    private val outputSpinner: Spinner

    init {
        applicationContext = appContext
        inputSpinner = inSpin
        outputSpinner = outSpin
    }

    override fun onTabSelected(tab: TabLayout.Tab?) {
        var uiHelperService: UiHelperService = UiHelperService()

        uiHelperService.changeSpinnerList(inputSpinner, outputSpinner, tab!!.position, applicationContext)
    }

    override fun onTabUnselected(tab: TabLayout.Tab?) {
        return
    }

    override fun onTabReselected(tab: TabLayout.Tab?) {
        return
    }
}