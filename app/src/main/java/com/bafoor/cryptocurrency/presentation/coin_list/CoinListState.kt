package com.bafoor.cryptocurrency.presentation.coin_list

import com.bafoor.cryptocurrency.domain.model.Coins

data class CoinListState(
    val isLoading : Boolean = false,
    val coins : List<Coins> = emptyList(),
    val error : String = ""
)
