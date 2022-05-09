package com.bafoor.cryptocurrency.data.remote.dto


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class TeamMember(
    @Expose
    val id: String,
    @Expose
    val name: String,
    @Expose
    val position: String
)