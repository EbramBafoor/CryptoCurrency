package com.bafoor.cryptocurrency.domain.repository

import com.bafoor.cryptocurrency.data.remote.dto.CoinDetailDto
import com.bafoor.cryptocurrency.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins() : List<CoinDto>

    suspend fun getCoinById(coinId : String) : CoinDetailDto
}