package com.example.quarter_pounder.services.converters

import com.example.quarter_pounder.models.DistanceModel

class DistanceConverter {
    val distanceModel: DistanceModel = DistanceModel();

    //Meter***************************
    fun MeterToIn(meterOrIn: Double, option: Boolean): Double {
        if(option)
            return meterOrIn * distanceModel.meterToIn;
        return meterOrIn / distanceModel.meterToIn;
    }

    fun MeterToFt(meterOrFt: Double, option: Boolean): Double {
        if(option)
            return meterOrFt * distanceModel.meterToFt;
        return meterOrFt / distanceModel.meterToFt;
    }

    fun MeterToMi(meterOrMi: Double, option: Boolean): Double {
        if(option)
            return meterOrMi * distanceModel.meterToMi;
        return meterOrMi / distanceModel.meterToMi;
    }

    fun MeterToYd(meterOrYd: Double, option: Boolean): Double {
        if(option)
            return meterOrYd * distanceModel.meterToYd;
        return meterOrYd / distanceModel.meterToYd;
    }

    //In***************************
    fun InToFt(inOrFt: Double, option: Boolean): Double {
        if(option)
            return inOrFt * distanceModel.inToFt;
        return inOrFt / distanceModel.inToFt;
    }

    fun InToYd(inOrYd: Double, option: Boolean): Double {
        if(option)
            return inOrYd * distanceModel.inToYd;
        return inOrYd / distanceModel.inToYd;
    }

    fun InToMi(inOrMi: Double, option: Boolean): Double {
        if(option)
            return inOrMi * distanceModel.inToMi;
        return inOrMi / distanceModel.inToMi;
    }

    //Ft***************************
    fun FtToYd(ftOrYd: Double, option: Boolean): Double {
        if(option)
            return ftOrYd * distanceModel.ftToYd;
        return ftOrYd / distanceModel.ftToYd;
    }

    fun FtToMi(ftOrMi: Double, option: Boolean): Double {
        if(option)
            return ftOrMi * distanceModel.ftToMi;
        return ftOrMi / distanceModel.ftToMi;
    }

    //Mi***************************
    fun MiToYd(miOrYd: Double, option: Boolean): Double {
        if(option)
            return miOrYd * distanceModel.miToYd;
        return miOrYd / distanceModel.miToYd;
    }
}