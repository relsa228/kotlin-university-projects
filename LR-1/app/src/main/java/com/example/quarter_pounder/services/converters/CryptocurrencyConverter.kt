package com.example.quarter_pounder.services.converters

import com.example.quarter_pounder.models.CryptocurrencyModel

class CryptocurrencyConverter {
    //private val cryptoModel: CryptocurrencyModel = CryptocurrencyModel();

    fun ethToLTC(ETHorLTC: Double, option: Boolean): Double {
        if(option)
            return ETHorLTC * 0//cryptoModel.ethToLTC;
        return ETHorLTC / 0//cryptoModel.ethToLTC;
    }

    fun ethToZEC(ETHorZEC: Double, option: Boolean): Double {
        if(option)
            return ETHorZEC * 0//cryptoModel.ETHtoZEC;
        return ETHorZEC / 0//cryptoModel.ETHtoZEC;
    }

    fun ltcToZEC(LTCorZEC: Double, option: Boolean): Double {
        if(option)
            return LTCorZEC * 0//cryptoModel.LTCtoZEC;
        return LTCorZEC / 0//cryptoModel.LTCtoZEC;
    }
}