package com.bafoor.cryptocurrency.data.remote.dto


import com.bafoor.cryptocurrency.domain.model.Coins
import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class CoinDto(
    @Expose
    val id: String,
    @SerializedName("is_active")
    @Expose
    val isActive: Boolean,
    @SerializedName("is_new")
    @Expose
    val isNew: Boolean,
    @Expose
    val name: String,
    @Expose
    val rank: Int,
    @Expose
    val symbol: String,
    @Expose
    val type: String
){
    fun toCoin() : Coins{
        return Coins(
            id = id,
            isActive = isActive,
            name = name,
            rank = rank,
            symbol = symbol
        )
    }
}


