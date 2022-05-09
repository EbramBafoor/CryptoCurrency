package com.bafoor.cryptocurrency.presentation.coin_details

import com.bafoor.cryptocurrency.domain.model.CoinDetail

data class CoinDetailListState(
    val isLoading : Boolean = false,
    val coin : CoinDetail? = null,
    val error : String = ""
)
