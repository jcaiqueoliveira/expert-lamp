package com.kanda.studies.feature.data

import kotlinx.serialization.json.Json

val jsonBuilder = Json {
    ignoreUnknownKeys = true
}