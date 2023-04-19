package com.kanda.studies.feature.data

import retrofit2.http.GET

interface ApiService {

    @GET("region/europe")
    suspend fun getCountries(): List<Country>
}