package com.bafoor.cryptocurrency.data.remote.dto


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Stats(
    @Expose
    val contributors: Int,
    @Expose
    val followers: Int,
    @Expose
    val stars: Int,
    @Expose
    val subscribers: Int
)