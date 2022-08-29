package com.example.quarter_pounder.services.converters;

import com.example.quarter_pounder.models.WeightModel;

class WeightConverter {
    val weightModel: WeightModel = WeightModel();

    //Killograms***************************
    fun KillogrammsToTonnes(kilogrammOrTonne: Double, option: Boolean): Double {
        if(option)
            return kilogrammOrTonne * weightModel.kilogrammsToTonne;
        return kilogrammOrTonne / weightModel.kilogrammsToTonne;
    }

    fun KillogrammsToLb(killogramOrLb: Double, option: Boolean): Double {
        if(option)
            return killogramOrLb * weightModel.kilogrammsToLb;
        return killogramOrLb / weightModel.kilogrammsToLb;
    }

    fun KillogrammsToOunce(killogramOrOunce: Double, option: Boolean): Double {
        if(option)
            return killogramOrOunce * weightModel.kilogrammsToOunce;
        return killogramOrOunce / weightModel.kilogrammsToOunce;
    }

    //Tonne***************************
    fun TonneToLb(tonneOrLb: Double, option: Boolean): Double {
        if(option)
            return tonneOrLb * weightModel.tonneToLb;
        return tonneOrLb / weightModel.tonneToLb;
    }

    fun TonneToOunce(tonneOrOunce: Double, option: Boolean): Double {
        if(option)
            return tonneOrOunce * weightModel.tonneToOunce;
        return tonneOrOunce / weightModel.tonneToOunce;
    }

    //Lb***************************
    fun LbToOunce(lbOROunce: Double, option: Boolean): Double {
        if(option)
            return lbOROunce * weightModel.lbToOunce;
        return lbOROunce / weightModel.lbToOunce;
    }
}
