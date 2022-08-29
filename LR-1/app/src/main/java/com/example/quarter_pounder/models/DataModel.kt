package com.example.quarter_pounder.models

class DataModel() {
    val bitsToBytes: Int;
    val bitsToKilobytes: Int;
    val bitsToMegabytes: Int;

    val bytesToKilobytes: Int;
    val bytesToMegabytes: Int;

    val kilobytesToMegabytes: Int;

    init {
        bitsToBytes = 0;
        bitsToKilobytes = 0;
        bitsToMegabytes = 0;

        bytesToKilobytes = 0;
        bytesToMegabytes = 0;

        kilobytesToMegabytes = 0;
    }
}