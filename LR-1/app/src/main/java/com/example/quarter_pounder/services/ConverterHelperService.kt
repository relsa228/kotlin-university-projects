package com.example.quarter_pounder.services

import android.widget.EditText
import android.widget.Spinner
import com.example.quarter_pounder.models.UnitSigns
import com.example.quarter_pounder.services.converters.CryptocurrencyConverter
import com.example.quarter_pounder.services.converters.DataConverter
import com.example.quarter_pounder.services.converters.DistanceConverter
import com.example.quarter_pounder.services.converters.WeightConverter

class ConverterHelperService {
    fun convert(inputNum: EditText, outNum: EditText, fSpin: Spinner, sSpin: Spinner) {
        var fSign: UnitSigns = UnitSigns.B
        var sSign: UnitSigns = UnitSigns.B

        UnitSigns.values().forEach {
            if (it.nameOfUnit == fSpin.selectedItem.toString())
                fSign = it
            if (it.nameOfUnit == sSpin.selectedItem.toString())
                sSign = it
        }

        if (fSign == UnitSigns.M || fSign == UnitSigns.FT || fSign == UnitSigns.IN ||
            fSign == UnitSigns.YD || fSign == UnitSigns.MI)
            distanceConvertHelper(inputNum, outNum, fSign, sSign)

        else if (fSign == UnitSigns.BIT || fSign == UnitSigns.B || fSign == UnitSigns.KB ||
            fSign == UnitSigns.MB)
            dataConvertHelper(inputNum, outNum, fSign, sSign)

        else if (fSign == UnitSigns.KG || fSign == UnitSigns.T || fSign == UnitSigns.OZ ||
            fSign == UnitSigns.LB)
            weightConvertHelper(inputNum, outNum, fSign, sSign)

        else if (fSign == UnitSigns.ETH || fSign == UnitSigns.LTC || fSign == UnitSigns.ZEC)
            cryptocurrencyConvertHelper(inputNum, outNum, fSign, sSign)
    }
    private fun distanceConvertHelper(inputNum: EditText, outNum: EditText, fSign: UnitSigns, sSign: UnitSigns) {
        val inputStr: String = inputNum.text.toString()
        val inputN: Double = inputStr.toDouble()

        val distanceConverter: DistanceConverter = DistanceConverter()

        when (fSign) {
            UnitSigns.M -> {
                when (sSign) {
                    UnitSigns.M -> outNum.setText(inputStr)
                    UnitSigns.FT -> outNum.setText(distanceConverter.MeterToFt(inputN, true).toString())
                    UnitSigns.IN -> outNum.setText(distanceConverter.MeterToIn(inputN, true).toString())
                    UnitSigns.YD -> outNum.setText(distanceConverter.MeterToYd(inputN, true).toString())
                    UnitSigns.MI -> outNum.setText(distanceConverter.MeterToMi(inputN, true).toString())
                }
                return;
            }
            UnitSigns.FT -> {
                when (sSign) {
                    UnitSigns.M -> outNum.setText(distanceConverter.MeterToFt(inputN, false).toString())
                    UnitSigns.FT -> outNum.setText(inputStr)
                    UnitSigns.IN -> outNum.setText(distanceConverter.InToFt(inputN, false).toString())
                    UnitSigns.YD -> outNum.setText(distanceConverter.FtToYd(inputN, true).toString())
                    UnitSigns.MI -> outNum.setText(distanceConverter.FtToMi(inputN, true).toString())
                }
                return;
            }
            UnitSigns.IN -> {
                when (sSign) {
                    UnitSigns.M -> outNum.setText(distanceConverter.MeterToIn(inputN, false).toString())
                    UnitSigns.FT -> outNum.setText(distanceConverter.InToFt(inputN, true).toString())
                    UnitSigns.IN -> outNum.setText(inputStr)
                    UnitSigns.YD -> outNum.setText(distanceConverter.InToYd(inputN, true).toString())
                    UnitSigns.MI -> outNum.setText(distanceConverter.InToMi(inputN, true).toString())
                }
                return;
            }
            UnitSigns.YD -> {
                when (sSign) {
                    UnitSigns.M -> outNum.setText(distanceConverter.MeterToYd(inputN, false).toString())
                    UnitSigns.FT -> outNum.setText(distanceConverter.FtToYd(inputN, false).toString())
                    UnitSigns.IN -> outNum.setText(distanceConverter.InToYd(inputN, false).toString())
                    UnitSigns.YD -> outNum.setText(inputStr)
                    UnitSigns.MI -> outNum.setText(distanceConverter.MiToYd(inputN, false).toString())
                }
                return;
            }
            UnitSigns.MI -> {
                when (sSign) {
                    UnitSigns.M -> outNum.setText(distanceConverter.MeterToMi(inputN, false).toString())
                    UnitSigns.FT -> outNum.setText(distanceConverter.FtToMi(inputN, false).toString())
                    UnitSigns.IN -> outNum.setText(distanceConverter.InToMi(inputN, false).toString())
                    UnitSigns.YD -> outNum.setText(distanceConverter.MiToYd(inputN, true).toString())
                    UnitSigns.MI -> outNum.setText(inputStr)
                }
                return;
            }
        }
    }

