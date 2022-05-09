package com.bafoor.cryptocurrency.data.remote.dto


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Tag(
    @SerializedName("coin_counter")
    @Expose
    val coinCounter: Int,
    @SerializedName("ico_counter")
    @Expose
    val icoCounter: Int,
    @Expose
    val id: String,
    @Expose
    val name: String
)