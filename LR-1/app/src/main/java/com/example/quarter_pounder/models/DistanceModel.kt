package com.example.quarter_pounder.models

class DistanceModel {
    val meterToIn: Double;
    val meterToFt: Double;
    val meterToYd: Double;
    val meterToMi: Double;

    val inToFt: Double;
    val inToYd: Double;
    val inToMi: Double;

    val ftToYd: Double;
    val ftToMi: Double;

    val miToYd: Double;

    init {
        meterToIn = 0.0;
        meterToFt = 0.0;
        meterToYd = 0.0;
        meterToMi = 0.0;

        inToFt = 0.0;
        inToYd = 0.0;
        inToMi = 0.0;

        ftToYd = 0.0;
        ftToMi = 0.0;

        miToYd = 0.0;
    }
}