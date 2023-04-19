package com.kanda.studies.feature.data

import kotlinx.serialization.Serializable

@Serializable
data class Country(
    val name: CountryName,
    val capital: List<String>
)

@Serializable
data class CountryName(
    val common: String
)