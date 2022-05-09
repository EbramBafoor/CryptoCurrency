package com.bafoor.cryptocurrency.data.remote.dto


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Whitepaper(
    @Expose
    val link: String,
    @Expose
    val thumbnail: String
)