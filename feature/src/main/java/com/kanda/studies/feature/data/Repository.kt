package com.kanda.studies.feature.data

import com.kanda.studies.feature.data.ApiService

class Repository(private val apiService: ApiService) {
    suspend fun getCountries() = apiService.getCountries()
}