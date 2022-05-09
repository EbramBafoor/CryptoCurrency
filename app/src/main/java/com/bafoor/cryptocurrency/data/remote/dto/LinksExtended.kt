package com.bafoor.cryptocurrency.data.remote.dto


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class LinksExtended(
    @Expose
    val stats: Stats,
    @Expose
    val type: String,
    @Expose
    val url: String
)