    private fun dataConvertHelper(inputNum: EditText, outNum: EditText, fSign: UnitSigns, sSign: UnitSigns) {
        val inputStr: String = inputNum.text.toString()
        val inputN: Double = inputStr.toDouble()

        val dataConverter: DataConverter = DataConverter()

        when (fSign) {
            UnitSigns.BIT -> {
                when (sSign) {
                    UnitSigns.BIT -> outNum.setText(inputStr)
                    UnitSigns.B -> outNum.setText(dataConverter.BitsToBytes(inputN, true).toString())
                    UnitSigns.KB -> outNum.setText(dataConverter.BitsToKilobytes(inputN, true).toString())
                    UnitSigns.MB -> outNum.setText(dataConverter.BitsToMegabytes(inputN, true).toString())
                }
                return;
            }
            UnitSigns.B -> {
                when (sSign) {
                    UnitSigns.BIT -> outNum.setText(dataConverter.BitsToBytes(inputN, false).toString())
                    UnitSigns.B -> outNum.setText(inputStr)
                    UnitSigns.KB -> outNum.setText(dataConverter.BytesToKilobytes(inputN, true).toString())
                    UnitSigns.MB -> outNum.setText(dataConverter.BytesToMegabytes(inputN, true).toString())
                }
                return;
            }
            UnitSigns.KB -> {
                when (sSign) {
                    UnitSigns.BIT -> outNum.setText(dataConverter.BitsToKilobytes(inputN, false).toString())
                    UnitSigns.B -> outNum.setText(dataConverter.BytesToKilobytes(inputN, false).toString())
                    UnitSigns.KB -> outNum.setText(inputStr)
                    UnitSigns.MB -> outNum.setText(dataConverter.KilobytesToMegabytes(inputN, true).toString())
                }
                return;
            }
            UnitSigns.MB -> {
                when (sSign) {
                    UnitSigns.BIT -> outNum.setText(dataConverter.BitsToMegabytes(inputN, false).toString())
                    UnitSigns.B -> outNum.setText(dataConverter.BytesToMegabytes(inputN, false).toString())
                    UnitSigns.KB -> outNum.setText(dataConverter.KilobytesToMegabytes(inputN, false).toString())
                    UnitSigns.MB -> outNum.setText(inputStr)
                }
                return;
            }
        }
    }

    private fun weightConvertHelper(inputNum: EditText, outNum: EditText, fSign: UnitSigns, sSign: UnitSigns) {
        val inputStr: String = inputNum.text.toString()
        val inputN: Double = inputStr.toDouble()

        val weightConverter: WeightConverter = WeightConverter()

        when (fSign) {
            UnitSigns.KG -> {
                when (sSign) {
                    UnitSigns.KG -> outNum.setText(inputStr)
                    UnitSigns.T -> outNum.setText(weightConverter.KillogrammsToTonnes(inputN, true).toString())
                    UnitSigns.OZ -> outNum.setText(weightConverter.KillogrammsToOunce(inputN, true).toString())
                    UnitSigns.LB -> outNum.setText(weightConverter.KillogrammsToLb(inputN, true).toString())
                }
                return;
            }
            UnitSigns.T -> {
                when (sSign) {
                    UnitSigns.KG -> outNum.setText(weightConverter.KillogrammsToTonnes(inputN, false).toString())
                    UnitSigns.T -> outNum.setText(inputStr)
                    UnitSigns.OZ -> outNum.setText(weightConverter.TonneToOunce(inputN, true).toString())
                    UnitSigns.LB -> outNum.setText(weightConverter.LbToOunce(inputN, false).toString())
                }
                return;
            }
            UnitSigns.OZ -> {
                when (sSign) {
                    UnitSigns.KG -> outNum.setText(weightConverter.KillogrammsToOunce(inputN, false).toString())
                    UnitSigns.T -> outNum.setText(weightConverter.TonneToOunce(inputN, true).toString())
                    UnitSigns.OZ -> outNum.setText(inputStr)
                    UnitSigns.LB -> outNum.setText(weightConverter.LbToOunce(inputN, false).toString())
                }
                return;
            }
            UnitSigns.LB -> {
                when (sSign) {
                    UnitSigns.KG -> outNum.setText(weightConverter.KillogrammsToLb(inputN, false).toString())
                    UnitSigns.T -> outNum.setText(weightConverter.TonneToLb(inputN, false).toString())
                    UnitSigns.OZ -> outNum.setText(weightConverter.LbToOunce(inputN, true).toString())
                    UnitSigns.LB -> outNum.setText(inputStr)
                }
                return;
            }
        }
    }

    private fun cryptocurrencyConvertHelper(inputNum: EditText, outNum: EditText, fSign: UnitSigns, sSign: UnitSigns) {
        val inputStr: String = inputNum.text.toString()
        val inputN: Double = inputStr.toDouble()

        val cryptocurrencyConverter: CryptocurrencyConverter = CryptocurrencyConverter()

        when (fSign) {
            UnitSigns.ETH -> {
                when (sSign) {
                    UnitSigns.ETH -> outNum.setText(inputStr)
                    UnitSigns.LTC -> outNum.setText(cryptocurrencyConverter.ETHtoLTC(inputN, true).toString())
                    UnitSigns.ZEC -> outNum.setText(cryptocurrencyConverter.ETHtoZEC(inputN, true).toString())
                }
                return;
            }
            UnitSigns.LTC -> {
                when (sSign) {
                    UnitSigns.ETH -> outNum.setText(cryptocurrencyConverter.ETHtoLTC(inputN, false).toString())
                    UnitSigns.LTC -> outNum.setText(inputStr)
                    UnitSigns.ZEC -> outNum.setText(cryptocurrencyConverter.LTCtoZEC(inputN, true).toString())
                }
                return;
            }
            UnitSigns.ZEC -> {
                when (sSign) {
                    UnitSigns.BIT -> outNum.setText(cryptocurrencyConverter.ETHtoZEC(inputN, false).toString())
                    UnitSigns.B -> outNum.setText(cryptocurrencyConverter.LTCtoZEC(inputN, false).toString())
                    UnitSigns.KB -> outNum.setText(inputStr)
                }
                return;
            }
        }
    }
}