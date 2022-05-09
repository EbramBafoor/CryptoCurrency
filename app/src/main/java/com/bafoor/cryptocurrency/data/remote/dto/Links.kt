package com.bafoor.cryptocurrency.data.remote.dto


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Links(
    @Expose
    val explorer: List<String>,
    @Expose
    val facebook: List<String>,
    @Expose
    val reddit: List<String>,
    @SerializedName("source_code")
    @Expose
    val sourceCode: List<String>,
    @Expose
    val website: List<String>,
    @Expose
    val youtube: List<String>
)