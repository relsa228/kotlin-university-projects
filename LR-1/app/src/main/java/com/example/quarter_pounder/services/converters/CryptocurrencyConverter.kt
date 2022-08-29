package com.example.quarter_pounder.services.converters

import com.example.quarter_pounder.models.CryptocurrencyModel

class CryptocurrencyConverter {
    val cryptoModel: CryptocurrencyModel = CryptocurrencyModel();

    fun ETHtoLTC(ETHorLTC: Double, option: Boolean): Double {
        if(option)
            return ETHorLTC * cryptoModel.ETHtoLTC;
        return ETHorLTC / cryptoModel.ETHtoLTC;
    }

    fun ETHtoZEC(ETHorZEC: Double, option: Boolean): Double {
        if(option)
            return ETHorZEC * cryptoModel.ETHtoZEC;
        return ETHorZEC / cryptoModel.ETHtoZEC;
    }

    fun LTCtoZEC(LTCorZEC: Double, option: Boolean): Double {
        if(option)
            return LTCorZEC * cryptoModel.LTCtoZEC;
        return LTCorZEC / cryptoModel.LTCtoZEC;
    }
}