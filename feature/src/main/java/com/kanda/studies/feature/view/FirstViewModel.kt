package com.kanda.studies.feature.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kanda.studies.feature.data.Country
import com.kanda.studies.feature.data.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FirstViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

    private val _flow = MutableSharedFlow<List<Country>>()
    val countries: SharedFlow<List<Country>> = _flow

    fun list() {
        viewModelScope.launch {
            try {
                val countriesResponse = repository.getCountries()
                _flow.emit(countriesResponse)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

}