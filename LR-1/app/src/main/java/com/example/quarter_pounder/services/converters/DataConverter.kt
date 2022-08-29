package com.example.quarter_pounder.services.converters

import com.example.quarter_pounder.models.DataModel

class DataConverter {
    val dataModel: DataModel = DataModel();

    //Bits***************************
    fun BitsToBytes(bitsOrBytesCount: Double, option: Boolean): Double {
        if(option)
            return bitsOrBytesCount * dataModel.bitsToBytes;
        return bitsOrBytesCount / dataModel.bitsToBytes;
    }

    fun BitsToKilobytes(bitsOrKilobytesCount: Double, option: Boolean): Double {
        if(option)
            return bitsOrKilobytesCount * dataModel.bitsToKilobytes;
        return bitsOrKilobytesCount / dataModel.bitsToKilobytes;
    }

    fun BitsToMegabytes(bitsOrMegabytesCount: Double, option: Boolean): Double {
        if(option)
            return bitsOrMegabytesCount * dataModel.bitsToMegabytes;
        return bitsOrMegabytesCount / dataModel.bitsToMegabytes;
    }

    //Bytes***************************
    fun BytesToKilobytes(bitsOrKilobytesCount: Double, option: Boolean): Double {
        if(option)
            return bitsOrKilobytesCount * dataModel.bytesToKilobytes;
        return bitsOrKilobytesCount / dataModel.bytesToKilobytes;
    }

    fun BytesToMegabytes(bitsOrKilobytesCount: Double, option: Boolean): Double {
        if(option)
            return bitsOrKilobytesCount * dataModel.bytesToMegabytes;
        return bitsOrKilobytesCount / dataModel.bytesToMegabytes;
    }

    //Kilobytes***************************
    fun KilobytesToMegabytes(bitsOrKilobytesCount: Double, option: Boolean): Double {
        if(option)
            return bitsOrKilobytesCount * dataModel.kilobytesToMegabytes;
        return bitsOrKilobytesCount / dataModel.kilobytesToMegabytes;
    }
}