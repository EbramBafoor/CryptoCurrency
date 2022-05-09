package com.bafoor.cryptocurrency.data.remote.dto


import com.bafoor.cryptocurrency.domain.model.CoinDetail
import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class CoinDetailDto(
    @Expose
    val description: String,
    @SerializedName("development_status")
    @Expose
    val developmentStatus: String,
    @SerializedName("first_data_at")
    @Expose
    val firstDataAt: String,
    @SerializedName("hardware_wallet")
    @Expose
    val hardwareWallet: Boolean,
    @SerializedName("hash_algorithm")
    @Expose
    val hashAlgorithm: String,
    @Expose
    val id: String,
    @SerializedName("is_active")
    @Expose
    val isActive: Boolean,
    @SerializedName("is_new")
    @Expose
    val isNew: Boolean,
    @SerializedName("last_data_at")
    @Expose
    val lastDataAt: String,
    @Expose
    val links: Links,
    @SerializedName("links_extended")
    @Expose
    val linksExtended: List<LinksExtended>,
    @Expose
    val message: String,
    @Expose
    val name: String,
    @SerializedName("open_source")
    @Expose
    val openSource: Boolean,
    @SerializedName("org_structure")
    @Expose
    val orgStructure: String,
    @SerializedName("proof_type")
    @Expose
    val proofType: String,
    @Expose
    val rank: Int,
    @SerializedName("started_at")
    @Expose
    val startedAt: String,
    @Expose
    val symbol: String,
    @Expose
    val tags: List<Tag>,
    @Expose
    val team: List<TeamMember>,
    @Expose
    val type: String,
    @Expose
    val whitepaper: Whitepaper
) {

    fun toCoinDetail() : CoinDetail{
        return CoinDetail(
            coinId = id,
            name = name,
            description = description,
            symbol = symbol,
            rank = rank,
            isActive = isActive,
            tags = tags.map { it.name },
            team =team
        )
    }
}



