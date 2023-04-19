package com.kanda.studies.feature.data

import kotlinx.serialization.Serializable

@Serializable
data class Country(
    val name: String,
    val capital: String
)